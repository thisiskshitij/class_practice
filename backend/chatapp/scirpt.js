// const express = require('express');
// const socketIO=require('socket.io');
// const path = require('path');
// const app=express();
// const server = app.listen(3000,()=>{
//     console.log("Server started")
// });

// const io = socketIO(server);
// app.use(express.static(path.join(__dirname,)))
// io.on('connection',(socket)=>{
//     console.log("A user has connected to server");
//     socket.on('chat',msg);
//     io.emit('chat msg')
// })

const express = require('express');
const socketIO = require('socket.io');
const path = require('path');

const app = express();
const server = require('http').createServer(app);
const io = socketIO(server);

app.use(express.static(path.join(__dirname, '/')));

io.on('connection', (socket) => {
    console.log('A user has connected to the server');

    socket.on('chat', (msg) => {
        io.emit('chat message', msg);
    });

    socket.on('disconnect', () => {
        console.log('A user has disconnected from the server');
    });
});

app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'public', 'index.html'));
});

server.listen(3100, () => {
    console.log('Server started on port 3100');
});

