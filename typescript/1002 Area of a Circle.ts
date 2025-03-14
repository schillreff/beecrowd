// A fórmula para calcular a área de uma circunferência é: area = π . raio2.
//  Considerando para este problema que π = 3.14159:

// - Efetue o cálculo da área, elevando o valor de raio ao quadrado e
//  multiplicando por π.

// Entrada
// A entrada contém um valor de ponto flutuante (dupla precisão), no caso,
//  a variável raio.

// Saída
// Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme
// exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla
//  precisão (double). Como todos os problemas, não esqueça de imprimir o fim
// de linha após o resultado, caso contrário, você receberá "Presentation Error".

// Exemplos de Entrada	Exemplos de Saída
// 2.00                 // A=12.5664

// 100.64               // A=31819.3103

// 150.00               // A=70685.7750

// The formula to calculate the area of a circle is: area = π * radius².
// Considering for this problem that π = 3.14159:

// - Perform the calculation of the area, squaring the radius value and
// multiplying it by π.

// Input
// The input contains a floating-point value (double precision), representing
// the radius of the circle.

// Output
// Print the message "A=" followed by the value of the area, as shown in
// the example below, with 4 decimal places. Use double precision variables.
// As with all problems, do not forget to print a new line after the result,
// otherwise you will receive a "Presentation Error".

// Input Example   Output Example
// 2.00           // A=12.5664

// 100.64         // A=31819.3103

// 150.00         // A=70685.7750
import * as fs from 'fs';

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

// Function to calculate the area of the circle
function calculateArea(radius: number): string {
    const pi = 3.14159;
    const area = pi * Math.pow(radius, 2);
    return `A=${area.toFixed(4)}`;
}

console.log(calculateArea(Number(lines[0])));