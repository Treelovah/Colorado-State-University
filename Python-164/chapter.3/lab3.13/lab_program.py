# Instructions are imported from java 164 class.
# The syntax && logic flow might not follow exact instructions.
'''
/* Write a program using integers userNum and x as input, and output userNum divided by x three times.
Ex: If the input is:
    2000 2
the output is:
    1000 500 250
no extra whitespace, the end must be a newline. go
*/
'''

user_num = input()
x = input()
a = 0

for i in range(0, 3):
    user_num = (int(user_num) / int(x))
    if a < 2:
        print(f"{user_num}", end=' ')
        a += 1
    else:
        print(f"{user_num}")