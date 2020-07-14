# Instructions are imported from java 164 class.
# The syntax && logic flow might not follow exact instructions. 
'''
/*
Sites like Zillow get input about house prices from a database and provide nice summaries for readers. Write a program with two inputs, current price and last month's price (both integers). Then, output a summary listing the price, the change since last month, and the estimated monthly mortgage computed as (currentPrice * 0.051) / 12 (Note: Output directly. Do not store in a variable.).

Ex: If the input is:

    200000 210000

the output is: 

    This house is $200000. The change is $-10000 since last month.
    The estimated monthly mortgage is $850.0.

Note: Getting the precise spacing, punctuation, and newlines exactly right is a key point of this assignment. Such precision is an important part of programming.
*/
'''

def get_input():
    current_price = input()
    last_months_price = input()
    lab_program(int(current_price), int(last_months_price))

def lab_program(current_price, last_months_price):
    print(f"This house is ${current_price}. The change is ${current_price - last_months_price} since last month.")
    print(f"The estimated monthly mortgage is ${(current_price * 0.051) / 12}")

get_input()