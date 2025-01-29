# Read 3 floating-point numbers. After, print the roots of bhaskara’s formula.
#  If it's impossible to calculate the roots because a division by zero or a
#  square root of a negative number, presents the message “Impossivel calcular”.

# Input
# Read 3 floating-point numbers (double) A, B and C.

# Output
# Print the result with 5 digits after the decimal point or the message if it
# is impossible to calculate.

# Input Samples	Output Samples
# 10.0 20.1 5.1

# R1 = -0.29788
# R2 = -1.71212

# 0.0 20.0 5.0

# Impossivel calcular

# 10.3 203.0 5.0

# R1 = -0.02466
# R2 = -19.68408

# 10.0 3.0 5.0

# Impossivel calcular

import math

A, B, C = [float(value) for value in input().split(" ")]

delta = (B**2) - (4 * A * C)

if A != 0 and delta >= 0:
    root1 = ((-B) + math.sqrt(delta)) / (2 * A)
    root2 = ((-B) - math.sqrt(delta)) / (2 * A)
    print(f"R1 = {root1:.5f}")
    print(f"R2 = {root2:.5f}")
else:
    print("Impossivel calcular")
