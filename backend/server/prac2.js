const http = require('http');
const fs = require('fs');



const server = http.createServer((req,res)=>{
const readableStream = fs.createReadStream('example.txt','utf-8');
readableStream.pipe(res );
}).listen(3120,()=>{
    console.log(`The server be running at http://localhost:3120`)
});