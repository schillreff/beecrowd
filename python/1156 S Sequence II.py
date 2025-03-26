# Write an algorithm to calculate and write the value of S, S being given by:
# S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?

# Input
# There is no input in this problem.

# Output
# The output contains a value corresponding to the value of S.
# The value should be printed with two digits after the decimal point.


def calculate_s():
    numerator = 1
    denominator = 1
    S = 0

    while numerator <= 39:
        S += numerator / denominator
        numerator += 2
        denominator *= 2

    return S


s_value = calculate_s()
print(f"{s_value:.2f}")
