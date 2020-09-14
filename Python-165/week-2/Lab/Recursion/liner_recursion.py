from math import pow


'''
* params: integer n
* return: n! or n * (n - 1) * (n - 2) * ... * 1
* TODO: implement this method
'''
def factorial(n):
    return 1 if (n == 0) else (n * factorial(n - 1))

'''
* params: integer n
* return: n + (n - 1) + (n - 2) + ... + 1
* TODO: implement this method
'''
def sum(n):
    return 0 if (n == 0) else (n + sum(n-1))

'''
* Recursively return the sum of the harmonic series.
* params: n a positive number.
* return: the sum 1 + 1/2 + 1/3 + ... + 1/(n-1) + 1/n
* TODO: implement this method
'''
def harmonic_sum(n):
    return 0 if (n == 0) else (1.0 / n + (harmonic_sum(n - 1)))

'''
* Recursively return the sum of the geometric series.
* params: n a non-negative number.
* return: the sum 1 + 1/2 + 1/4 + 1/8 + ... + 1/Math.pow(2,n)
* TODO: implement this method
'''
def geometric_sum(n):
    return 1 if (n == 0) else (1.0 / pow(2,n) + geometric_sum(n - 1))


## Driver code
print("Testing the factorial method(")  
print(f"factorial(4) should be 24 -> {factorial(4)}")
print(f"factorial(6) should be 720 -> {factorial(6)}")
print(f"factorial(0) should be 1 -> {factorial(0)}")  
print()  
  
print("Testing the summation method()")
print(f"sum(4) should be 10 -> {sum(4)}")  
print(f"sum(10) should be 55 -> {sum(10)}") 
print(f"sum(0) should be 0 -> {sum(0)}")
  
print(f"Testing out the harmonic_sum method(")  
print(f"harmonic_sum(0) should be 0.0000 -> {harmonic_sum(0)}")
print(f"harmonic_sum(7) should be 2.5929 -> {harmonic_sum(7)}")
print(f"harmonic_sum(8) should be 2.7179 -> {harmonic_sum(8)}")
print(f"harmonic_sum(13) should be 3.1801 -> {harmonic_sum(13)}")
print(f"harmonic_sum(24) should be 3.7760 -> {harmonic_sum(24)}")
print()  
  
print("Testing out the geometric_sum method(")  
print(f"geometric_sum(0) should be 1.0000 -> {geometric_sum(0)})")
print(f"geometric_sum(1) should be 1.5000 -> {geometric_sum(1)}")
print(f"geometric_sum(2) should be 1.7500 -> % {geometric_sum(2)}")
print(f"geometric_sum(7) should be 1.9922 -> % {geometric_sum(7)}")
print(f"geometric_sum(24) should be 2.0000 -> % {geometric_sum(24)}")
print() 