# Instructions are imported from java 164 class.
# The syntax && logic flow might not follow exact instructions. 
'''
/*
(1) Prompt the user to input an integer, a double, a character, and a string, storing each into separate variables. Then, output those four values on a single line separated by a space. (2 pts)

Note: This zyLab outputs a newline after each user-input prompt. For convenience in the examples below, the user's input value is shown on the next line, but such values don't actually appear as output when the program runs.

    Enter integer:
    
    99
    Enter double:
    3.77
    Enter character:
    z
    Enter string:
    Howdy
    99 3.77 z Howdy

(2) Extend to also output in reverse. (1 pt)

    Enter integer:
    99
    Enter double:
    3.77
    Enter character:
    z
    Enter string:
    Howdy
    99 3.77 z Howdy
    Howdy z 3.77 99


(3) Extend to cast the double to an integer, and output that integer. (2 pts)

    Enter integer:
    9
    Enter double:
    3.77
    Enter character:
    z
    Enter string:
    Howdy
    99 3.77 z Howdy
    Howdy z 3.77 99
    3.77 cast to an integer is 3

*/
'''

def get_input():
    user_int = input("Enter integer: ")
    user_double = input("Enter double: ")
    user_char = input("Enter char: ")
    user_string = input("Enter string: ")
    format_input(int(user_int), float(user_double), user_char[0], user_string)

def format_input(user_int, user_double, user_char, user_string):
    print(f"{user_int} {user_double} {user_char[0]} {user_string}")
    print(f"{user_string} {user_char[0]} {user_double} {user_int}")
    print(f"{user_double} cast to an integer is {int(user_double)}")

get_input()