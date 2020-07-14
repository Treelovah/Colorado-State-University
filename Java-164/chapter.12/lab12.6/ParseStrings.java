import java.util.Scanner;

public class ParseStrings {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean check = false;
        do 
        {
            String str, firstName, lastName;
            String[] parts;
            String temp = "";
            
            System.out.printf("Enter input string:\n");
            str = scnr.nextLine();
            for (int i = 0; i < str.length(); i++)
            {
                char ch = str.charAt(i);
                if (ch != ' ')
                {
                    temp += ch;
                }
            }
            if (str.equals("q"))
            {
                check = true;
                break;
            }
            if (!temp.contains(","))
            {
                System.out.printf("Error: No comma in string.\n\n");
            } else
            {
                temp.split(",");
                parts = temp.split(",");
                firstName = parts[0];
                lastName = parts[1];
                System.out.printf("First word: %s\n",firstName);
                System.out.printf("Second word: %s\n\n",lastName);
            }
 
        } while (check != true);
        scnr.close();
   }
}