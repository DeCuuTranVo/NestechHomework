/*
18. Viết chương trình JavaScript/Java để kiểm tra một cặp số và 
trả về true nếu một trong các số là 50 hoặc nếu tổng của chúng là 50.
*/

function check50(pA, pB) {
    if ((pA === 50) || (pB === 50)) {
        return true;
    } else if ((pA + pB) === 50) {
        return true;
    }
    return false;
}
  
a = Number(prompt("Enter First Number: "));
b = Number(prompt("Enter Second Number: "));

const result = check50(a, b)
alert("The result is: " + result);