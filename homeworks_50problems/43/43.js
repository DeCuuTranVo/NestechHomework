/*
 * 43. Viết chương trình JavaScript/Java để kiểm tra trong ba số đã cho 
 * (số nguyên không âm) xem có hai hoặc tất cả các số đó có chữ số ngoài 
 * cùng bên phải giống nhau không.
 */

var args = process.argv.slice(2);
//console.log(args)

if (args.length == 0) {
    console.log("Please provide a string in command line");
}

var a = Number(args[0]);
var b = Number(args[1]);
var c = Number(args[2]);

function checkSimilarLastDigits(a, b, c) {
    var lastDigitA = a % 10;
    var lastDigitB = b % 10;
    var lastDigitC = c % 10;

    if ((lastDigitA == lastDigitB) && 
        (lastDigitB == lastDigitC) && 
        (lastDigitA == lastDigitB)) {
        return "Three similar";
    } else if ((lastDigitA == lastDigitB) || 
        (lastDigitB == lastDigitC) ||
        (lastDigitA == lastDigitB)) {
        return "Two similar";
    } else {
        return "No similar";
    }
}

console.log(checkSimilarLastDigits(a, b, c));