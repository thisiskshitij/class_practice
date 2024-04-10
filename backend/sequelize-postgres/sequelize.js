const {Sequelize} = require('sequelize');

//first parameter is db name , second is username, 3rd
const sequelize = new Sequelize('todos','postgres','root',{
    host : 'localhost',
    dialect:'postgres',
});

module.exports = sequelize;


app.delete('/todos/:id',(req,res)=>{
    const todoId = req.params.id;
    todoId.findByPk(todoId).then(todo=>{
        if(!todo){
            res.status(404).json({error: "Todo not found"});
        }
        //Delete todo

        return todo.destroy();
    })
    .then(()=>{
        res.status(204).end();
    })
    .catch(error=>{
        res.status(500).json({error: 'Internal server error'});
    });
});