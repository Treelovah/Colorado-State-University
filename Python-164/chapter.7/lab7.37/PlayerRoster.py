'''
/*
This program will store roster and rating information for a soccer team. Coaches rate players during tryouts to ensure a balanced team.

(1) Prompt the user to input five pairs of numbers: A player's jersey number (0 - 99) and the player's rating (1 - 9). Store the jersey numbers in one int array and the ratings in another int array. 

Output these arrays (i.e., output the roster). (3 pts)

Ex:

Enter player 1's jersey number:
84
Enter player 1's rating:
7

Enter player 2's jersey number:
23
Enter player 2's rating:
4

Enter player 3's jersey number:
4
Enter player 3's rating:
5

Enter player 4's jersey number:
30
Enter player 4's rating:
2

Enter player 5's jersey number:
66
Enter player 5's rating:
9

ROSTER
Player 1 -- Jersey number: 84, Rating: 7
Player 2 -- Jersey number: 23, Rating: 4
...

(2) Implement a menu of options for a user to modify the roster. Each option is represented by a single character. The program initially outputs the menu, and outputs the menu after a user chooses an option. 

The program ends when the user chooses the option to Quit. For this step, the other options do nothing. (2 pt)

Ex:

MENU
u - Update player rating
a - Output players above a rating
r - Replace player
o - Output roster
q - Quit

Choose an option: 

(3) Implement the "Output roster" menu option. (1 pt)

Ex:

ROSTER
Player 1 -- Jersey number: 84, Rating: 7
Player 2 -- Jersey number: 23, Rating: 4
...

(4) Implement the "Update player rating" menu option. Prompt the user for a player's jersey number. Prompt again for a new rating for the player, and then change that player's rating. (1 pt)

Ex:

Enter a jersey number:
23
Enter a new rating for player:
6
...

(5) Implement the "Output players above a rating" menu option. Prompt the user for a rating. Print the jersey number and rating for all players with ratings above the entered value. (2 pts)

Ex:

Enter a rating:
5

ABOVE 5
Player 1 -- Jersey number: 84, Rating: 7
...

(6) Implement the "Replace player" menu option. Prompt the user for the jersey number of the player to replace. If the player is in the roster, then prompt again for a new jersey number and rating. 

Update the replaced player's jersey number and rating. (2 pts)

Ex:

Enter a jersey number:
4
Enter a new jersey number:
12
Enter a rating for the new player:
8

*/
'''
jerseyNumbers = []
playerRating = []

def getRoster():
    for i in range(1,6):
       jerseyNumbers.append(int(input(f"Enter player {i}'s jersey:\n")))
       playerRating.append(int(input(f"Enter player {i}'s rating:\n")))
       print()


def printRoster():
    count = 1
    print("ROSTER")
    for i in range(5):
        print(f"Player {count} -- Jersey number: {jerseyNumbers[i]}, Rating: {playerRating[i]}")
        count = count + 1

def replacePlayer():
    jersNum = int(input("Enter a jersey number:\n"))
    for i in range(5):
        if jerseyNumbers[i] == jersNum:
            jerseyNumbers[i] = int(input("Enter a new jersey number:\n"))
            playerRating[i] = int(input("Enter a rating for the new player:\n"))
        
def updatePlayerRating():
    jersNum = int(input("Enter a jersey number:\n"))
    for i in range(5):
        if jerseyNumbers[i] == jersNum:
            playerRating[i] = input("Enter a new rating for player:\n")

def menu():
    print("""
        u - Update player rating
        a - Output players above rating
        r - Replace player
        o - Output Roster
        q - Quit

        Choose an option:""")
    case = input()
    if case == "u":
        updatePlayerRating()
        menu()
    elif case == "a":
        rating = int(input("Enter a rating:\n"))
        for i in range(5):
            if playerRating[i] > rating:
                print(f"Player {i+1} -- Jersey number {jerseyNumbers[i]}, Rating: {playerRating[i]}")
        menu()
    elif case == "o":
        print()
        printRoster()
        menu()
    elif case == "r":
        replacePlayer()
        menu()
    elif case == "q":
        exit()
    else:
        print("Please enter something on the menu.")
        menu()
getRoster()
menu()