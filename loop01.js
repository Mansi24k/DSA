//for loop to print hello world
// for(let i=1; i<=3; i++){
// console.log("Hello World...");
// }

//calling function inside for loop
// function greet(){
//     console.log("Hello...");
// }
// for(i=0; i<=3; i++){
//  greet();
// }

// //for loop with array
// let arr = [1,2,3,4];
// for(let i=0; i<arr.length;i++){
//  console.log(arr[i]);
// }

//print all even number in an array
// let arr = [1,2,3,4,5,6,7,8,9];
// for(let i=0; i<arr.length;i++){
//  if(arr[i]%2 == 0){
//     console.log(arr[i]);
//  }
// }

//while loop
// let i=1; 
// while(i<=3){
// console.log("Hello...");
// i++;
// }

//1. Find prime numbers

// Easy

// 15m average time

// 80% success

// You are given a positive integer ‘N’. Your task is to print all prime numbers less than or equal to N.
// Note: A prime number is a natural number that is divisible only by 1 and itself. Example - 2, 3, 17, etc.
// You can assume that the value of N will always be greater than 1. So, the answer will always exist.
// Input Format:
// The input contains a single positive integer ‘N’.


// Output Format :
// Print single space-separated prime numbers less than or equal to ‘N’ in increasing order.

// Note :
// You do not need to print anything; it has already been taken care of. Just implement the function.
// Constraints:
// 2 <= N <= 10^7

// Where ‘N’ is the given positive integer.

function isprime(num){
 if(num<2)
    return false;
for(let i=2; i*i <=num; i++){
 if(num%i === 0){
 return false;
 }
 }
 return true;
}

function GivenN(N){
    let result=[];
   for(let i=2; i<=N; i++){
    if(isprime(i)){
        result.push(i);
    }
   }
   console.log(result.join());
}
GivenN(10);