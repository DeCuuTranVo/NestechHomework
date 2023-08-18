const min = 1;
const max = 10;
const randomNum = Math.floor(Math.random() * (max - min + 1)) + min;

while(true) {
    let guessNum = Number(prompt("Please input an integer between 1 and 10: ", 0));
    if (randomNum === guessNum) {
        alert("Good job!");
        break;
    } else {
        alert("Bad guess");
    }
}