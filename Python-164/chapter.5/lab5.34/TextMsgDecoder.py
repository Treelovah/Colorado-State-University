'''
/*


(1) Use scnr.nextLine() to get a line of user input into a string. 

Output the line. (3 pts)

Ex:

Enter text:
IDK if I'll go. It's my BFF's birthday. 
You entered: IDK if I'll go. It's my BFF's birthday.


(2) Search the string (using indexOf()) for common abbreviations and print a list of each 

found abbreviation along with its decoded meaning. (3 pts)

Ex:

Enter text:
IDK if I'll go. It's my BFF's birthday. 
You entered: IDK if I'll go. It's my BFF's birthday. 
BFF: best friend forever
IDK: I don't know

Support these abbreviations:

    BFF -- best friend forever
    IDK -- I don't know
    JK -- just kidding
    TMI -- too much information
    TTYL -- talk to you later

*/
'''
userInput = input("Enter text: ")
print(f"you entered: {userInput}")
if 'BFF' in userInput:
    print("BFF: best friend forever")
if 'IDK' in userInput:
    print("IDK: I don't know")
if 'JK' in userInput:
    print("JK: just kidding")
if 'TMI' in userInput:
    print("TMI: too much information")
if 'TTYL' in userInput:
    print("TTYL: talk to you later")