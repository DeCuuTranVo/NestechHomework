/*
17. Viết chương trình JavaScript/Java để tính chênh lệch tuyệt đối giữa một số đã chỉ định và 19. 
Trả về gấp ba lần chênh lệch tuyệt đối nếu số đã chỉ định lớn hơn 19.
*/


function absDiff(pA) {
    if (pA <= 19) {
        return Math.abs(pA - 19);
    } else {
        return 3 * Math.abs(pA - 19);
    }
}
  
a = Number(prompt("Enter First Number: "));

const result = absDiff(a)
alert("The result is: " + result);