function celsiusToFahrenheit(celsius) {
    return (celsius * 9 / 5) + 32;
}

function fahrenheitToCelsius(fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
}

const celsius = Number(prompt("Enter Celcius Degree: "));
alert(celsius + " Celcius degree is " + celsiusToFahrenheit(celsius) + " Fahrenheit degree");

const fahrenheit = Number(prompt("Enter Fahrenheit Degree: "));
alert(fahrenheit + " Fahrenheit degree is " + fahrenheitToCelsius(fahrenheit) + " Celcius degree");