let sentence="Hello I Love India"
//conveted into Array Formate
let sp=sentence.split(' ');
let reversed=[];
sp.forEach(element => {
    dummy=makeReverse(element);
    reversed.push(dummy)
});
function makeReverse(e){
   return e.split('').reverse().join('');
}
let result=reversed.join(' ')
console.log(result)

