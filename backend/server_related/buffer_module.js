// Using buffer module

// // creating a buffer of size 4 bytes
// const buffer = Buffer.alloc(4);

// // by default has value as : 00 00 00 00
// console.log(buffer);

// // writing value to buffer
// buffer.write('Hello','utf-8');
// const data = buffer.toString('utf-8');
// console.log(data);

// // now buffer has value of 48 65 6c 6c
// console.log(buffer);





// const buffer1 = Buffer.from('Hello','utf-8');
// const buffer2 = Buffer.from(' World','utf-8');

// // concatenating bufferes

// const concatenatedBuffer = Buffer.concat([buffer1,buffer2]);

// console.log(concatenatedBuffer.toString('utf-8'));
// // Output : Hello World
// console.log(concatenatedBuffer);



const buffer1 = Buffer.from('Hello ','utf-8'); 
const buffer2 = Buffer.from('Nega','utf-8'); 



// const concate = Buffer.concat([buffer1,buffer2]);
// const data = concate.toString('utf-8');
// console.log(data);

const data = Buffer.concat([buffer1,buffer2]);
const stri = data.toString('utf-8')
console.log(stri);