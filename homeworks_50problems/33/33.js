/*
 33. Viết chương trình JavaScript/Java để kiểm tra xem 
 hai số có nằm trong khoảng 40..60 hoặc 70..100 hay không.
 */

var args = process.argv.slice(2);
//console.log(args)

if (args.length == 0) {
    console.log("Please provide a string in command line");
}
var a = Number(args[0]);
var b = Number(args[1]);

function checkNum(a, b) {
    var aIn = ((40 <= a) && (a <= 60)) || ((70 <= a) && (a <= 100));
    var bIn = ((40 <= b) && (b <= 60)) || ((70 <= b) && (b <= 100));
    return Boolean(aIn && bIn);
}

console.log(checkNum(a, b));