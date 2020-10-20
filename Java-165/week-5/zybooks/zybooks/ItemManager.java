    public static void main(String[] args) {
       Item<Integer> itemInt = new Item<Integer>(18);
       Item<Character> itemChar = new Item<Character>('g');
 
       itemInt.updateCount(2); 
       itemInt.updateCount(45); 
 
       itemChar.updateCount('g'); 
       itemChar.updateCount('b'); 
    }
 }