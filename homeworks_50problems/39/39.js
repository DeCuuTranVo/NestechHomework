/*
 39. Viết chương trình JavaScript/Java để tính tổng của hai số nguyên đã cho. 
 Nếu tổng nằm trong phạm vi 50..80 trả về 65 nếu không thì trả về 80.
 */

var args = process.argv.slice(2);
//console.log(args)

if (args.length == 0) {
    console.log("Please provide a string in command line");
}

var a = Number(args[0]);
var b = Number(args[1]);


function checkSum(a, b) {
    var sum = a + b;

    if ((sum >= 50) && (sum <= 80)) {
        return 65;
    } else {
        return 80;
    }
}

console.log(checkSum(a, b));