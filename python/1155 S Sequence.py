# Write an algorithm to calculate and write the value of S, S being given by:
# S = 1 + 1/2 + 1/3 + … + 1/100

# Input
# There is no input in this problem.

# Output
# The output contains a value corresponding to the value of S.
# The value should be printed with two digits after the decimal point.


def calculate_s():
    S = 0
    for i in range(1, 101):
        S += 1 / i
    return S

s_value = calculate_s()
print(f"{s_value:.2f}")
