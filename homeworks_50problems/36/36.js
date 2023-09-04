/*
 36. Viết chương trình JavaScript/Java kiểm tra xem chữ số cuối của 
 ba số nguyên dương có giống nhau hay không.
 */

 
 var args = process.argv.slice(2);
 //console.log(args)
  
 if (args.length == 0) {
     console.log("Please provide a string in command line");
 }
 
 var a = Number(args[0]);
 var b = Number(args[1]);
 var c = Number(args[2]);
 
 function checkLastDigit(a, b, c) {
     var lastDigitA = a % 10;
     var lastDigitB = b % 10;
     var lastDigitC = c % 10;
 
     if ((lastDigitA == lastDigitB) && 
         (lastDigitB == lastDigitC) && 
         (lastDigitC == lastDigitA)) {
         return true;
     }
 
     return false;
 }
 
 console.log(checkLastDigit(a, b, c));