const fs = require('fs');
// const readableStream = fs.createReadStream('example.txt',{encoding: 'utf-8',highWaterMark: 1000});

// readableStream.on('data',(chunk)=>{
//     console.log('Recieved chunk of data:');
//     console.log(chunk);
// });

// readableStream.on('end',()=>{
//     console.log('Finished reading data from the file');
// });

// readableStream.on('error',(err)=>{
//     console.error('Error reading data:',err);
// })




// Below code is about writeable stream which currently does not work, fix it by FEB 21,2024
// fixed the below code works now !!


const writableStream = fs.createWriteStream('output.txt');

//Create a writabe stream to write data to a file.
const data = 'Hello, world';

//Data to be written
writableStream.write(data);

//End the writable stream to indicate that no more data will be written
writableStream.end();