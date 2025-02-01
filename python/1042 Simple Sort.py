# Read three integers and sort them in ascending order. After, print these values
#  in ascending order, a blank line and then the values in the sequence as they were readed.

# Input
# The input contains three integer numbers.

# Output
# Present the output as requested above.

# Input Sample	Output Sample
# 7 21 -14

# -14
# 7
# 21

# 7
# 21
# -14

# -14 21 7

# -14
# 7
# 21

# -14
# 21
# 7

values = [int(value) for value in input().split(" ")]

ascendingOrder = values[:]

ascendingOrder.sort()

for element in ascendingOrder:
    print(element)
print()
for element in values:
    print(element)
