// Peter is organizing an event in his University. The event will be in April
// month, beginning and finishing within April month. The problem is: Peter
// wants to calculate the event duration in seconds, knowing obviously the
// begin and the end time of the event.

// You know that the event can take from few seconds to some days, so, you
// must help Peter to compute the total time corresponding to duration of the event.

// Input
// The first line of the input contains information about the beginning day
// of the event in the format: “Dia xx”. The next line contains the start
// time of the event in the format presented in the sample input. Follow
// 2 input lines with same format, corresponding to the end of the event.

// Output
// Your program must print the following output, one information by line,
// considering that if any information is null for example, the number 0
// must be printed in place of W, X, Y or Z:

// W dia(s)
// X hora(s)
// Y minuto(s)
// Z segundo(s)

// Obs: Consider that the event of the test case have the minimum duration
// of one minute. “dia” means day, “hora” means hour, “minuto” means minute
// and “Segundo” means second in Portuguese.

// Input Sample	Output Sample
// Dia 5
// 08 : 12 : 23
// Dia 9
// 06 : 13 : 23

// 3 dia(s)
// 22 hora(s)
// 1 minuto(s)
// 0 segundo(s)

function toSeconds(day, hour, minute, second) {
  return day * 86400 + hour * 3600 + minute * 60 + second;
}

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

let startDay = parseInt(lines.shift().split(" ")[1]);
let [startHour, startMinute, startSecond] = lines.shift().split(" : ").map(Number);

let endDay = parseInt(lines.shift().split(" ")[1]);
let [endHour, endMinute, endSecond] = lines.shift().split(" : ").map(Number);

let startSeconds = toSeconds(startDay, startHour, startMinute, startSecond);
let endSeconds = toSeconds(endDay, endHour, endMinute, endSecond);

let duration = endSeconds - startSeconds;

let days = Math.floor(duration / 86400);
duration %= 86400;
let hours = Math.floor(duration / 3600);
duration %= 3600;
let minutes = Math.floor(duration / 60);
let seconds = duration % 60;

console.log(`${days} dia(s)`);
console.log(`${hours} hora(s)`);
console.log(`${minutes} minuto(s)`);
console.log(`${seconds} segundo(s)`);
