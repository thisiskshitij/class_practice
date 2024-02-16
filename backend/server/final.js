const http = require('http');
const fs = require('fs');
const queryString = require('querystring');

const server = http.createServer((req,res)=>{
    if (req.url == "/"){
        fs.readFile('sample.html',(err,data)=>{
            if(err){
                console.log(err);
            }
            else{
                res.end(data);
            }
        })
    }
    else if (req.url == "/save-json") {
        let body="";
        req.on('data',(chunk)=>{
            body=body+chunk;
            console.log(body);
        })
        req.on('end',()=>{
            const newData = queryString.parse(body).data
            console.log(newData);

        fs.writeFile('rec.txt',newData,'utf-8',(err)=>{
            if(err)
            console.log("Went wrong");
        else{
            console.log("Written successfully");
        }
        })
        })
    }
}).listen(3200);