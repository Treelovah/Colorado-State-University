/*
(1) Prompt the user for a title for data. Output the title. (1 pt)

Ex:

Enter a title for the data:
Number of Novels Authored
You entered: Number of Novels Authored


(2) Prompt the user for the headers of two columns of a table. Output the column headers. (1 pt)

Ex:

Enter the column 1 header:
Author name
You entered: Author name

Enter the column 2 header:
Number of novels
You entered: Number of novels


(3) Prompt the user for data points. Data points must be in this format: string, int. Store the information before the comma into a string variable and the information after the comma into an integer. 
The user will enter -1 when they have finished entering data points. Output the data points. Store the string components of the data points in an ArrayList of strings. Store the integer components of the data points in a second ArrayList of integers. (4 pts)

Ex:

Enter a data point (-1 to stop input):
Jane Austen, 6
Data string: Jane Austen
Data integer: 6


(4) Perform error checking for the data point entries. If any of the following errors occurs, output the appropriate error message and prompt again for a valid data point.

    If entry has no comma
        Output: Error: No comma in string. (1 pt)
    If entry has more than one comma
        Output: Error: Too many commas in input. (1 pt)
    If entry after the comma is not an integer
        Output: Error: Comma not followed by an integer. (2 pts)


Ex:

Enter a data point (-1 to stop input):
Ernest Hemingway 9
Error: No comma in string.

Enter a data point (-1 to stop input):
Ernest, Hemingway, 9
Error: Too many commas in input.

Enter a data point (-1 to stop input):
Ernest Hemingway, nine
Error: Comma not followed by an integer.

Enter a data point (-1 to stop input):
Ernest Hemingway, 9
Data string: Ernest Hemingway
Data integer: 9


(5) Output the information in a formatted table. The title is right justified with a minimum of 33 characters. Column 1 is left justified with a minimum of 20 characters. Column 2 is right justified with a minimum of 23 characters. (3 pts)

Ex:

        Number of Novels Authored
Author name         |       Number of novels
--------------------------------------------
Jane Austen         |                      6
Charles Dickens     |                     20
Ernest Hemingway    |                      9
Jack Kerouac        |                     22
F. Scott Fitzgerald |                      8
Mary Shelley        |                      7
Charlotte Bronte    |                      5
Mark Twain          |                     11
Agatha Christie     |                     73
Ian Flemming        |                     14
J.K. Rowling        |                     14
Stephen King        |                     54
Oscar Wilde         |                      1


(6) Output the information as a formatted histogram. Each name is right justified with a minimum of 20 characters. (4 pts)

Ex:

         Jane Austen ******
     Charles Dickens ********************
    Ernest Hemingway *********
        Jack Kerouac **********************
 F. Scott Fitzgerald ********
        Mary Shelley *******
    Charlotte Bronte *****
          Mark Twain ***********
     Agatha Christie *************************************************************************
        Ian Flemming **************
        J.K. Rowling **************
        Stephen King ******************************************************
         Oscar Wilde *


*/
import java.util.ArrayList;
import java.util.Scanner;

public class DataVisualizer {
    public static Scanner scnr = new Scanner(System.in);
    public static ArrayList<String> headers = new ArrayList<String>();
    public static ArrayList<String> dataPointString = new ArrayList<String>();
    public static ArrayList<Integer> dataPointInt = new ArrayList<Integer>();
    public static int count = 0;
    public static String getTitle()
    {
        System.out.printf("Enter a title for the data:\n");
        return scnr.nextLine();
    }
    
    public static void getHeaders()
    {
        for (int i = 1; i < 3; i++) 
        {
            System.out.printf("Enter the column %d header:\n",i);
            headers.add(scnr.nextLine());
            System.out.printf("You entered: %s\n\n",headers.get(i-1));
        }
    }
    
    public static void getDataPoints()
    {
        String str = "";
        String num = "";
        String[] parts;
        String temp = "";
        int commaFreq = 0;

        System.out.printf("Enter a data point (-1 to stop input):\n");
        
        while (!scnr.hasNext("-1"))
        {
            str = scnr.nextLine();
            if (str.contains(","))
            {
                for (char ch : str.toCharArray())
                {
                    temp += ch;
                    if ((ch == ','))
                    {
                        commaFreq++;
                    }
                }
                if (commaFreq > 1)
                {
                    System.out.printf("Error: Too many commas in input.\n\n");
                    getDataPoints();
                    break;
                } else {
                    parts = temp.split(",");
                    for (char ch : parts[1].toCharArray())
                    {
                        if (ch != ' ')
                        {
                            num += ch;
                        }
                    }
                    try {
                        dataPointInt.add(Integer.parseInt(num));
                        dataPointString.add(parts[0]);
                        System.out.printf("Data string: %s\n",dataPointString.get(count));
                        System.out.printf("Data integer: %d\n\n",dataPointInt.get(count));
                        count++;
                    } catch (NumberFormatException ex) {
                        System.out.printf("Error: Comma not followed by an integer.\n\n");
                        getDataPoints();
                        break;
                    }
                    getDataPoints();
                    break;
                }
            } else {
                System.out.printf("Error: No comma in string.\n\n");
                getDataPoints();
                break;
            }
        }
    }
    
    public static void printTable(String title)
    {
        System.out.printf("\n%33s\n",title);
        System.out.printf("%-20s|%23s\n",headers.get(0),headers.get(1));

        for (int i = 0; i < 44; i++)
        {
                System.out.printf("-");
        }
        System.out.printf("\n");
        for (int i = 0; i < dataPointString.size(); i++)
        {
            System.out.printf("%-20s|%23s\n",dataPointString.get(i), dataPointInt.get(i));
        }
    }

    public static void getHistogram()
    {
        System.out.printf("\n");
        for (int i = 0; i < dataPointString.size(); i++)
        {
            String asterisk = "";
            for (int j = 0; j < dataPointInt.get(i); j++)
            {
                asterisk += "*";
            }
            System.out.printf("%20s %s\n",dataPointString.get(i),asterisk);
        }
    }
    
    public static void main(String[] args) {
        String title = getTitle();
        System.out.printf("You entered: %s\n\n",title);
        getHeaders();
        
        getDataPoints();
        printTable(title);
        getHistogram();
    }
}
/*
Number of Musicals Written
Author name
Number of musicals
Stephen Sondheim,19
Leonard Bernstein,8
Elton John,8
Andrew L Webber,17
Galt MacDermot,8
Jonathan Larson,2
John Kander,25
Alain Boublil,3
-1

*/