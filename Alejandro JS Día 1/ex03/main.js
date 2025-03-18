const r =  parseFloat(prompt ("Introduce aquí el radio del círculo a calcular:"));
const Pi = 3.1415;
const area = Pi * (r*r);
result = area.toFixed(4);

console.log ("para un radio de:", r, "el área es aprox.", result);
alert (`Para un radio de: ${r}, el área es: ${result}`);