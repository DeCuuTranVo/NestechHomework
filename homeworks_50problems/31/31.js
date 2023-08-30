/*
 * 31. Viết chương trình JavaScript/Java tìm số lớn nhất trong ba số nguyên đã cho.
 */

var args = process.argv.slice(2);
//console.log(args)

if (args.length == 0) {
    console.log("Please provide a string in command line");
}
var a = Number(args[0]);
var b = Number(args[1]);
var c = Number(args[2]);

function maxNum(a, b, c) {
    return Math.max(a, b, c)
}

console.log(maxNum(a, b, c));
