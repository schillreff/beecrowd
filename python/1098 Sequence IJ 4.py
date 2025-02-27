# Make a program that prints the sequence like the following example.

# Input
# This problem doesn't have input.

# Output
# Print the sequence like the example below.

# Input Sample	Output Sample
# I=0 J=1
# I=0 J=2
# I=0 J=3
# I=0.2 J=1.2
# I=0.2 J=2.2
# I=0.2 J=3.2
# .....
# I=2 J=?
# I=2 J=?
# I=2 J=?

for i in range(0, 21, 2):
    i = i / 10
    for j in range(1, 4):
        if abs(i - round(i)) < 1e-9:
            print(f"I={round(i)} J={round(j + i)}")
        else:
            print(f"I={i:.1f} J={(j + i):.1f}")
