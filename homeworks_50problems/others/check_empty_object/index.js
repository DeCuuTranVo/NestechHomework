/*
The isEmpty(obj) function should work like this.

let schedule = {};
alert( isEmpty(schedule) ); // true
schedule["8:30"] = "get up";
alert( isEmpty(schedule) ); // false
*/

function isEmpty(pObj) {
    let countProperty = 0;
    for (key in pObj) {
        countProperty += 1;
    }
    
 return countProperty > 0;
        return true;
    } else {
        return false;
    }
}

let schedule = {};
alert( isEmpty(schedule) ); // true
schedule["8:30"] = "get up";
alert( isEmpty(schedule) ); // false