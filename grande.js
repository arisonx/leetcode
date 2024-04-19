const nums  = [1,3,4,5,56,78,9,0];


function On(){
  //O(n) time
  //O(1) perf
  for(const num of nums){
   // O(1*n) =  O(n)
    console.log(num);
}}

const o500=()=>{
for (const num of nums){
  // O(n) TIME
  // O(1) PERF

    for (i=0; i<500; i++){
    // O(500) time  
    // O(500) = O(1) =  O(n)
     console.log(num);
}}}



function on2 (){

  for (const num1 of nums){
  
  for(const num2 of nums ){
  
  console.log(num1*num2);

}}}



let arr = [2,4,5,6,6,7,7];


function twopointers (arr){
  let esquerda = 0;
  let direita  =  arr.length -1;
   
  while (esquerda<direita){
    
    esquerda++; direita--
  }

}



let string = "abcdcba";

function palindromo (str){

  let ispalindromo =  str.split('').reverse().join('') === str;
  console.log(ispalindromo)

  console.log(str.split('').reverse().join(''));
  // separa por '' após inverte a ordem, após junta tudo e remove os ''
  
}

//ou

/**
 * @param {string} s 
 * @return {boolean}
 */
function checkIfPalindrome (s){

  let left = 0;
  let right = s.length -1;

  while(left<right){
    console.log(s[left]!== s[right]); //checa se os 3 primeiros caracteres invertidos
    // são iguals, assim provando que é um palindromo ou não.
    if(s[left]!==s[right]){
      console.log('is not a palindrome');
      return false
    }else{
      console.log("is a palindrome");
    }
    left++;
    right--;
  }
  return true
}

checkIfPalindrome(string);
