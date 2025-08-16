// Write an algorithm to calculate and write the value of S, S being given by:
// S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?

// Input
// There is no input in this problem.

// Output
// The output contains a value corresponding to the value of S.
// The value should be printed with two digits after the decimal point.

function calculateS() {
  let numerator = 1;
  let denominator = 1;
  let S = 0;

  while (numerator <= 39) {
    S += numerator / denominator;
    numerator += 2;
    denominator *= 2;
  }

  return S;
}

const SValue = calculateS();
console.log(SValue.toFixed(2));
