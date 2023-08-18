/*
24. Viết chương trình JavaScript/Java để tạo một chuỗi khác
 từ một chuỗi đã cho có thêm ký tự đầu tiên của chuỗi đã cho vào trước và sau.
*/

function appendStringFrontBack(pString) {
    if (pString.length === 0) {
        return "";
    } else {
        let firstChar = pString[0];
        return firstChar + pString + firstChar;     
    }
}

givenString = String(prompt("Enter String: "));

const result = appendStringFrontBack(givenString);
alert("The result string is: " + result);