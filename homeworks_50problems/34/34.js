/*
 34. Viết chương trình JavaScript/Java tìm số lớn nhất trong hai số nguyên dương 
 đã cho. Hai số nằm trong khoảng 40..60.
 */

var args = process.argv.slice(2);
//console.log(args)
 
if (args.length == 0) {
    console.log("Please provide a string in command line");
}

var a = Number(args[0]);
var b = Number(args[1]);

function checkNumAndMax(a, b) {
    var aIn = Boolean(((40 <= a) && (a <= 60)));
    var bIn = Boolean(((40 <= b) && (b <= 60)));

    if (aIn && bIn) {
        return Math.max(a, b);
    } else if (aIn && !bIn) {
        return a;
    } else if (!aIn && bIn) {
        return b;
    } else  { //(!aIn && !bIn)
        return -1;
    }
}

var maxNum = Number(checkNumAndMax(a, b));
if (maxNum === -1) {
    console.log("Either a nor b are in range [40,60]");
} else {
    console.log("Max and within-ranged number: " + maxNum);
}