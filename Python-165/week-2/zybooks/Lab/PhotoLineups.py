from itertools import permutations

names = input("#: ").split()
perm = permutations(names)

for i in perm:
    print(i)