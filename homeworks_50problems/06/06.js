function isLeapYear(year) {
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        return true;
    } else {
        return false;
    }
}

const year = prompt('Enter a year:');
let isALeapYear = isLeapYear(year);
alert("The year " + year + " is a leap year: " + isALeapYear);
