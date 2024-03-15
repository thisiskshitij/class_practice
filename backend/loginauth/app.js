//Middleware for authentication

//serve basic login page using HTML on /login route
//create a middleware  fn for auth in express.js validating user creds against a hardcoded db
//define a protected route '/profile' which requires auth for access, if auth successful , should display a personalised welcome msg
//additionally setup a public route '/' without auth displaying a generic welcome msg.
//ensure that auth middleware restricts access to the /profile route based on provided creds.



//Does not work 

// //Middleware to parse URL-encoded bodies
// app.use(express.urlencoded({ extended: true }));

// //simulated user DB
// const users = [
//     { id: 1, username: 'John', password: 'Wick' },
//     { id: 2, username: 'Babu', password: 'Rao' }
// ];

// //Middleware fn for auth
// app.use('/profile', (req, res, next) => {
//     //Extract username and password from request body
//     const { username, password } = req.body;

//     //Find user in DB
//     const user = user.find(u => u.username === username && u.password === password);

//     //If user is found, set it on the request object and proceed to next middleware
//     if (user) {
//         req.user = user;
//         next();
//     } else {
//         //If user is not found , send 401 Unauthorized response
//         res.status(401).send('Unauthorized');
//     }
// });

// //public route
// app.get('/', (req, res) => {
//     res.send('Welcome to the public route!');
// });

// // Route to serve login form
// app.get('/login', (req, res) => {
//     fs.readFile(__dirname + '/login.html', 'utf-8', 'utf-8', (err, data) => {
//         if (err) {
//             console.log(err);
//             res.send("Error Displaying Form");
//         } else {
//             res.send(data);
//         }
//     });
// });


// //protected route
// app.post('/profile', (req, res) => {
//     res.send(`Welcome ${req.user.username}!`);
// });

// //Start the server
// const port = 3000;
// app.listen(port, () => {
//     console.log(`Server is running on port ${port}`);
// });

const express = require('express');
const fs = require('fs');
const app = express();

// Middleware to parse URL-encoded bodies
app.use(express.urlencoded({ extended: true }));

// Simulated user DB
const users = [
    { id: 1, username: 'John', password: 'Wick' },
    { id: 2, username: 'Babu', password: 'Rao' }
];

// Middleware fn for auth
app.post('/login', (req, res, next) => {
    // Extract username and password from request body
    const { username, password } = req.body;

    // Find user in DB
    const user = users.find(u => u.username === username && u.password === password);

    // If user is found, set it on the request object and proceed to next middleware
    if (user) {
        req.user = user;
        next();
    } else {
        // If user is not found, send 401 Unauthorized response
        res.status(401).send('Unauthorized');
    }
});

// Public route
app.get('/', (req, res) => {
    res.send('Welcome to the public route!');
});

// Route to serve login form
app.get('/login', (req, res) => {
    fs.readFile(__dirname + '/login.html', 'utf-8', (err, data) => {
        if (err) {
            console.log(err);
            res.send("Error Displaying Form");
        } else {
            res.send(data);
        }
    });
});

// Protected route
app.post('/profile', (req, res) => {
    res.send(`Welcome ${req.user.username}!`);
});

// Start the server
const port = 3000;
app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});



