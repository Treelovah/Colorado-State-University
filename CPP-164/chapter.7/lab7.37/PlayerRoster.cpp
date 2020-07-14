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
#include <iostream>
#include <array>

std::array<int, 5> jersey_arr;
std::array<int, 5> rating_arr;

void print_roster();
void update_player_rating();
void menu();

void get_roster() {
    for (int i = 0; i < 5; i++) {
        printf("Enter player %d's jersey number:\n",i + 1);
        std::cin >> jersey_arr[i];
        printf("Enter player %d's rating:\n",i + 1);
        std::cin >> rating_arr[i];
        printf("\n");
    }
    print_roster();
}

void print_roster() {
    printf("ROSTER\n");
    for (int i = 0; i < 5; i++) {
        printf("Player %d -- Jersey number: %d, Rating: %d\n", i+1, jersey_arr[i], rating_arr[i]);
    }
    printf("\n");
}

void menu() {
    printf("MENU\n");
    printf("u - Update player rating\n");
    printf("a - Output players above a rating\n");
    printf("r - Replace player\n");
    printf("o - Output roster\n");
    printf("q - Quit\n");
    printf("\nChoose an option:\n");
    
    // switch for readibility.
    switch (std::getchar()) {
    case 'u':
        update_player_rating();
        menu();
        break;
    case 'a':
        printf("Enter a rating:\n");
        int user_rating;
        std::cin >> user_rating;
        printf("\nABOVE %d\n",user_rating);
        for (int i = 0; i < jersey_arr.size(); i++) {
            if (rating_arr[i] > user_rating) {
                printf("Player %d -- Jersey number: %d, Rating %d\n",i + 1, jersey_arr[i], rating_arr[i]);
            }
        }
        printf("\n");
        menu();
        break;
    case 'r':
        printf("Enter a jersey number:\n");
        int jersey;
        std::cin >> jersey;
        for (int i = 0; i < jersey_arr.size(); i++) {
            if (jersey_arr[i] == jersey) {
                printf("Enter a new jersey number:\n");
                std::cin >> jersey_arr[i];
                printf("Enter a rating for the new player\n");
                std::cin >> rating_arr[i];
            }
        }
        menu();
        break;
    case 'o':
        print_roster();
        menu();
        break;
    case 'q':
        break;
    default:
        menu();
        break;
    }
}

void update_player_rating() {
    printf("Enter a jersey number:\n");
    int jers_num;
    std::cin >> jers_num;
    for (int i : jersey_arr) {
        if (i == jers_num) {
            printf("Enter a new rating for player:\n");
            std::cin >> rating_arr[i];
        }
    }
    printf("\n");
}

int main() {
    get_roster();
    menu();
    return 0;
}
