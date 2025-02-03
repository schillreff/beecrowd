// Read the start time and end time of a game, in hours. Then calculate the
// duration of the game, knowing that the game can begin in a day and finish
// in another day, with a maximum duration of 24 hours. The message must be
// printed in portuguese “O JOGO DUROU X HORA(S)” that means “THE GAME LASTED X HOUR(S)”

// Input
// Two integer numbers representing the start and end time of a game.

// Output
// Print the duration of the game as in the sample output.

// Input Sample	Output Sample
// 16 2

// O JOGO DUROU 10 HORA(S)

// 0 0

// O JOGO DUROU 24 HORA(S)

// 2 16

// O JOGO DUROU 14 HORA(S)

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const [start, end] = lines.shift().split(" ").map(Number);

if (start === end) {
  console.log("O JOGO DUROU 24 HORA(S)");
} else if (start > end) {
  console.log(`O JOGO DUROU ${24 - start + end} HORA(S)`);
} else {
  console.log(`O JOGO DUROU ${end - start} HORA(S)`);
}
