#
# Cutom Environment Variables for Tomcat
#
############################################

# -server
#  Select the java HotSpot Server JVM
# The 64-bit version of the JDK support only the Server VM,
# so in that case the option is implicit
# ... so it's redundant to today's world but it make me feel good.
export JAVA_OPTS="-server"

# -Xms/Xmx
#   Xms Sets the initial size of the Heap
#   Xmx sets the Maximum size of the Heap.
#  http://stackoverflow.com/questions/16087153/what-happens-when-we-set-xmx-and-xms-equal-size
#  http://crunchify.com/jvm-tuning-heapsize-stacksize-garbage-collection-fundamental/
export JAVA_OPTS="$JAVA_OPTS -Xms256M -Xmx256M"

# -NewSize/MaxNewSize
#  Set the size of the young generation
#  Most newly created objects are made here
#  Objects taht did not become unreachbale and survice the young
# Generation heap are copied to the Old Generation
export JAVA_OPTS="$JAVA_OPTS -XX:NewSize=128m -XX:MaxNewSize=128m"

# -PermSize/MaxPermSize
#  Store classes and interned character strings
# http://stackoverflow.com/questions/12114174/what-does-xxmaxpermsize-do
#   Warning!
#  Decprecated in Java 8!!  replace -XX:MetaspaceSize  !!!
export JAVA_OPTS="$JAVA_OPTS -XX:MaxMetaspaceSize=56m"

# -UseConcMarkSweepGC
#  Also called the low latency GC since pausing time is very short
# When this is enabled it also enabled
#   -XX:+UseParNewGC Potentially speed up your generation GC
#   by a factor equal to the number of CPUS
export JAVA_OPTS="$JAVA_OPTS -XX:+UseConcMarkSweepGC"


# -CMSClassUnloadingEnabled
#   In an old school java program classes are forever.  But with
# Modern languages like Groovy... Classes are created at runtime, every
# scirpt may create a few new classes.  With this set the PermGen space will
# Be garbage collecte3d.  Without this you have a memory Leak.
#
#  Must also have UseConcMarkSweepGC set for this to work.
export JAVA_OPTS="$JAVA_OPTS -XX:+CMSClassUnloadingEnabled"


# -DisableExlicitGC
#  Explicit calls to System.gc() are completely ignored
export JAVA_OPTS="$JAVA_OPTS -XX:+DisableExplicitGC"

# -HeapDumpPath
#   Set the file where the heap dump will write out its error
export JAVA_OPTS="$JAVA_OPTS -XX:HeapDumpPath=/var/logs/tomcat8/java_heapdump_pid_%p.log"

# -java.awt.headless
#  Basically tell the JVM not to load awt libraries
#  Your server is not a desktop app, there is more to this rule than that.
export JAVA_OPTS="$JAVA_OPTS -Djava.awt.headless=true"

export CATALINA_OPTS="$CATALINA_OPTS -Dcom.sun.management.jmxremote"
export CATALINA_OPTS="$CATALINA_OPTS -Dcom.sun.management.jmxremote.port=9090"
export CATALINA_OPTS="$CATALINA_OPTS -Dcom.sun.management.jmxremote.authenticate=false"
export CATALINA_OPTS="$CATALINA_OPTS -Dcom.sun.management.jmxremote.ssl=false"
export CATALINA_PID="$CATALINA_BASE/bin/catalina.pid"