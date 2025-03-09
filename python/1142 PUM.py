# Write a program that reads an integer N. This N is the number of output lines printed by this program.

# Input
# The input file contains an integer N.

# Output
# Print the output according to the given example.

# Input Sample	Output Sample
# 7

# 1 2 3 PUM
# 5 6 7 PUM
# 9 10 11 PUM
# 13 14 15 PUM
# 17 18 19 PUM
# 21 22 23 PUM
# 25 26 27 PUM

n = int(input())

start = 1

for _ in range(n):
    print(f"{start} {start + 1} {start + 2} PUM")
    start += 4
