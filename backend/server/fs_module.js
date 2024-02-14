const http = require('http');
const fs = require('fs');

const server = http.createServer((req,res)=>{
    if(req.url === "/"){
        //synchronously read the content from a file
        try {
            const data = fs.readFileSync('FileSystem/example/txt','utf-8');
            res.end('File Content: '+ data);
        } catch(err){
            console.error(err);
            res.end('Internal Server Error');
        }
    }
});
const port = 3000;
server.listen(port, ()=> console.log(`Server is running on http://localhost:${port}`));