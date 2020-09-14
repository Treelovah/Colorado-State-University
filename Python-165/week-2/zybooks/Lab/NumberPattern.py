def print_num_patter(num1, num2):
    if (num1 == 0):
        print(num1)
    else:
        print_num_patter(num1 - num2, num2)
        print(num1)

print_num_patter(5, 1)