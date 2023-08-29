/*
25. Viết chương trình JavaScript/Java để kiểm tra xem một số dương đã cho là bội số của 3 hay 7.
*/

var args = process.argv.slice(2);
//console.log(args)

var n = Number(args[0]);

function ProcessDivision(n) {
    var divisibleBy3 = (n % 3 == 0);
    var divisibleBy7 = (n % 7 == 0);

    if (divisibleBy3) {
        console.log("This number is divisible by 3")
    }

    if (divisibleBy7) {
        console.log("This number is divisible by 7")
    }

    if ((!divisibleBy3) && (!divisibleBy7)) {
        console.log("This number is not divisible by 3 and 7");
    } 
}

ProcessDivision(n);
