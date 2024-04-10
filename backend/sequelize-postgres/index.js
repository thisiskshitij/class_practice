const sequelize = require("./sequelize");

sequelize.authenticate().then(()=>{
    console.log('Connection established successfully.');

    return sequelize.sync({alter: true});
})
.then