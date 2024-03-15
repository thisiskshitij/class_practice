// to recieve data from a html form

const http = require('http');
const fs = require('fs');

//to convert url encoded format to string import querystring
const queryString = require('querystring');


const server = http.createServer((req,res)=>{
    if(req.url=="/"){
        fs.readFile('sample.html',(err,data)=>{
            if (err){
                console.log(err);
                res.end("check console");}

            else{
                res.end(data);
            }

        })
    }
    else if(req.url=="/save-json"){
        let body ="";
        req.on('data',(chunk)=>{
            body = body+chunk;
            console.log(body);
        })

        
        req.on('end',()=>{
            // const newData = queryString.parse(body).data; is for accessing the [Object: null prototype] { data: 'Hello World\r\n' } key from it which is data
            const newData = queryString.parse(body).data;
            console.log(newData);


            // writing data to text file
            fs.writeFile('formdatarecieved.txt',newData,'utf-8',(err)=>{
                if(err){
                    console.log("There was an error");
                }
                else{
                    console.log("Data saved successfully");
                }
            })
 
            

// output : [Object: null prototype] { data: 'Hello World\r\n' }  
// data: is like this cuz of textarea variable,
// when we recieve the data it is attached to that textarea variable

        })
    }
}).listen(5000);