// creating a server blyat

const http = require('http');
const fs = require('fs');

// http.createServer().listen(4000);
// upto this part server is listening , go to localhost:4000 in browser
// it will show loading animation in chrome cuz server is listening 
// but server is not responding back , because we have not intialized response
// from the server..


// Now server responds with "Hi" String
// it takes two parameters req (from user) and res (to user from server)

http.createServer((req,res)=>{

// fs.readFile take two parameters file and encoding (to display text from binary)
// now two possible things can happen ,1 st - error (file not found or anything) 2nd - data(which was meant to be sent)
// so we pass two parameters (err,data) then put it in if else to choose from



// returning cat image

    // fs.readFile('cat.jpg',(err,data)=>{
    //     if (err){
    //         console.error(err);
    //         res.end("There was some error, check the console");
    //     }
    //     else{
    //         res.end(data);
    //     }
    // });}).listen(4000);





// returning a text file
    // fs.readFile('sample.txt','utf-8',(err,data)=>{
    //     if (err){
    //         console.error(err);
    //         res.end("There was some error, check the console");
    //     }
    //     else{
    //         res.end(data);
    //     }
    // });}).listen(4000);


// You can only send one response using res.end so commented res.end

    // res.end("Hi");
// }).listen(4000);




// returning html file

fs.readFile('forms.html',(err,data)=>{
    if (err){
        console.error(err);
        res.end("There was some error, check the console");
    }
    else{
        res.end(data);
    }

// });}).listen(4000);


});}).listen(4000,()=>{
    console.log("Server is running on port 4000");
});
