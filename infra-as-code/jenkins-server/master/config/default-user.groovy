#!groovy

import jenkins.model.*
import hudson.security.*

def env = System.getenv()

def jenkins = Jenkins.getInstance()
def hudsonRealm = new HudsonPrivateSecurityRealm(false)

hudsonRealm.createAccount(env.JENKINS_USER, env.JENKINS_PASS)
jenkins.setSecurityRealm(hudsonRealm)
jenkins.setAuthorizationStrategy(new FullControlOnceLoggedInAuthorizationStrategy())

jenkins.setInstallState(InstallState.INITIAL_SETUP_COMPLETED)
jenkins.getAuthorizationStrategy().add(Jenkins.ADMINISTER, env.JENKINS_USER)
jenkins.save()
