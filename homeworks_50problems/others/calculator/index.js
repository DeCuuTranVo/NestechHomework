let calculator = {
    read: function() {
        this.a = Number(prompt("Input a:", 0));
        this.b = Number(prompt("Input b:", 0));
    },
    sum: function() {
        return this.a + this.b;
    },
    mul: function() {
        return this.a * this.b;
    },
};
  
calculator.read();
alert( calculator.sum() );
alert( calculator.mul() );
  