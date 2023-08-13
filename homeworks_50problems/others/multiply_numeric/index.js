/* The multiplyNumeric(obj) function should work like this:
// before the call
let menu = {
    width: 200,
    height: 300,
    title: "My menu"
  };
  
  multiplyNumeric(menu);
  
  // after the call
  menu = {
    width: 400,
    height: 600,
    title: "My menu"
  };
*/

function multiplyNumeric(obj) { 
    for (let key in obj) {
        if (typeof(obj[key]) == 'number') {
            obj[key] = obj[key] * 2;
        }
    }
}

let menu = {
    width: 200,
    height: 300,
    title: "My menu"
  };

//console.log(menu); //{ width: 200, height: 300, title: 'My menu' }
multiplyNumeric(menu);
//console.log(menu); // { width: 400, height: 600, title: 'My menu' }