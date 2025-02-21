# Read an integer N. Print all numbers between 1 and 10000, which divided by N will give the rest = 2.

# Input
# The input is an integer N (N < 10000)

# Output
# Print all numbers between 1 and 10000, which divided by n will give the rest = 2, one per line.

# Input Sample	Output Sample
# 13

# 2
# 15
# 28
# 41
# ...

n = int(input())

for i in range(10000):
    if i % n == 2:
        print(i)
