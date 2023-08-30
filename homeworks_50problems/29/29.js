/*
 29. Viết chương trình JavaScript/Java để kiểm tra xem ba giá trị số nguyên 
 đã cho có nằm trong khoảng 50..99 (bao gồm cả) hay không. 
 Trả về true nếu một hoặc nhiều trong số chúng nằm trong phạm vi đã chỉ định.
 */

 var args = process.argv.slice(2);
//console.log(args)

if (args.length == 0) {
    console.log("Please provide a string in command line");
}
var a = Number(args[0]);
var b = Number(args[1]);
var c = Number(args[2]);

function checkNum(a, b, c) {
    var aIn = (50 <= a) && (a <= 99);
    var bIn = (50 <= b) && (b <= 99);
    var cIn = (50 <= c) && (c <= 99);
    return aIn || bIn || cIn;
}

console.log(checkNum(a, b, c));