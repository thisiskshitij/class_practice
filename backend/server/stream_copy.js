// read stream from one file copy to another.


//Inefficient method


// const http = require('http');
// const fs = require('fs');

// //server

// const server = http.createServer((req, res) => {
//     if (req.url === '/') {
//         let data = ''; // Initialize data variable
//         const readableStream = fs.createReadStream('example1.txt', { encoding: 'utf-8', highWaterMark: 64 });

//         readableStream.on('data', (chunk) => {
//             data += chunk; // Append chunk to data
//         });

//         readableStream.on('end', () => {
//             const writableStream = fs.createWriteStream('example2.txt');
//             writableStream.write(data);
//             writableStream.end();
//         });
//     }
// }).listen(3100, () => {
//     console.log(`Port is active on 3100`);
// });



//Proper and efficient method

const fs = require ('fs');

const readableStream = fs.createReadStream('example.txt','utf-8');

const WritableStream = fs.createWriteStream('destination.txt');

readableStream.pipe(WritableStream);

WritableStream.on('finish',()=>{
    console.log("Data piped successfully from source to dest");
})