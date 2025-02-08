# Peter is organizing an event in his University. The event will be in April
#  month, beginning and finishing within April month. The problem is: Peter
#  wants to calculate the event duration in seconds, knowing obviously the
# begin and the end time of the event.

# You know that the event can take from few seconds to some days, so, you must
#  help Peter to compute the total time corresponding to duration of the event.

# Input
# The first line of the input contains information about the beginning day of
#  the event in the format: “Dia xx”. The next line contains the start time of
#  the event in the format presented in the sample input. Follow 2 input lines
# with same format, corresponding to the end of the event.

# Output
# Your program must print the following output, one information by line,
# considering that if any information is null for example, the number
#  0 must be printed in place of W, X, Y or Z:

# W dia(s)
# X hora(s)
# Y minuto(s)
# Z segundo(s)

# Obs: Consider that the event of the test case have the minimum duration
# of one minute. “dia” means day, “hora” means hour, “minuto” means minute
# and “Segundo” means second in Portuguese.

# Input Sample	Output Sample
# Dia 5
# 08 : 12 : 23
# Dia 9
# 06 : 13 : 23

# 3 dia(s)
# 22 hora(s)
# 1 minuto(s)
# 0 segundo(s)


start_day = int(input().split()[1])
start_time, start_minute, start_second = list(map(int, input().split(" : ")))

end_day = int(input().split()[1])
end_time, end_minute, end_second = list(map(int, input().split(" : ")))

start_seconds = start_day * 86400 + start_time * 3600 + start_minute * 60 + start_second
end_seconds = end_day * 86400 + end_time * 3600 + end_minute * 60 + end_second

duration = end_seconds - start_seconds

days = duration // 86400
duration %= 86400
hours = duration // 3600
duration %= 3600
minutes = duration // 60
seconds = duration % 60

print(f"{days} dia(s)")
print(f"{hours} hora(s)")
print(f"{minutes} minuto(s)")
print(f"{seconds} segundo(s)")
