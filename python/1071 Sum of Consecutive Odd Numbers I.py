# Read two integer values X and Y. Print the sum of all odd values between them.

# Input
# The input file contain two integer values.

# Output
# The program must print an integer number. This number is the sum off all odd
# values between both input values that must fit in an integer number.

# Sample Input	Sample Output
# 6
# -5

# 5

# 15
# 12

# 13

# 12
# 12

# 0

x = int(input())
y = int(input())

start = min(x, y)
end = max(x, y)

sum_odd = 0

for num in range(start + 1, end):
    if num % 2 != 0:
        sum_odd += num

print(sum_odd)
