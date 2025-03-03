# Write a program to read the coordinates (X, Y) of an indeterminate number of
# points in Cartesian system. For each point write the quadrant to which it belongs.
#  The program finish when at least one of two coordinates is NULL
# (in this situation without writing any message).

# Input
# The input contains several tests cases. Each test case contains two integer numbers.

# Output
# For each test case, print the corresponding quadrant which these
# coordinates belong, as in the example.

# Input Sample	Output Sample
# 2 2
# 3 -2
# -8 -1
# -7 1
# 0 2

# primeiro
# quarto
# terceiro
# segundo

while True:
    x, y = map(int, input().split())

    if x == 0 or y == 0:
        break

    if x > 0 and y > 0:
        print("primeiro")
    elif x < 0 and y > 0:
        print("segundo")
    elif x < 0 and y < 0:
        print("terceiro")
    elif x > 0 and y < 0:
        print("quarto")
