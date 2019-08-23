const express = require('express');
const app = express();
const bodyParser = require('body-parser');

var client = require('node-rest-client').Client;

app.get('/', (req, res) => {
    res.send('Oh Hi There!');
});

app.post('/employee/register', function (req, res, next) {
	console.log('First API ...')

	var args = {
		path: {"empEmail": req.body.empEmail},
		headers: { "Content-Type": "application/json" }
	};

	client.get("http://dso-services/employees?empEmail=${empEmail}", args, function (data, response) {
		console.log(data);
		console.log(response);
		if(response.statusCode != 200) {
			next(err)
		}
	});

	var args1 = {
		data: {empId: req.body.empId, empEmail: req.body.empEmail, empPassword: req.body.empPassword, empFirstname: req.body.empFirstname, empLastname: req.body.empLastname, deptId: req.body.deptId, roleId: req.body.roleId},
		headers: { "Content-Type": "application/json" }
	};
	
	client.post("http://dso-services/employees", args1, function (data, response) {
		console.log(data);
		console.log(response);

		if(response.statusCode != 200) {
			next(err);
		} else {
			res.send("Registration Successful!");
		}
	});
});


app.post('/employee/authemticate', function (req, res, next) {

	var args2 = {
		data: {empEmail: empEmail, empPassword: empPassword},
		headers: { "Content-Type": "application/json" }
	};

	client.post("http://dso-services/employees", args2, function (data, response) {
		console.log(data);
		console.log(response);

		if(response.statusCode != 200) {
			next(err);
		} else {
			res.send("Authentication Successful!");
		}
	});
});



// catch 404 and forward to error handler
app.use(function(req, res, next) {
	next(createError(404));
});

// error handler
app.use(function(err, req, res, next) {
	res.locals.message = err.message;
	res.locals.error = req.app.get('env') === 'development' ? err : {};
	res.status(err.status || 500);
	res.render('error');
});

app.listen(3000, () => console.log('Listening on port 3000'));