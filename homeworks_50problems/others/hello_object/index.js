user = {};
console.log(user);

user.name = "John";
user.surname = "Smith";
console.log(user);

user.name = "Pete";
console.log(user);

delete user.name;
console.log(user);

/*
Output:
    {}
    { name: 'John', surname: 'Smith' }
    { name: 'Pete', surname: 'Smith' }
    { surname: 'Smith' }
*/