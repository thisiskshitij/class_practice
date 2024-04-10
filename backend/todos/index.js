const express = require("express");
const {Pool} = require("pg");

const app = express();
const port = 3000;

const pool = new Pool({
    user: 'postgres',
    host: "localhost",
    database: 'todos',
    password: '123',
    port: 6969,
});

app.use(express.json());

//GET all todos
app.get('/todos',(req,res)=>{
    pool.query('SELECT * FROM todos',(error,result)=>{
        if(error){
            console.error("Error fetching todos",error);
            res.status(500).json({error: 'Internal server error'});
        }else{
            res.json(result.rows);
        }
    })
})

//POST a new todo
app.post('/todos',(req,res)=>{
    const{title,completed} = req.body;
    pool.query('INSERT INTO todos (title,completed) VALUES ($1,$2)'),[title,completed],(error)=>{
        if(error){
            console.error('Error creating todo',error);
            res.status(500).json({error : 'Internal server error'});
        }else{
            res.status(201).json({message:'Todo created successfully'});
        }
    }
});
//PUT update todo
app.put('/todos/:id',(req,res)=>{
    const {id} = req.params;
    const{title,completed} = req.body;

    pool.query('UPDATE todos SET title = $1 , completed = $2 WHERE id = $3',[title,completed,id],(error)=>{
        if (error){
            console.error('Error updating todo',error);
            res.status(500).json({error: 'Internal server error'});
        }else{
            res.json({message:'updated successfully'});
        }
    });
});

app.listen(port,()=>{
    console.log('server running on 3000');
})