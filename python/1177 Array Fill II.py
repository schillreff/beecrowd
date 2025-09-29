# Write a program that reads a number T and fill a vector N[1000] with the numbers from 0 to T-1 repeated times, like as the example below.

# Input
# The input contains an integer number T (2 ≤ T ≤ 50).

# Output
# For each position of the array N, print "N[i] = x", where i is the array position and x is the number stored in that position.

# Input Sample	Output Sample
# 3

# N[0] = 0
# N[1] = 1
# N[2] = 2
# N[3] = 0
# N[4] = 1
# N[5] = 2
# N[6] = 0
# N[7] = 1
# N[8] = 2
# ...


T = int(input())
if 2 <= T <= 50:
    for i in range(1000):
        value = i % T
        print(f"N[{i}] = {value}")
