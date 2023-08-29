/*
 27. Viết chương trình JavaScript/Java để kiểm tra xem 
 một chuỗi có bắt đầu bằng 'Java' hay không nếu ngược lại.
 */

var args = process.argv.slice(2);
//console.log(args)

if (args.length == 0) {
    console.log("Please provide a string in command line");
}
var inputString = String(args[0]);

function ProcessString(inputString) {
    if (inputString.startsWith("Java")) {
        console.log("This string starts with Java");
    } else {
        console.log("This string does not start with Java")
    }
}

ProcessString(inputString);