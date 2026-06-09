//mine
// function reverseString (s) {
//     let x = s.length-1;
//     let xcopy;
    
//         if(s.length%2 == 0){
//             for(let i=0;i<s.length/2;i++){
//             if(x<s.length/2){
//                break;
//             }else{
//                 xcopy = s[i];
//                 s[i] = s[x];
//                 s[x] = xcopy;
//                 x--;
//             }
//         }
//         }else{
//             for(let i=0;i<s.length;i++){
//             if(i==x){
//                 break;
//             }else{
//                 xcopy = s[i];
//                 s[i] = s[x];
//                 s[x] = xcopy;
//                 x--;
//             }
//         }
    
//     }
//     return s;
// };
// console.log(reverseString(["H","a","n","n","a","h"]))

//sirs
 function reverseString (s) {
    let x = s.length-1;
    for(let i=0; i<s.length/2;i++){
        let temp = s[i];
        s[i] = s[x-i];
        s[x-i] = temp;
    }
    return s;    
};
console.log(reverseString(["H","a","n","n","a"]))