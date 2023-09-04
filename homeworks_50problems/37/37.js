/*
 37. Viết chương trình JavaScript/Java để tạo một chuỗi mới có 3 ký tự đầu tiên
  viết thường từ một chuỗi đã cho. Nếu độ dài chuỗi nhỏ hơn 3, hãy chuyển đổi 
  tất cả các ký tự thành chữ hoa.
 */

var args = process.argv.slice(2);
//console.log(args)

if (args.length == 0) {
    console.log("Please provide a string in command line");
}

var inputString = String(args[0]);

function convertCase(pInputString) {
    if (pInputString.length < 3) {
        return pInputString.toUpperCase();
    } else {
        return pInputString.slice(0, 3).toLowerCase() + pInputString.slice(3);
    }
}

console.log(convertCase(inputString));