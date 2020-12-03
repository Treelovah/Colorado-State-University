import sys

coins = [1, 5, 10, 25]


def partitions(n, k):

    if k == n or k == 1:

        return 1

    else:

        return k*partitions(n-1, k) + partitions(n-1, k-1)


def mkCh(a, c):

    if a == 0:
        return 1
    if a < 0:
        return 0
    if c < 0:
        return 0
    return mkCh(a, c-1) + mkCh(a-coins[c], c)

if __name__ == "__main__":

    # partititions
    d = len(sys.argv) > 3

    n = int(sys.argv[1])

    k = int(sys.argv[2])

    p = partitions(n, k)

    print("n:", n, "k:", k, "partitions:", p)


    # make change

    c = len(coins)-1

    a = 10*n+k

    ways = mkCh(a, c)

    print("amount:", a, "coins:", coins, "ways:", ways)
