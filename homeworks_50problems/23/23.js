/*
23. Viết chương trình JavaScript/Java để tạo một chuỗi mới từ một chuỗi đã cho
 bằng cách thay đổi vị trí của ký tự đầu và ký tự cuối. 
 Độ dài chuỗi phải lớn hơn hoặc bằng 1.
*/

function modifyStringOrder(pString) {
    if (pString.length < 1) {
        alert("Illegal string length");
        return;
    } else if (pString.length === 1) {
        return pString;
    } else {
        let newStringArray = pString.split("");

        let temp = newStringArray[0];
        newStringArray[0] = newStringArray[pString.length - 1];
        newStringArray[pString.length - 1] = temp;
    
        let newString = newStringArray.join("");
        return newString;
    }
}

givenString = String(prompt("Enter String: "));

const result = modifyStringOrder(givenString);
alert("The result string is: " + result);