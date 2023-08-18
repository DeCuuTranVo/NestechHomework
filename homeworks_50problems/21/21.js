/*
21. Viết chương trình JavaScript/Java để tạo một chuỗi khác bằng cách thêm "Py" 
vào trước một chuỗi đã cho. Nếu chuỗi đã cho bắt đầu bằng "Py" hãy trả về chuỗi gốc.
*/

function pyString(pString) {
    if (pString.startsWith("Py")) {
        return pString;
    } else {
        return "Py" + pString;
    }
}
  
a = String(prompt("Enter String: "));

const result = pyString(a)
alert("The result is: " + result);