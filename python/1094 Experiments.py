# Maria has just started as graduate student in a medical school and she's
# needing your help to organize a laboratory experiment which she is
# responsible about. She wants to know, at the end of the year, how many
#  animals were used in this laboratory and the percentage of each type of animal is used at all.

# This laboratory uses in particular three types of animals: frogs,
# rats and rabbits. To obtain this information, it knows exactly the
# number of experiments that were performed, the type and quantity of each animal is used in each experiment.

# Input
# The first line of input contains an integer N indicating the number
# of test cases that follows. Each test case contains an integer Amount
# (1 ≤ Amount ≤ 15) which represents the amount of animal used and a character
# Type ('C', 'R' or 'S'), indicating the type of animal:
# - C: Coelho (rabbit in portuguese)
# - R: Rato (rat  in portuguese)
# - S: Sapo (frog in portuguese)

# Output
# Print the total of animals used, the total of each type of animal and the
#  percentual of each one in relation of the total of animals used. The
# percentual must be printed with 2 digits after the decimal point.

# Input Sample	Output Sample
# 10
# 10 C
# 6 R
# 15 S
# 5 C
# 14 R
# 9 C
# 6 R
# 8 S
# 5 C
# 14 R

# Total: 92 cobaias
# Total de coelhos: 29
# Total de ratos: 40
# Total de sapos: 23
# Percentual de coelhos: 31.52 %
# Percentual de ratos: 43.48 %
# Percentual de sapos: 25.00 %

total_animals = 0
total_rabbits = 0
total_rats = 0
total_frogs = 0

n = int(input())

for _ in range(n):
    amount, animal_type = input().split(" ")
    amount = int(amount)

    total_animals += amount

    if animal_type == "C":
        total_rabbits += amount
    elif animal_type == "R":
        total_rats += amount
    elif animal_type == "S":
        total_frogs += amount

percent_rabbits = (total_rabbits / total_animals) * 100
percent_rats = (total_rats / total_animals) * 100
percent_frogs = (total_frogs / total_animals) * 100

print(f"Total: {total_animals} cobaias")
print(f"Total de coelhos: {total_rabbits}")
print(f"Total de ratos: {total_rats}")
print(f"Total de sapos: {total_frogs}")
print(f"Percentual de coelhos: {percent_rabbits:.2f} %")
print(f"Percentual de ratos: {percent_rats:.2f} %")
print(f"Percentual de sapos: {percent_frogs:.2f} %")
