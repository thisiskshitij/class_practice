//Create and express.js app with routes for user profile(/profile) and checkout(/checkout).
//Implement a middleware function for auth that checks if a user is logged in before grandting access to the profile
//and /checkout routes.Asssume that user auth details are stored in a simulated DB.
//Implement a loggin middleware function to log details about incoming requests(such as URL,HTTP method,timestamp)and responses(status code,response time) for all routes.
//Ensure that the middleware functions are applied to the appropriate routes to enforce auth and logging.
//Test the app by sending............

const express = require('express');
const fs = require('fs');

let autheniticated = false;
app.use('/submit', (req, res, next) => {
    const req_time = new Date.now();
    const date = new Date();
    const method = req.method;
    const url = req.url;
    const res_time = Date.now() - req_time;

    fs.appendFile('request.log'+ method +" "+url+" "+res_time+" "+" ");
    if(err){
        console.log(err);
    }
})
if(req.body.name == 'user' && req.body.password == 'user123'){
    autheniticated=true;
    if(req.url=='/profile')
        res.redirect('/profile')
}else if{
    (req.url == '/checkout'){
        res.redirect('checkout')
    }
}else{
    res.redirect('/login');
}
})