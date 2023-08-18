/*
20. Viết chương trình JavaScript/Java để kiểm tra hai số nguyên đã cho 
xem một số nguyên dương và một số nguyên âm.
*/

function checkPosNev(pA, pB) {
    if ((pA > 0) && (pB < 0)) {
        return true;
    } else if ((pA < 0) && (pB > 0)) {
        return true;
    }
    return false;
}
  
a = Number(prompt("Enter First Number: "));
b = Number(prompt("Enter Second Number: "));

const result = checkPosNev(a, b)
alert("The result is: " + result);