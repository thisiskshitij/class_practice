// //functions
// // declaring fn I: (stores returned value in this variable)
// const multiply = function(a,b)
// {
//     return a*b;
// };

// const product = multiply(4,6);
// console.log('Function Expression - Product:', product);

// // declaring fn II: (using the arrow )

// const subtract = (a,b) => a-b;

// const difference = subtract(452,399);
// console.log('Function Expression - Difference:', difference);


// // declaring fn the normal way
// function divide {
//     return (a/b);
// };
// divide()



// // Error handling
// try{
//     throw new Error("An error");
// }
// catch(error)
// {
//     console.error(error.message);

// }finally{
//     console.log("Cleanup code");
// }





//Timers in javascript
// methods - setInterval ,setTimeout , clearInterval ,clearTimeout

// const delayedFunction = () =>{
//     console.log("Delayed function executed after 2 secs!");
// };

// setTimeout(delayedFunction, 2000); //Executed after 2 seconds

// repeating code after every few seconds / interval 

// const repeatedFunction = () =>
// {
//     console.log('Repeated function executed!');

// };

// const intervalId = setInterval(repeatedFunction,3000)


//stop repeating function after certain amount of time
function repeatedFunction()
{
    console.log('Executing repeated function...');
}

const intervalId = setInterval(repeatedFunction,1000);

setTimeout(()=>{
    clearInterval(intervalId);
    console.log('Interval stopped.')
},5000);