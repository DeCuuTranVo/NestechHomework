function strangeSum(pA, pB) {
    if (pA !== pB) {
        return pA + pB;
    } else {
        return 3 * (pA + pB);
    }
}
  
a = Number(prompt("Enter First Number: "));
b = Number(prompt("Enter Second Number: "));

const result = strangeSum(a, b)
alert("The result is: " + result);