# Instructions are imported from java 164 class.
# The syntax && logic flow might not follow exact instructions. 
'''
/*
Given two input integers for an arrowhead and arrow body, print a right-facing arrow.

Ex: If the input is:

    0 1

the output is: 

    1
     11
00000111
000001111
00000111
     11
     1

*/
'''
# Get user input and pump it to design function
def lab_program():
    base_char = input()
    head_char = input()
    design(int(base_char), int(head_char))

# Create "=>" image with user input
def design(base_char, head_char):
    print(f"     {head_char}")
    print(f"     {head_char}{head_char}")
    print(f"{base_char}{base_char}{base_char}{base_char}{base_char}{head_char}{head_char}{head_char}")
    print(f"{base_char}{base_char}{base_char}{base_char}{base_char}{head_char}{head_char}{head_char}{head_char}")
    print(f"{base_char}{base_char}{base_char}{base_char}{base_char}{head_char}{head_char}{head_char}")
    print(f"     {head_char}{head_char}")
    print(f"     {head_char}")

lab_program()