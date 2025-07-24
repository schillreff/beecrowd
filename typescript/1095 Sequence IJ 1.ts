// Make a program that prints the sequence like the following example.

// Input
// This problem doesn't have input.

// Output
// Print the sequence like the example below.

// Input Sample	Output Sample
// I=1 J=60
// I=4 J=55
// I=7 J=50
// ...
// I=? J=0

let I = 1;
let J = 60;

while (J >= 0) {
  console.log(`I=${I} J=${J}`);
  I += 3;
  J -= 5;
}
