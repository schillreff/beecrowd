# In mathematics, a perfect number is an integer for which the sum of all its
# own positive divisors (excluding itself) is equal to the number itself.
# For example the number 6 is perfect, because 1+2+3 is equal to 6. Your task
# is to write a program that read integer numbers and print a message informing
# if these numbers are perfect or are not perfect.

# Input
# The input contains several test cases. The first contains the number of test
# cases N (1 ≤ N ≤ 100). Each one of the following N lines contains an integer
# X (1 ≤ X ≤ 108), that can be or not a perfect number.

# Output
# For each test case print the message “X eh perfeito” (X is perfect) or “X
# nao eh perfeito” (X isn't perfect) according with to above specification.

# Input Sample	Output Sample
# 3
# 6
# 5
# 28

# 6 eh perfeito
# 5 nao eh perfeito
# 28 eh perfeito

n = int(input())
for _ in range(n):
    x = int(input())
    if x == 1:
        print(f"{x} nao eh perfeito")
        continue
    sum_divisors = 1
    sqrt_x = int(x**0.5)
    for i in range(2, sqrt_x + 1):
        if x % i == 0:
            sum_divisors += i
            counterpart = x // i
            if counterpart != i:
                sum_divisors += counterpart
    if sum_divisors == x:
        print(f"{x} eh perfeito")
    else:
        print(f"{x} nao eh perfeito")
