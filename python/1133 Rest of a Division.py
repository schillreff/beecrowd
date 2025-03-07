# Write a program that reads two integer numbers X and Y. Print all numbers
# between X and Y which dividing it by 5 the rest is equal to 2 or equal to 3.

# Input
# The input file contains 2 any positive integers, not necessarily in ascending order.

# Output
# Print all numbers according to above description, always in ascending order.

# Input Sample	Output Sample
# 10
# 18

# 12
# 13
# 17

x = int(input())
y = int(input())

if x > y:
    x, y = y, x

for number in range(x + 1, y):
    if number % 5 == 2 or number % 5 == 3:
        print(number)
