# Write an algorithm to read a value A and a value N. Print the sum of N
#  numbers from A (inclusive). While N is negative or ZERO, a new N (only N)
# must be read. All input values are in the same line.

# Input
# The input contains only integer values, ​​can be positive or negative.

# Output
# The output contains only an integer value.

# Input Sample	Output Sample
# 3 2

# 7

# 3 -1 0 -2 2

# 7

values = list(map(int, input().split()))

a = values[0]

n = next(n for n in values[1:] if n > 0)

result = sum(a + i for i in range(n))

print(result)
