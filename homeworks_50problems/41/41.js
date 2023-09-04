/*
 * 41. Viết chương trình JavaScript/Java để kiểm tra một bộ ba số; 
 * nếu ba số giống nhau trả về 30; 
 * ngược lại trả về 20; 
 * và nếu hai số giống nhau trả về 40.
 */

var args = process.argv.slice(2);
//console.log(args)

if (args.length == 0) {
    console.log("Please provide a string in command line");
}

var a = Number(args[0]);
var b = Number(args[1]);
var c = Number(args[2]);

function checkSimilar(a, b, c) {
    if ((a === b) && (b === c) && (c === a)) {
        return 30;
    } else if ((a !== b) && (b !== c) && (c !== a)) {
        return 20;
    } else {
        return 40;
    }
}

console.log(checkSimilar(a, b, c));