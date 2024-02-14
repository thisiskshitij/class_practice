// // // console.log(x);
// // // //const and let behaves the same way in hoisting gives error. var outputs as undefined.

// // // //let x = 5; 
// // // var x = 5;
// // // //const x = 5;


// // //let and const are block level and var is function level 
// // function fun()
// // {
// //     if (true) // if block
// //     {
// //         let x = 5;
// //         console.log(x) // works inside block
// //     }
// //     //console.log(x)
// // }
// // fun();

// // // node "D:\projects\filename.js"  quotes are important for some reason.

// // hello();

// // function hello()
// // {
// //     console.log("Hello World!");
// // }

// // let a = "Ohio Coder";
// // console.log(typeof a);

// // let isOhioCoder = true;
// // console.log(typeof isOhioCoder);

// // let c = 420;
// // console.log(typeof c);


// // let person = {name: "Sankalp" , age: 2} 
// // console.log(person.age)

// // let fruits = [1,"banan","oramg"];
// // console.log(fruits[2]);

// for (var i=0;i<79;i++)
// {
//     console.log(i);
// }


// // entry control and exit control loop
// // while and do-while
// let count = 0;
// while (count<99)
// {
//     console.log(count)
//     count++
// }


// let person = { name: "John",age :30,occupation:"Developer"};
// for(let key in person)
// {
//     console.log(key+": "+person[key]);
// }


// let car={
//     make:"Toyota",
//     model:"Camry",
//     year:2022,
//     isElectric:false,
//     start: function (){
//         console.log("Engine started!");
//     }()
    
// }



// function Book(title,author,year)
// {
//     this.title = title;
//     this.author = author;
//     this.year = year;
// }
// let book1 = new Book("deez","guy himeself",1420);
// console.log(book1);


fruits=["cherry","kiwi"];
fruits.pop();

console.log(fruits)