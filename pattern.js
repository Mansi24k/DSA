// //to print the pattern 
// /* 
// ****
// ****
// ****
// ****
// */
// let num = 4;
// for(let i=0; i< num; i++){
//     let row=" ";
//     for(let j=0; j<4; j++){
//        row = row+" *";
//     }
//     console.log(row);
// }

//to print the pattern 
/* 
*
**
***
****
*/

// let n=4;
// for(let i=0;i<n;i++){
//     let row =" ";
//     for(let j=0; j<=i;j++){
//          row = row+" *";
//     }
//     console.log(row);
// }

//to print the pattern 
/* 
1
12
123
1234
12345
*/

// let num = 5;
// for(let i=1; i<=num ; i++){
//     let row = " ";
//     for(let j=1; j<=i; j++){
//         row = row+j;
//     }
//     console.log(row);
// }

//to print the pattern 
/* 
1
22
333
4444
55555
*/

// let num = 5;
// for(let i=1; i<=num ; i++){
//     let row = " ";
//     for(let j=1; j<=i; j++){
//         row = row+i;
//     }
//     console.log(row);
// }


//to print the pattern 
/* 
12345
1234
123
12
1
*/

// let num = 5;
// for(let i=num; i>0; i--){
//     let row = " ";
//     for(let j=1; j<=i; j++){
//         row = row+j;
//     }
//     console.log(row);
// }

//to print the pattern 
/* 
     *
    **
   ***
  ****
 *****

*/

// let n =5;
// for(let i=1; i<=n;i++){
// let row = "";
//     for(let j =1; j<=n-i;j++){
//         row = row + " ";
//     }
//      for(let k =1; k<=i;k++){
//         row = row+ "*";
//     }
// console.log(row);
// }

//to print the pattern 
/* 
1
10
101
1010
10101
101010
*/

// let n = 6;
// for(let i =1 ; i<=n;i++){
// let row=" ";
// for(let j=1; j<=i; j++){
//     if(j%2==0){
//       row = row+"0";    
//     }
//     else{
//          row = row+"1";   
//     }
// }
// console.log(row);
// }


// let n =6;
// for (let i=0; i<n; i++){
// let row =" ";
// let toggle =1;
// for(let j=0; j<i+1;j++){
// row= row+toggle;
// if(toggle == 1){
// toggle = 0;
// }else{
// toggle = 1;
// }
// }
// console.log(row);
// }


//to print the pattern 
/* 
1
01
010
1010
10101
*/


// let n =5;
// let toggle =1;
// for (let i=0; i<n; i++){
// let row =" ";
// for(let j=0; j<i+1;j++){
// row= row+toggle;
// if(toggle == 1){
// toggle = 0;
// }else{
// toggle = 1;
// }
// }
// console.log(row);
// }



 function SecondLargestNum(s) {
    let arr2 = [...new Set(s.match(/\d/g))]; 
    console.log(arr2);
    if(arr2.length == 0 || arr2.length == 1){
        return -1;
    }
    let arr = arr2.map(Number);
     console.log(arr);
    let firstLargestNum = -Infinity;
    let secondLargestNum = -Infinity;
    for(let i=0; i<= arr.length; i++){
        if(firstLargestNum < arr[i]){
            secondLargestNum = firstLargestNum;
            firstLargestNum = arr[i];
        }else if(secondLargestNum < arr[i]){
            secondLargestNum = arr[i];
        }
    }
    return secondLargestNum;
};
let s="ck077";
let result = SecondLargestNum(s);
console.log(result);