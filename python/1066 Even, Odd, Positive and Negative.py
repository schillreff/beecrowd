# Make a program that reads five integer values. Count how many   of these
#  values are even, odd, positive and negative. Print these information like following example.

# Input
# The input will be 5 integer values.

# Output
# Print a message like the following example with all letters in lowercase,
# indicating how many of these values ​​are even, odd, positive and negative.

# Input Sample	Output Sample
# -5
# 0
# -3
# -4
# 12

# 3 valor(es) par(es)
# 2 valor(es) impar(es)
# 1 valor(es) positivo(s)
# 3 valor(es) negativo(s)

numbers = [int(input()) for _ in range(5)]

even_count = 0
odd_count = 0
positive_count = 0
negative_count = 0
 
for num in numbers:
    if num % 2 == 0:
        even_count += 1
    else:
        odd_count += 1

    if num > 0:
        positive_count += 1
    elif num < 0:
        negative_count += 1

print(f"{even_count} valor(es) par(es)")
print(f"{odd_count} valor(es) impar(es)")
print(f"{positive_count} valor(es) positivo(s)")
print(f"{negative_count} valor(es) negativo(s)")
