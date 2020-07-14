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
84
7
23
4
4
5
30
2
66
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
import java.util.Scanner;

public class PlayerRoster {
    public static int[] jerseyArr = new int[5];
    public static int[] ratingArr = new int[5];
    static Scanner scnr = new Scanner(System.in);

    public static void getRoster() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter player %d's jersey number:\n", i + 1);
            jerseyArr[i] = scnr.nextInt(); 
            System.out.printf("Enter player %d's rating:\n", i + 1);
            ratingArr[i] = scnr.nextInt();
            System.out.println();
        }
        printRoster();
    }

    public static void printRoster() {

        int count = 1;
        System.out.println("ROSTER");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Player %d -- Jersey number: %d, Rating: %d\n", count, jerseyArr[i], ratingArr[i]);
            count++;
        }
        System.out.println();
    }

    public static void updatePlayerRating() {
        System.out.println("Enter a jersey number:");
        int jersNum = scnr.nextInt();
        for (int i = 0; i < jerseyArr.length; i++) {
            if (jerseyArr[i] == jersNum) {
                System.out.println("Enter a new rating for player:");
                ratingArr[i] = scnr.nextInt();
            }
        }
    }

    public static void menu() {
        System.out.println("MENU");
        System.out.println("u - Update player rating");
        System.out.println("a - Output players above a rating");
        System.out.println("r - Replace player");
        System.out.println("o - Output roster");
        System.out.println("q - Quit");
        System.out.printf("\nChoose an option:\n");

        // use a switch here.
        switch (scnr.next()) {
            case ("u"):
                updatePlayerRating();
                menu();
                break;
            case ("a"):
                System.out.printf("Enter a rating:\n");
                int user_input = scnr.nextInt();
                System.out.printf("\nABOVE %d\n", user_input);
                for (int i = 0; i < ratingArr.length; i++) {
                    if (ratingArr[i] > user_input) {
                        System.out.printf("Player %d -- Jersey number: %d, Rating: %d\n", i + 1, jerseyArr[i],
                                ratingArr[i]);
                    }
                }
                System.out.println();
                menu();
                break;
            case ("r"):
                System.out.println("Enter a jersey number:");
                int jersey = scnr.nextInt();
                for (int i = 0; i < jerseyArr.length; i++) {
                    if (jerseyArr[i] == jersey) {
                        System.out.println("Enter a new jersey number:");
                        jerseyArr[i] = scnr.nextInt();
                        System.out.println("Enter a rating for the new player");
                        ratingArr[i] = scnr.nextInt();
                    }
                }
                menu();
                break;
            case ("o"):
                printRoster();
                menu();
                break;
            case ("q"):
                break;
            default:
                menu();
                break;
        }
        scnr.close();
    }

    public static void main(String[] args) {
        getRoster();
        menu();
    }
}
