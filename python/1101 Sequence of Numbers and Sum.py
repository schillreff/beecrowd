# Read an undetermined number of pairs values M and N (stop when any of these
# values is less or equal to zero). For each pair, print the sequence from the
#  smallest to the biggest (including both) and the sum of consecutive integers between them (including both).

# Input
# The input file contains pairs of integer values M and N. The last line of
# the file contains a number zero or negative, or both.

# Output
# For each pair of numbers, print the sequence from the smallest to the
#  biggest and the sum of these values, as shown below.

# Input Sample	Output Sample
# 5 2
# 6 3
# 5 0

# 2 3 4 5 Sum=14
# 3 4 5 6 Sum=18

while True:
    m, n = map(int, input().split())

    if m <= 0 or n <= 0:
        break

    start = min(m, n)
    end = max(m, n)

    sequence = list(range(start, end + 1))
    total_sum = sum(sequence)

    print(" ".join(map(str, sequence)), f"Sum={total_sum}")
