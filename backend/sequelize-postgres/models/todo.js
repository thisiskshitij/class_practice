const{DataTypes} = require('sequelize');
const sequelize = require('../sequelize');

const Todo = sequelize.define('Todo',{
    id: {
        type :DataTypes.INTEGER,
        primaryKey = true,
        autoIncrement = true
    },
    title: {
        type : DataTypes.STRING,
        allowNull: false
    },
})