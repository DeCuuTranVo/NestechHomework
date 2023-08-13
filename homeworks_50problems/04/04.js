const a = 5;
const b = 6;
const c = 7;

// calculate the semi-perimeter
const s = (a + b + c) / 2;

// calculate the area using Heron's formula
const area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

console.log(area);