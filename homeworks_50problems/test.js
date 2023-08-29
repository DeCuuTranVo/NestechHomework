const user = { 
    name: 'java k18', 
    age: 1, 
    classes: { 
       type: 'hocvien', name: 'java'
    } 
    }; 

Object.freeze(user); 

user.classes.name = 'javascript'; 
console.log(user.classes.name);