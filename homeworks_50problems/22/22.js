/*
22. Viết chương trình JavaScript/Java để xóa một ký tự ở
 vị trí xác định trong một chuỗi đã 
cho và trả về chuỗi đã sửa.
*/

function deleteIndex(pString, index) {
    if ((index < 0) || (index >= pString.length)) {
        alert("Index exceeds string length");
        return;
    }

    part1 = pString.substring(0, index);
    part2 = pString.substring(index + 1, pString.length);
    return (part1 + part2);
}

givenString = String(prompt("Enter String: "));
givenIndex = Number(prompt("Enter Index: "));

const result = deleteIndex(givenString, givenIndex);
alert("The result string is: " + result);