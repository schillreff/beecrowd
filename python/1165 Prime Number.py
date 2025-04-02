# A Prime Number is a number that is divisible only by 1 (one) and by itself.
# For example the number 7 is Prime, because it can be divided only by 1 and by 7.

# Input
# The input contains several test cases. The first contains the number of test
# cases N (1 ≤ N ≤ 100). Each one of the following N lines contains an integer
# X (1 < X ≤ 107), that can be or not a prime number.

# Output
# For each test case print the message “X eh primo” (X is prime) or
# “X nao eh primo” (X isn't prime) according with to above specification.

# Input Sample	Output Sample
# 3
# 8
# 51
# 7

# 8 nao eh primo
# 51 nao eh primo
# 7 eh primo

import math

n = int(input())
for _ in range(n):
    x = int(input())
    if x == 2:
        print(f"{x} eh primo")
        continue
    if x % 2 == 0:
        print(f"{x} nao eh primo")
        continue
    is_prime = True
    sqrt_x = int(math.sqrt(x))
    for i in range(3, sqrt_x + 1, 2):
        if x % i == 0:
            is_prime = False
            break
    print(f"{x} eh primo" if is_prime else f"{x} nao eh primo")
