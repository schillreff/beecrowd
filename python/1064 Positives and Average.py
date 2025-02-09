# Read 6 values that can be floating point numbers. After, print how many of
# them were positive. In the next line, print the average of all positive
# values typed, with one digit after the decimal point.

# Input
# The input consist in 6 numbers that can be integer or floating point values.
#  At least one number will be positive.

# Output
# The first output value is the amount of positive numbers. The next line
#  should show the average of the positive values ​typed.

# Input Sample	Output Sample
# 7
# -5
# 6
# -3.4
# 4.6
# 12

# 4 valores positivos
# 7.4

numbers = [float(input()) for _ in range(6)]

positive_numbers = [num for num in numbers if num > 0]

positive_count = len(positive_numbers)

positive_average = sum(positive_numbers) / positive_count

print(f"{positive_count} valores positivos")
print(f"{positive_average:.1f}")
