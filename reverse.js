//Given a signed 32-bit integer x, return x with its digits reversed.
//  If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], 
// then return 0.

 function reverseNumber (x) {
    let rx = Math.abs(x);
    let rev = 0;
    while(rx > 0){
        let rem = Math.floor(rx%10);
        rev = (10*rev)+rem;
        rx = Math.floor(rx/10);
    }
    if(x<0){
        rev = "-"+ rev;
    }
    if(rev < -(2 ** 31) || rev > (2 ** 31) - 1){
        return 0;
    }
    return Number(rev);
};
console.log(reverseNumber(-1324));