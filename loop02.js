// //write a function that searches for an element in an array and return the index
// //  if the element is not present then return -1
// //1
// function SearchElement(num){
//     let arr = [5,2,6,9,8];
//     let result;
// for(let i=0; i<=arr.length; i++){
//    if(arr[i] == num ){
//    result=i;
//    break;
//    }else{
//     result = "-1";
//    }
// }
// console.log(result);
// }

// // SearchElement(7);

// //2
// function SearchElement(num,arr){
//     let result;
// for(let i=0; i<=arr.length; i++){
//    if(arr[i] == num ){
//    result=i;
//    break;
//    }else{
//     result = "-1";
//    }
// }
// console.log(result);
// }
// let arr = [5,2,6,9,8];
// SearchElement(26,arr);

// //write a function that return the number of negative numbers present in an array


// function SearchNegNum(arr){
//     let Finalarr=[];
//     for(let i=0; i<=arr.length; i++){
//         if(arr[i]<0){
//             Finalarr.push(arr[i]);
//         }
//     }
//     return Finalarr.length;
// }

// let arr = [2,5,66,12,9,8,1,5];
// let result = SearchNegNum(arr);
// console.log(result);


// // //write a function that returns the largest number in an array and second largest

// function SearchLargestElement(arr){
//     let largestNumber = arr[0];
//   for(let i=1; i<= arr.length ; i++){
//     if(largestNumber < arr[i]){
//         largestNumber = arr[i];
//     }
//     }
//     return largestNumber;
//   }
  
//   function searchSecLargNum(largestNumber,arr){
//     let firstLargNum = largestNumber;
//     let seclargestNumber = arr[0];
//   for(let i=1; i<= arr.length ; i++){
//     if(firstLargNum != arr[i]){
//          if(seclargestNumber < arr[i]){
//          seclargestNumber = arr[i];
//     }
//     }
//     }
//     return seclargestNumber;
//   }
  


// let arr = [5,2,8,7,6];
// let largestNumber = SearchLargestElement(arr);
// let secLargestNum = searchSecLargNum(largestNumber,arr);
// console.log(secLargestNum);

// //write a function that returns the smallest number in an array and secondlargest

// function SearchSmallestElement(arr){
//     let SmallestNumber = arr[0];
//   for(let i=1; i<= arr.length ; i++){
//     if(SmallestNumber > arr[i]){
//         SmallestNumber = arr[i];
//     }
//     }
//     return SmallestNumber;
//   }
//   function searchSecSmallElement(FirstSmallnum,arr){
//     let FirstSmallestNumber =FirstSmallnum;
//     let secondSmallNum = arr[0];
//   for(let i=1; i<= arr.length ; i++){
//     if(FirstSmallestNumber != arr[i]){
//         if(secondSmallNum > arr[i]){
//            secondSmallNum = arr[i];
//     }
//     }
//     }
//     return secondSmallNum;
//   }


// let arr = [5,2,8,,4,6];
// let firstsmallestnumber = SearchSmallestElement(arr);
// let secondSmallnum = searchSecSmallElement(firstsmallestnumber,arr);
// console.log(secondSmallnum);

// //Akshay Logic for Second Largest in array
function SearchSecondElement(arr){
    let firstnum = -Infinity;
    let secNum = -Infinity;
  for(let i=1; i<= arr.length ; i++){
    if(firstnum < arr[i]){
        secNum = firstnum;
        firstnum = arr[i];
    }else if(secNum < arr[i]){
      secNum = arr[i];
    }
    }
    return secNum;
  }

let arr = [8,3,4,4];
let result = SearchSecondElement(arr);
console.log(result);