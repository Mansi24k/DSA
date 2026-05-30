
function Palindrome(x) {
       let count = "";
       let original=x;
 while(x>0){
        let r = Math.floor(x%10);
        count = count + r;
         x = Math.floor(x/10);
 }
 return console.log(count == original);
};

 Palindrome(121);
// function Palindrome(x) {
//     if (x < 0) return false;

//     let count = 0;
//     let original = x;

//     while (x > 0) {
//         let r = x % 10;
//         count = (10 * count) + r;
//         x = Math.floor(x / 10);
//     }

//     return count == original;
// }

// console.log(Palindrome(-101));