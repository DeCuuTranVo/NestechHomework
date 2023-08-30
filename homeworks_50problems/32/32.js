/*
 32. Viết chương trình JavaScript/Java để tìm 
 giá trị gần nhất với 100 từ hai giá trị số.
 */
var args = process.argv.slice(2);
//console.log(args)

if (args.length == 0) {
    console.log("Please provide a string in command line");
}
var a = Number(args[0]);
var b = Number(args[1]);

function near100(a, b) {
    var distanceA = Math.abs(a - 100);
    var distanceB = Math.abs(b - 100);
    if (distanceA < distanceB) {
        return a;
    } else {
        return b;
    }
}

console.log(near100(a, b));