# Write a program that reads a number N. This N is the size of a array X[N].
# Next, read each of the numbers of X, find the smallest element of this array
# and its position within the array, printing this information.

# Input
# The first line of input contains one integer N (1 < N <1000), indicating the
# number of elements that should be read to an array X[N] of integer numbers.
# The second row contains each of the N values, separated by a space. Remember
# that no input will have repeated numbers.

# Output
# The first line displays the message “Menor valor:” followed by a space and
# the lowest number read in the input. The second line displays the message
# “Posicao:” followed by a space and the array position in which the lowest
# number is, remembering that the array starts at the zero position.

# Input Sample	Output Sample
# 10
# 1 2 3 4 -5 6 7 8 9 10

# Menor valor: -5
# Posicao: 4

N = int(input())

if 1 < N < 1000:
    line = input()

    numbers_str = line.split()

    X = []
    for s in numbers_str:
        X.append(int(s))

    menor_valor = X[0]
    posicao = 0

    for i in range(1, N):
        if X[i] < menor_valor:
            menor_valor = X[i]
            posicao = i

    print(f"Menor valor: {menor_valor}")
    print(f"Posicao: {posicao}")
