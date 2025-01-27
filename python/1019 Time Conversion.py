# Read an integer value, which is the duration in seconds of a certain event
#  in a factory, and inform it expressed in hours:minutes:seconds.

# Input
# The input file contains an integer N.

# Output
# Print the read time in the input file (seconds) converted in
#  hours:minutes:seconds like the following example.

# Input Sample	Output Sample
# 556

# 0:9:16

# 1

# 0:0:1

# 140153

# 38:55:53


seconds = int(input())

hours = seconds // 3600
seconds %= 3600
minutes = seconds // 60
seconds %= 60

print(f"{hours}:{minutes}:{seconds}")
