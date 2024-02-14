// //function 1
// function parentFunction(name,callback){
//     callback();
//     console.log("Hey "+name);
// }

// //function 2
// function randomFunction(){
//     console.log("Hey I am callback function");
// }
// //callback function
// parentFunction("Random String",randomFunction);


// Now it is asynchronous 

// function parentFunction(name,callback){
//     setTimeout(callback,1000);
//     console.log("Hey "+name);


// // function randomFunction(){
// //     console.log("Hey I am callbackfunction");
// }

// // parentFunction("Random String",randomFunction);
// // below is anonymous function 

// // parentFunction("Random String",function(){
// //     console.log("Hey I am call back fn")});

//below is wrong
// parentFunction("Random String",rand=()=> {
//     return "Hey I am callback fn";
//   })

const parentFunction = (name,callback) => (setTimeout(callback,1000),console.log("Hey"+name));
parentFunction("Random String",() => console.log("Hey I am a callback Function"));



//NPM ------- Node Package Manager ------
