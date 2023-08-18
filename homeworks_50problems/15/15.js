function compute(pNumber) {
    if (pNumber <= 13) {
        return 13 - pNumber;
    } else {
        return Math.abs(13 - pNumber) * 2;
    }
}
  
const result = Number(prompt("Enter Number: "));
alert("The result is: " + compute(result));