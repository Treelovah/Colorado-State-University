import sys

''' provided
    strings are immutable, but lists are mutable
    replace(s,i,c) turns string s into a list, replaces s[i] with c,
    then turns the list back into a string and returns it
'''


def replace(s, i, c):
    s = list(s)
    s[i] = c
    s = ''.join(s)
    return s


'''
    return a string with n c-s
'''


def stringn(n, c):
  return


'''
  given bit string bs of size n,
  return the next (boolean increment)
  e.g.  '00000' -> '00001'
        '01011' -> '01100'
        '11111' -> '00000'
'''


def next(bs, n):
  return


'''
   return the set of all length n>=2 bitstrings
   that start with '11' or end with '1'
'''


def s11x1(n):
  uhhmm = set()
  for x in range(2**n):
    if bin(x)[2:].startswith('11') or bin(x)[2:].endswith('1'):
      uhhmm.add(bin(x)[2:])
  return uhhmm

'''
   return the set of all length n>=2 bitstrings
   that start with '11'
'''


def s11x(n):
  uhhmm = set()
  for x in range(2**n):
    if bin(x)[2:].startswith('11'):
      uhhmm.add(bin(x)[2:])
  return uhhmm


'''
   return the set of all length n>=2 bitstrings
   that end with '1'
'''


def sx1(n):
  uhmmmm = set()
  for x in range(2**n):
    if bin(x)[2:].endswith('1'):
      uhmmmm.add(bin(x)[2:])
  return uhmmmm

''' provided '''
if __name__ == "__main__":
    # sets of bit strings size n
    # n = int(sys.argv[1])
    n = 7
    if n < 2:
        print('argument must be >= 2')
        sys.exit()
    
    s3 = s11x1(n)
    print('len(s3) =', len(s3))
    s2 = s11x(n)
    print('len(s2) =', len(s2))
    s1 = sx1(n)
    print('len(s1) =', len(s1))
    print('len(s1&s2):', len(s1 & s2))
    print('s3 == s2|s1:', s3 == s2 | s1)
    print('len(s3) == len(s2)+len(s1)-len(s2&s1):',
          len(s3) == len(s2)+len(s1)-len(s2 & s1))
