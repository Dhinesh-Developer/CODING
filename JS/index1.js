// How to accept user input.

// let username;
// username = window.prompt("What is your name?")
// console.log(username);

// let username;
// document.getElementById("mySubmit").onclick = function(){
//     username=document.getElementById("myText").value;
//     document.getElementById("myH1").textContent = `Hello ${username}`
//     console.log(username);
// }

// Type conversion

// let age =window.prompt("How old are you?");
// age = Number(age);
// age+=1;
// console.log(age,typeof age);

let x = "pizza";
let y ="pizza";
let z = "pizza";

x = Number(x);
y = Boolean(y);
z = String(z);

console.log(x, typeof x);
console.log(y, typeof y);
console.log(z, typeof z);

// const = a variable that can't be changed

const PI = 3.14159;
let radius;
let circumferences;

// radius = window.prompt(`Enter the radius of a circle`);
// radius = Number(radius);
// circumferences = 2*PI*radius;
// console.log(circumferences);
/**NaN 'number'
index1.js:30 true 'boolean'
index1.js:31 pizza string
index1.js:42 615.75164 */

// document.getElementById("mySubmit").onclick = function(){
//     document.getElementById("myText").value;
//     radius = Number(radius);
//     circumferences = 2*PI*radius;
//     document.getElementById("myH3").textContent=circumferences +" cm";
// }

// Counter program
const decreaseBtn = document.getElementById("decreaseBtn");
const increaseBtn = document.getElementById("increaseBtn");
const resetBtn = document.getElementById("resetBtn");
const countlabel = document.getElementById("countlabel");

let count = 0;

increaseBtn.onclick = function(){
    count++;
    countlabel = count;
}

decreaseBtn.onclick = function(){
    count--;
    countlabel = count;
}






