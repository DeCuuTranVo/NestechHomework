/*
 30. Viết chương trình JavaScript/Java để kiểm tra xem một chuỗi "Script" 
 có xuất hiện ở vị trí thứ 5 (chỉ số 4) trong một chuỗi đã cho hay không. 
 Nếu "Script" xuất hiện trong chuỗi, trả lại chuỗi không có "Script" 
 nếu không trả lại chuỗi gốc.
 */


var args = process.argv.slice(2);
//console.log(args)

if (args.length == 0) {
    console.log("Please provide a string in command line");
}
var inputString = String(args[0]);


function checkString(pInputString) {
    if (pInputString.length < 5) {
        return pInputString;
    }

    if (pInputString.length < 5 + "Script".length) {
        if (pInputString.slice(4).localeCompare("Script") === 0) {
            return pInputString.replace("Script", "");
        } else {
            return pInputString;
        }
    }
    else 
    {
        if (pInputString.slice(4, 4 + "Script".length).localeCompare("Script") === 0) {
            return pInputString.replace("Script", "");
        } else {
            return pInputString;
        }
    }
}

console.log(checkString(inputString));

