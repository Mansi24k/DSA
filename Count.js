//write a function that return the count of digits in a number

function countDigits(n){
//testcase if n=0
if(n==0) return 1;

//testcase if n is negative
n = Math.abs(n);

let count=0;
while(n > 0){
n = Math.floor(n/10);
count++;
}
return count;
}

let num=-56314987;

let result=countDigits(num);

console.log(result);