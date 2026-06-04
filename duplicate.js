//leetcode: 29 -  Remove Duplicates from Sorted Array
// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
// The relative order of the elements should be kept the same.

function removeDuplicates (s){
      let  x = 0;
    for(let i=0; i< s.length ; i++){
       if(s[i] > s[x]){
                  x=x+1;
                s[x] = s[i];              
            }
    }
    return s;
};

console.log(removeDuplicates([0,0,1,1,1,2,2,3,3,4]))

