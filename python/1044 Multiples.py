# Read two integer values (A and B). After, the program should print the
# message "Sao Multiplos" (are multiples) or "Nao sao Multiplos"
# (aren’t multiples), corresponding to the read values.

# Input
# The input has two integer numbers.

# Output
# Print the relative message to the input as stated above.

# Input Sample	Output Sample
# 6 24

# Sao Multiplos

# 6 25

# Nao sao Multiplos

A, B = map(int, input().split())

if A < B:
    A, B = B, A

print("Nao sao Multiplos" if (A % B) else "Sao Multiplos")
