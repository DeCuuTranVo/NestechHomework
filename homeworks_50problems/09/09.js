const currentDate = new Date();
const christmaxDate = new Date(currentDate.getFullYear(), 11, 25);
const dayDuration = Math.abs(Math.floor(currentDate - christmaxDate))/ 1000 / 60 / 60 / 24;
console.log("Duration till Christmax: " + dayDuration.toFixed(0) + " days.");