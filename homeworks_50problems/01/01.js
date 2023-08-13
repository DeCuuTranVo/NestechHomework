const date = new Date();
const options = { weekday: 'long' };
const dayOfWeek = date.toLocaleDateString('en-US', options);
let hours = date.getHours();
const minutes = date.getMinutes();
const seconds = date.getSeconds();
let ampm;

// https://www.mathsisfun.com/time.html
if (hours === 0) {
    hours += 12;
    ampm = "AM";
} else if ((1 <= hours) && (hours <= 11)){
    ampm = "AM";
} else if (hours === 12) {
    ampm = "PM";
} else {
    hours -= 12;
    ampm = "PM";
}
//console.log(date);
console.log(`Today is: ${dayOfWeek}.`);
console.log(`Current Time is: ${hours}: ${minutes}: ${seconds} ${ampm}`);

/* Output:
Today is: Sunday.
Current Time is: 3: 36: 45 PM
*/

