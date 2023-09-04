/*
 35. Viết chương trình kiểm tra xem một ký tự xác định có tồn tại giữa 
 vị trí thứ 2 và thứ 4 trong một chuỗi cho trước hay không.
 */

 
var args = process.argv.slice(2);
//console.log(args)
 
if (args.length == 0) {
    console.log("Please provide a string in command line");
}

var inputString = String(args[0]);
var inputChar = String(args[1]);

function checkContainRange(s, c) {
    if (s.length < 3) {
        return false;
    }

    s_slice = s.slice(1,2);
    console.log(s_slice);
    if (s_slice.includes(c)) {
        return true;
    }
    return false;
}

console.log(checkContainRange(inputString, inputChar));