# Read an integer N. This N will be the number of integer numbers X that will be read.

# Print how many these numbers X are in the interval [10,20] and how many values are out of this interval.


# Input
# The first line of input is an integer N (N < 10000), that indicates the total number of test cases.
# Each case is an integer number X (-107 < X < 107).


# Output
# For each test case, print how many numbers are in and how many values are out of the interval.

# Input Sample	Output Sample
# 4
# 14
# 123
# 10
# -25

# 2 in
# 2 out

n = int(input())

in_interval = 0
out_interval = 0

for _ in range(n):
    x = int(input())
    if x >= 10 and x <= 20:
        in_interval += 1
    else:
        out_interval += 1

print(f"{in_interval} in")
print(f"{out_interval} out")
