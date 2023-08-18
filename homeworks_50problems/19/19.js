/*
19. Viết chương trình JavaScript/Java để 
kiểm tra xem một số nguyên đã cho nằm trong khoảng 20 của 100 hay 400.
*/

function checkWithInRange20(pA) {
    if (Math.abs(pA - 100) <= 20 ) {
        return true;
    } else if (Math.abs(pA - 400) <= 20) {
        return true;
    }
    return false;
}
  
a = Number(prompt("Enter First Number: "));

const result = checkWithInRange20(a)
alert("The result is: " + result);