let salaries = {
    John: 100,
    Ann: 160,
    Pete: 130
}

//let salaries = {};

let sumValue = 0;
for (let key in salaries) {
    sumValue += salaries[key]; 
}
//console.log(sumValue);
  