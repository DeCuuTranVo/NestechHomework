/*
 40. Viết chương trình JavaScript/Java để kiểm tra từ hai số nguyên đã cho xem một trong 
 số chúng là 8 hay tổng hoặc hiệu của chúng là 8.
 */

 
var args = process.argv.slice(2);
//console.log(args)

if (args.length == 0) {
    console.log("Please provide a string in command line");
}

var a = Number(args[0]);
var b = Number(args[1]);


function checkNum(a, b) {
    if ((a === 8) || 
        (b === 8) || 
        (a+b === 8) || 
        (Math.abs(a-b) === 8)) {
        return true;
    } else {
        return false;
    }
}

console.log(checkNum(a, b));