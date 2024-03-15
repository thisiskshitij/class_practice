const http = require('http');
const fs = require('fs');
const querystring = require('querystring');

const server = http.createServer((req, res) => {
    // res.end("Hello this is node server");
    if(req.url=="/"){
        fs.readFile('data.json','utf-8',(err,data)=>{
           if(err){
            console.err(err);
            res.end("Internal server error");
            return;
           }
           res.writeHead(200,{'content-type':'applciation/json'});
           res.end(data);
        })
    }
    //handle other routes
else{
    res.writeHead(400,{'content-type':'text/plain'});
    res.end('Not found');
}


}).listen(4358, () => { console.log(`This is server be running @ http://localhost:4358`) });











//Using event listeners

// const EventEmitter = require('events');
// const myEmitter = new EventEmitter();

// myEmitter.on("first event", (arg1, arg2) => {
//     console.log("first event occured with args: ", arg1, arg2);
// });
// myEmitter.emit("first event",'hello','hi');

// const EventEmitter = require('events');
// const myEmitter = new EventEmitter;

 

// myEmitter.once('first event',(args1,args2)=>{
//     console.log("Event occured with",args1,args2);
// }) // omly emits omce no matta how many times u tra

// // myEmitter.emit('first event','hello','hi');
// // myEmitter.emit('first event','hello','hi');
// // myEmitter.emit('first event','hello','hi');

// myEmitter.on('first event',(args1,args2)=>{
//     console.log("Event occured with",args1,args2);
// })


// const eventHandler = (args1,args2)=>{
//     console.log("Even occured with args: ",args1,args2)
// };

// myEmitter.on('second evemt',eventHandler);

// myEmitter.emit('second evemt','hemlo','guyms')






