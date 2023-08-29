/*
 28. Viết chương trình JavaScript/Java để kiểm tra xem 
 hai giá trị số nguyên đã cho có nằm trong khoảng 50..99 (bao gồm cả) hay không. 
 Trả về true nếu một trong số chúng nằm trong phạm vi.
 */

var args = process.argv.slice(2);
//console.log(args)

if (args.length == 0) {
    console.log("Please provide a string in command line");
}
var a = Number(args[0]);
var b = Number(args[1]);

function checkNum(a, b) {
    var aIn = (50 <= a) && (a <= 99);
    var bIn = (50 <= b) && (b <= 99);
    return aIn || bIn;
}

console.log(checkNum(a, b));