
public class Testing {
    public static int recursiveCall(int num)
    {
        System.out.println(num);
        if (num <= 1) return 1;  // base case
        else
        {
            recursiveCall(num - 1);
            System.out.println(num);
            return num;
        }
    }

   
   /* stringClean()
   * Given a string, return recursively a "cleaned" string
   * where adjacent chars that are the same have been reduced
   * to a single char. So "yyzzza" yields "yza".
   */
    public static String stringClean(String str){
        if (str.length() <= 1) return str; // base case
        if (str.substring(1,2).equals(str.substring(0,1)) ) return stringClean(str.substring(1));
        else return str.substring(0,1) + stringClean(str.substring(1));
    }

    /* palindromeChecker()
    * Given a string, check if it is a palindrome recursively. 
    * Return true if the given word is a palindrome, and false if it is not.
    * For example, "abcba" would yield true, but "abc" would not. 
    * A word is a palindrome if the letters in the word are symmetric.
    */
    public static boolean palindromeChecker(String word){
        if (word.length() == 0 || word.length() == 1) return true;
        if (word.charAt(0) == word.charAt(word.length() -1)) return palindromeChecker(word.substring(1, word.length() -1));
        else return false;
    }

    /* totalWord()
    * Given a string, recursively find the sum of the integer values of the characters in the word.
    * Since characters have corresponding integer values from the ASCII table, you are able to sum them into a single integer.
    * For example, if given "abc", the method would return 294.
    */
    public static int totalWord(String word){
        if (word.length() == 1) return ((int)word.charAt(0));
        else return (int)word.charAt(0) + totalWord(word.substring(1));
        /*
        Bonus points, in this scenario the string (char array) is a stack, where you pop the value off the top of the stack, 
        then the stack is then sent into the same function to repeat until the stack has been depleted. 
        Since it's java this is going to be memory inefficient because str.substring(1) allocates memory for the new copy of the string, 
        so it's only conceptually a stack at a high level but in reality it is just copies of arrays.
        */
    }

    /*
    * The following method is given to you, and you will be responsible for completing the permutationHelper method it calls.
    * Sometimes, helper methods are used for recursive methods when another parameter is needed to recursively call a method repeatedly, but passing that parameter initially doesn't make sense.
    */
    public static String permutation(String word){
        return permutationHelper(" ", word);
    }

    /* permutationHelper()
    * This method is called by the permutation method.
    * Given a string, return a string that lists all possible permutations of the letters in the string, with spaces preceding each permutation.
    * For example, "123" would give "123 132 213 231 312 321". 
    * The perm parameter keeps track of the current permutation you are creating.
    * Consider using the a for loop to call the method recursively a certain number of times with different parameters, so you cover all permutations.
    */
    public static String permutationHelper(String perm, String word) {
        if (word.isEmpty()) System.out.print(perm);
        for (int i = 0; i < word.length(); i++)
        {
            permutationHelper(perm + word.charAt(i), word.substring(0, i) + word.substring(i+1, word.length()));
        }
        return perm;
    }   
    public static void main(String[] args) {
        // System.out.println(stringClean("yyzzza")); 
        System.out.println(totalWord("abc"));
        permutation("123");
    }
}
// if string.length is == 1 return (int)string
// bcdefg
// cdefg
