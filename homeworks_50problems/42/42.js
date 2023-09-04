/*
42. Viết chương trình JavaScript/Java để kiểm tra xem ba số đã 
cho đang tăng theo strict hoặc soft mode.  
Lưu ý: strict mode -> 10, 15, 31 : soft mode -> 24, 22, 31 hoặc 22, 22, 31
 */

var args = process.argv.slice(2);
//console.log(args)

if (args.length == 0) {
    console.log("Please provide a string in command line");
}

var a = Number(args[0]);
var b = Number(args[1]);
var c = Number(args[2]);

function checkIncrement(a, b, c) {
    if ((a < b) && (b < c)) {
        return "Strict Mode";
    } else if (a < c) {
        return "Soft Mode";
    } else {
        return "Not Increase";
    }
}

console.log(checkIncrement(a, b, c));