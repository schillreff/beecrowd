// Faça um programa que leia três valores e apresente o maior dos três valores
// lidos seguido da mensagem “eh o maior”.
// Utilize a fórmula:

// Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b).
//  Um segundo passo, portanto é necessário para chegar no resultado esperado.

// Entrada
// O arquivo de entrada contém três valores inteiros.

// Saída
// Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

// Exemplos de Entrada	Exemplos de Saída
// 7 14 106             // 106 eh o maior

// 217 14 6             // 217 eh o maior

import * as fs from 'fs';

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const [a, b, c] = lines[0].split(" ").map(Number);

const greatest = Math.max(a, b, c);

console.log(`${greatest} eh o maior`);