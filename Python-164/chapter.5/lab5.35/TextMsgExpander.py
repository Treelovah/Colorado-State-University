'''
/*
(1) Use scnr.nextLine(); to get a line of user input into a string. Output that line. (1 pt)

Ex:

Enter text:
IDK how that happened. TTYL. 
You entered: IDK how that happened. TTYL.


(2) Expand common text message abbreviations. Output a message for each abbreviation that is expanded, then output the expanded line. Note: Check for abbreviations in the order provided below. (5 pts)

Support these abbreviations:

    BFF -- best friend forever
    IDK -- I don't know
    JK -- just kidding
    TMI -- too much information
    TTYL -- talk to you later

Ex:

Enter text:
IDK how that happened. TTYL. 
You entered: IDK how that happened. TTYL.

Replaced "IDK" with "I don't know".
Replaced "TTYL" with "talk to you later".

Expanded: I don't know how that happened. talk to you later.

*/
'''
a = input("Enter text: ")
print(f"You entered:\n {a}\n\n")
if "BFF" in a:
    print("Replaced \"BFF\" with \"best friend forever\".")
    a = a.replace("BFF", "best friend forever")
if "IDK" in a:
    print("Replaced \"IDK\" with \"I don't know\".")
    a = a.replace("IDK", "I don't know")
if "JK" in a:
    print("Replaced \"JK\" with \"just kidding\".")
    a = a.replace("JK", "just kidding")
if "TTYL" in a:
    print("Replaced \"JK\" with \"talk to you later\".")
    a = a.replace("TTYL", "talk to you later")

print(a)