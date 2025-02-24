# Read 100 integer numbers. Print the highest read value and the input position.

# Input
# The input file contains 100 distinct positive integer numbers.

# Output
# Print the highest number read and the input position of this value, according to the given example.

# Input Sample	Output Sample
# 2
# 113
# 45
# 34565
# 6
# ...
# 8


# 34565
# 4

max_value = -1
max_position = -1

for i in range(1, 101):
    num = int(input())

    if num > max_value:
        max_value = num
        max_position = i

print(max_value)
print(max_position)
