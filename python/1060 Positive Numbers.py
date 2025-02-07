# Write a program that reads 6 numbers. These numbers will only be positive or
# negative (disregard null values). Print the total number of positive numbers.

# Input
# Six numbers, positive and/or negative.

# Output
# Print a message with the total number of positive numbers.

# Input Sample	Output Sample
# 7
# -5
# 6
# -3.4
# 4.6
# 12

# 4 valores positivos

result = sum([float(input()) > 0 for _ in range(6)])

print(f"{result} valores positivos")
