'''
/*
(1) If a user's input string matches a known text message abbreviation, output the unabbreviated form, else output: Unknown. 

Support two abbreviations: LOL -- laughing out loud, and IDK -- I don't know. (4 pts)

Sample input/output:

Input an abbreviation:
LOL
laughing out loud


(2) Expand to also decode these abbreviations. (3 pts)

    BFF -- best friends forever
    IMHO -- in my humble opinion
    TMI -- too much information
*/
'''
# a hacked version of a python switch statement ^_^
def abbrev(i):
    switcher = {
        "LOL":"Laughing out loud",
        "IDK":"I don't know",
        "BFF":"best friends forever",
        "IMHO":"in my humble opinion",
        "TMI":"too much information"
    }
    return switcher.get(i,"Unkown")

print(abbrev(input()))