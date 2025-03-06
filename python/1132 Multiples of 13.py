# Write a program that reads two integer numbers X and Y and calculate the
# sum of all number not divisible by 13 between them, including both.

# Input
# The input file contains 2 integer numbers X and Y without any order.

# Output
# Print the sum of all numbers between X and Y not divisible by 13, including
# them if it is the case.

# Input Sample	Output Sample
# 100
# 200

# 13954

x = int(input())
y = int(input())

if x > y:
    x, y = y, x

total_sum = 0

for number in range(x, y + 1):
    if number % 13 != 0:
        total_sum += number

print(total_sum)
