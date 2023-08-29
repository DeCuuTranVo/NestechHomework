/*
    26. Viết chương trình JavaScript/Java để tạo một chuỗi từ một chuỗi cho trước. 
    Điều này được thực hiện bằng cách lấy 3 ký tự cuối cùng và thêm chúng ở cả phía trước và phía sau. 
    Độ dài chuỗi phải từ 3 trở lên.
*/

var args = process.argv.slice(2);
//console.log(args)
if (args.length == 0) {
    console.log("Please provide a string in command line");
}
var inputString = String(args[0]);

function ProcessString(inputString) {


    if (inputString.length <= 2) {
        console.log("Input string length must be >= 3");
    }

    var prime = inputString.slice(inputString.length - 3, inputString.length);
    var outputString = prime + inputString + prime;
    console.log(outputString);
}

ProcessString(inputString);
