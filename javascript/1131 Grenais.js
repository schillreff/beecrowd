// The Federação Gaúcha de Futebol invited you to write a program to present a
// statistical result of several GRENAIS. Write a program that read the number
// of goals scored by Inter and the number of goals scored by Gremio in a GRENAL.
// Write the message "Novo grenal (1-sim 2-nao)" and request a response.
// If the answer is 1, two new numbers must be read (another input case) asking
//  the number of goals scored by the teams in a new departure, otherwise the
// program must be finished, printing:

// - How many GRENAIS were part of the statistics.
// - The number of victories of Inter.
// - The number of victories of Gremio.
// - The number of Draws.
// - A message indicating the team that won the largest number of GRENAIS
//  (or the message: "Não houve vencedor" if both team won the same quantity of GRENAIS).

// Input
// The input contains two integer values​​, corresponding to the goals scored by
// both teams. Then there is an integer (1 or 2), corresponding to the repetition of the algorithm.

// Output
// After each reading of the goals it must be printed the message "Novo grenal
// (1-sim 2-nao)". When the program is finished, the program must print the statistics as the example below.

// Input Sample	Output Sample
// 3 2
// 1
// 2 3
// 1
// 3 1
// 2

// Novo grenal (1-sim 2-nao)
// Novo grenal (1-sim 2-nao)
// Novo grenal (1-sim 2-nao)
// 3 grenais
// Inter:2
// Gremio:1
// Empates:0
// Inter venceu mais

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

let matches = 0;
let interWins = 0;
let gremioWins = 0;
let draws = 0;

while (true) {
  const [interGoals, gremioGoals] = lines.shift().split(" ").map(Number);

  matches++;

  if (interGoals > gremioGoals) {
    interWins++;
  } else if (gremioGoals > interGoals) {
    gremioWins++;
  } else {
    draws++;
  }

  console.log("Novo grenal (1-sim 2-nao)");
  let response = lines.shift();

  if (response === "2") {
    break;
  }
}

console.log(`${matches} grenais`);
console.log(`Inter:${interWins}`);
console.log(`Gremio:${gremioWins}`);
console.log(`Empates:${draws}`);

if (interWins > gremioWins) {
  console.log("Inter venceu mais");
} else if (gremioWins > interWins) {
  console.log("Gremio venceu mais");
} else {
  console.log("Não houve vencedor");
}
