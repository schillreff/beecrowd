# Read an integer value X (1 <= X <= 1000).  Then print the odd numbers from
# 1 to X, each one in a line, including X if is the case.

# Input
# The input will be an integer value.

# Output
# Print all odd values between 1 and X, including X if is the case.

# Input Sample	Output Sample
# 8

# 1
# 3
# 5
# 7

x = int(input())

for num in range(1, x + 1):
    if num % 2 != 0:
        print(num)
