// creating a server blyat

const http = require('http');
const fs = require('fs');


http.createServer((req,res)=>{
    
if(req.url=="/"){
    fs.readFile('sample.txt','utf-8',(err,data)=>{
        if (err){
            console.error(err);
            res.end("There was some error, check the console");
        }
        else{
            res.end(data);
        }
    

}



});


else if(req.url == "/write"){
    const message = "Hello";
    fs.writeFile('sample2.txt',message,'utf-8',(err)=>{
        if(err){
            res.end("There was some error");
        }else{
            res.end("Everything was good")
        }
    })
}




}).listen(4000,()=>{
    console.log("Server is running on port 4000");
});
