# In an imaginary country called Lisarb, all the people are very happy to pay
# their taxes because they know that doesn’t exist corrupt politicians and the
#  taxes are used to benefit the population, without any misappropriation.
# The currency of this country is Rombus, whose symbol is R$.

# Read a value with 2 digits after the decimal point, equivalent to the salary
# of a Lisarb inhabitant. Then print the due value that this person must pay
# of taxes, according to the table below.


# Remember, if the salary is R$ 3,002.00 for example, the rate of 8% is only
# over R$ 1,000.00, because the salary from R$ 0.00 to R$ 2,000.00 is tax free.
#  In the follow example, the total rate is 8% over R$ 1000.00 + 18% over R$ 2.00,
#  resulting in R$ 80.36 at all. The answer must be printed with 2 digits after
# the decimal point.

# Input
# The input contains only a float-point number, with 2 digits after
# the decimal point.

# Output
# Print the message "R$" followed by a blank space and the total tax to be payed,
#  with two digits after the decimal point. If the value is up to 2000,
# print the message "Isento".

# Input Samples	Outputs Samples
# 3002.00

# R$ 80.36

# 1701.12

# Isento

# 4520.00

# R$ 355.60

salary = float(input())

tax = 0.0

if salary > 4500.00:
    tax += (salary - 4500.00) * 0.28
    salary = 4500.00
if salary > 3000.00:
    tax += (salary - 3000.00) * 0.18
    salary = 3000.00
if salary > 2000.00:
    tax += (salary - 2000.00) * 0.08

if tax == 0:
    print("Isento")
else:
    print(f"R$ {tax:.2f}")
