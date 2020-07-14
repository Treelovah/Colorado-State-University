# Instructions are imported from java 164 class.
# The syntax && logic flow might not follow exact instructions. 
'''
/*
Mad Libs are activities that have a person provide various words, which are then used to complete a short story in unexpected (and hopefully funny) ways.

Complete the program to read the needed values from input, that the existing output statement(s) can use to output a short story.

Ex: If the input is:

    Eric Chipotle 12 cars

the output is: 

    Eric went to Chipotle to buy 12 different types of cars.

*/
'''
first_name = input()
generic_location = input()
whole_number = input()
plural_noun = input()
print(f"{first_name} went to {generic_location} to buy {int(whole_number)} different types of {plural_noun}")