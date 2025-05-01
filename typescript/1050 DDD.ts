// Read an integer number that is the code number for phone dialing. Then,
// print the destination according to the following table:

// If the input number isn’t found in the above table, the output must be:
// DDD nao cadastrado
// That means “DDD not found” in Portuguese language.

// Input
// The input consists in a unique integer number.

// Output
// Print the city name corresponding to the input DDD. Print DDD nao cadastrado
//  if doesn't exist corresponding DDD to the typed number.

// Input Sample	Output Sample
// 11

// Sao Paulo

import * as fs from "fs";

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const ddd = parseInt(lines.shift() || "");

const dddMap = {
  61: "Brasilia",
  71: "Salvador",
  11: "Sao Paulo",
  21: "Rio de Janeiro",
  32: "Juiz de Fora",
  19: "Campinas",
  27: "Vitoria",
  31: "Belo Horizonte",
};

function getCityByDDD(ddd) {
  return dddMap[ddd] || "DDD nao cadastrado";
}

console.log(getCityByDDD(ddd));
