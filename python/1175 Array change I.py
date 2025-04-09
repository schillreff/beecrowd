# Write a program that reads an array N [20]. After, change the first element by
# the last, the second element by the last but one, etc.., Up to change the 10th
# to the 11th. print the modified array.

# Input
# The input contains 20 integer numbers, positive or negative.

# Output
# For each position of the array N print "N[i] = Y", where i is the array position 
# and Y is the number stored in that position.

# Input Sample	Output Sample
# 0
# -5
# ...
# 63
# 230

# N[0] = 230
# N[1] = 63
# ...
# N[18] = -5
# N[19] = 0


N = [int(input()) for _ in range(20)]
for i in range(10):
    N[i], N[19 - i] = N[19 - i], N[i]
for i in range(20):
    print(f"N[{i}] = {N[i]}")
    
