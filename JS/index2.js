// // Math  -> Day 3

// console.log(Math.PI)
// let x = 3.21;
// let y = 2;
// let z;
// z = Math.round(x);
// z = Math.floor(x);
//  z = Math.ceil(x);
// console.log(z); 

// z = Math.pow(x,y);
// console.log(z);
// z = Math.sqrt(x);
// z = Math.log(x);
// console.log(z);

// z = Math.sin(x);
// z = Math.cos(x);
// z= Math.tan(x);
// console.log(z);
// z = Math.abs(y);
// z = Math.sign(x);

// let max = Math.max(1,2,3,4,5,6,7,8,9,10);
// console.log(max);


// // Random Number Generated
// let randomNumber = Math.floor(Math.random()*6);
// console.log(randomNumber);

// let ranNum = Math.floor(Math.random() * 100);
// console.log(ranNum);


// Random Number Generator
/**const myBtn = document.getElementById('myBtn');
const mylabel = document.getElementById('mylabel');
const min = 1;
const max = 6;
let randomNumber;

myBtn.onclick=function(){
    randomNumber = Math.floor(Math.random() * max);
    mylabel.textContent = randomNumber;
} */

//     // if condition
// let age = 18;
// if(age>=18){
//     console.log(`your age is accepted`)
// }else{
//     console.log(`Your age is nor in the limit`);
// }

// // if else condition
// let isStudent = true;
// if(isStudent){
//     console.log(`You are a student`);
// }else{
//     console.log(`You are not a student`);
// }

// let limit = 15;
// let hasLicense = false;
// if(age >=16){
//     console.log(`You are eligible for driving`);
//     if(hasLicense){
//         console.log(`you have a license`);
//     }else{
//         console.log(`y0u dont have a license`);
//     }
// }else{
//     console.log(`You are not eligible for driving`);
// }

// // if else if condition
// let mark = 90;
// if(age >= 90){
//     console.log(`you are a topper`);
// }else if(age >=50 && age < 90){
//     console.log(`your are a averge student`);
// }else{
//     console.log(`you are a pass student`);
// }

// const mytext = document.getElementById('mytext');
// const mylabel = document.getElementById('mylabel');
// const mysubmit = document.getElementById('mysubmit');
// const myp = document.getElementById('myp');
// let age1;
// mysubmit.onclick=function(){
//     age1 = mytext.value;
//     age = Number(age1);
//     if(age1>=100){
//         myp.textContent = `you are not eligible`;
//     }else if(age1 <10){
//         myp.textContent=`you are a child`;
//     }else{
//         myp.textContent=`eligible`;
//     }
// }


// const mycheckbox = document.getElementById('mycheckbox');
// const visabtn = document.getElementById('visabtn');
// const mastercardbtn = document.getElementById('mastercardbtn');
// const paypalbtn = document.getElementById('paypalbtn');

// const subres = document.getElementById('subres');
// const paymentres = document.getElementById('paymentres');

// s.onCLick=function(){
//     if(mycheckbox.checked){
//         subres.textContent = `You are subscribed`;
//     }else{
//         subres.textContent = `You are not subscribed`;
//     }

//     if(visabtn.checked){
//         paymentres.textContent = `You have selected visa card`;
//     }else if(mastercardbtn.checked){
//         paymentres.textContent = `You have selected master card`;
//     }else if(paypalbtn.checked){
//         paymentres.textContent = `You have selected paypal`;
//     }

// }

// ternary operator in js
let res = 10;
console.log(10>18?"greater":"smaller");

let age = 18;
let message = age >= 18 ? "Eligible" : "Not Eligible";
console.log(message);

let time = 16;
let greeting = time < 12 ? "Good morning" : "Good Afternoon";
console.log(greeting);

let student  = true;
let mess = student ? "You are a student" : "You are not a student";
console.log(mess);

let purchase = 125;
let discount = purchase > 100 ? "discount available":"discount not availabe";
console.log(discount);




