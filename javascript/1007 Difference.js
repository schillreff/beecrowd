// Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
// diferença do produto de A e B pelo produto de C e D segundo a fórmula:
//  DIFERENCA = (A * B - C * D).

// Entrada
// O arquivo de entrada contém 4 valores inteiros.

// Saída
// Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme
// exemplo abaixo, com um espaço em branco antes e depois da igualdade.

// Exemplos de Entrada	Exemplos de Saída
// 5
// 6
// 7
// 8                    // DIFERENCA = -26

// 0
// 0
// 7
// 8                    // DIFERENCA = -56

// 5
// 6
// -7
// 8                    // DIFERENCA = 86

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

// Função para calcular a diferenca
function calcularDiferenca(a, b, c, d) {
  const diferenca = a * b - c * d;
  return `DIFERENCA = ${diferenca}`;
}

console.log(calcularDiferenca(lines[0], lines[1], lines[2], lines[3]));
