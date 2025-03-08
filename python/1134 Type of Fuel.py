# A gas station wants to determine which of their products is the preference
# of their customers. Write a program to read the type of fuel supplied
# (coded as follows: 1. Alcohol 2. Gasoline 3. Diesel 4. End). If you
# enter an invalid code (outside the range of 1 to 4) a new code must be requested.
# The program will end when the inserted code is the number 4.

# Input
# The input contains only integer and positive values.

# Output
# It should be written the message: "MUITO OBRIGADO" and the amount of
#  customers who fueled each fuel type, as an example.

# Input Sample	Output Sample
# 8
# 1
# 7
# 2
# 2
# 4

# MUITO OBRIGADO
# Alcool: 1
# Gasolina: 2
# Diesel: 0

alcohol = 0
gasoline = 0
diesel = 0

while True:
    code = int(input())

    if code == 1:
        alcohol += 1
    elif code == 2:
        gasoline += 1
    elif code == 3:
        diesel += 1
    elif code == 4:
        break
    else:
        continue

print("MUITO OBRIGADO")
print(f"Alcool: {alcohol}")
print(f"Gasolina: {gasoline}")
print(f"Diesel: {diesel}")