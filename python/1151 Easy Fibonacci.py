# The following sequence of numbers 0 1 1 2 3 5 8 13 21 ... is known as the
# Fibonacci Sequence. Thereafter, each number after the first 2 is equal to
#  the sum of the previous two numbers. Write an algorithm that reads an
#  integer N (N < 46) and that print the first N numbers of this sequence.

# Input
# The input file contains an integer number N (0 < N < 46).

# Output
# The numbers ​​should be printed on the same line, separated by a blank space.
# There is no space after the last number.

# Thanks to Cássio F.

# Input Sample	Output Sample
# 5

# 0 1 1 2 3


def fibonacci_sequence(n):
    if n == 1:
        return [0]
    elif n == 2:
        return [0, 1]

    fib_seq = [0, 1]
    for i in range(2, n):
        next_number = fib_seq[i - 1] + fib_seq[i - 2]
        fib_seq.append(next_number)

    return fib_seq


n = int(input())
fib_sequence = fibonacci_sequence(n)
print(" ".join(map(str, fib_sequence)))
