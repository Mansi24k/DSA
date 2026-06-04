//27. Remove Element
//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed.
//  Then return the number of elements in nums which are not equal to val.

function removeElement (nums, val) {
    let x = nums.length-1;
    let k=0;  
    for(let i=0; i< nums.length ; i++){
       for(let j=x; j>=0 ; j--){
            if(nums[j] == val){
                 x = x-1;
             }else{
                break;
             }
       }
        if(nums[i]!=val){
            nums[i] = nums[i];
        }else{
            nums[i] = nums[x];
            x=x-1;
            k=k+1;
        }
    }
    return  nums.length-k;
};
console.log(removeElement([0,1,2,2,3,0,4,2],2))