public class LLTest {
    public static void main(String args[]) {
        MyLinkedList ll = new MyLinkedList();

        // Testing add methods
        System.out.println("Testing Add");
        ll.add(40);
        ll.add(10);
        ll.add(20);
        ll.add(1, 30);
        ll.add(3, 100);
        ll.add(65);
        ll.add(2);
        System.out.println("Expected: 40 30 10 100 20 65 2");
        System.out.println("Actual: " + ll);
        System.out.println();

        // Testing remove methods
        System.out.println("Testing Remove");
        ll.remove();
        ll.remove(2);
        ll.remove(3);
        ll.remove((Integer)2);
        System.out.println("Expected: 30 10 20");
        System.out.println("Actual: " + ll);
        System.out.println("Size should be 3 -> " + ll.size());
        System.out.println();

        // Testing Contains
        System.out.println("Testing Contains");
        ll.add(2); // to make it a little bigger
        System.out.println("Should be true -> " + ll.contains(2));
        System.out.println("Should be false -> " + ll.contains(65));
        System.out.println("Should be true -> " + ll.contains(30));
        System.out.println();

        // Testing Get
        System.out.println("Testing Get");
        System.out.println("Actual list: " + ll);
        System.out.print("List using get: ");
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
        System.out.println("\n");

        // Testing indexOf
        System.out.println("Testing indexOf");
        System.out.println("Should be 2 -> " + ll.indexOf(20));
        System.out.println("Should be 3 -> " + ll.indexOf(2));
        System.out.println("Should be -1 -> " + ll.indexOf(65));

        // You can write more tests (these are not all encompassing)
        // When should these methods fail/throw exceptions?
        // Have all of the edge cases been tested?
        // Not quite all of the methods have been tested here (e.g. clear())
        
        // Honestly, this was a big waste of time for me. Why are we learning linked list, or anything in this course for that matter, with java, is beyond me.
        // This would be better taught with cpp, due to the fact that we are dealing with pointers, and understanding how pointers work (from a programming perspective)
        // is typically a very uncomfortable place for the programmer to be. Learning to properly deal with memory is more useful than this conceptual java bs.
        // I am very disappointed with the overall education I have received thus far at CSU in the CS department. It has not helped me with my career as a software developer nor as
        // System administrator due to the high levels of abstraction, lack of professor presence and engagement, choice of language, and awful teaching assistants.
        // Speaking of TAs, the TAs need to get their ego checked. Noone likes learning from a bunch of elitest try hards that aren't even that good to begin with. 
        // This should be a collaborative, helpful, educational environment. Not some weener size comparing contest, along with belittling students for not knowing how something works.
        // It's apalling, incredibly distatful, and not educational. The sheer thought of a TA or Teacher belittling anyone for not knowing something they do is horrendous.
        // And it happens more often that not here at CSU, especially in the 164 and 165 java courses.
        // Just because someone is not versed in Java, doesn't make them stupid, or give you the right as an eductor to talk down to another student.
        // I will not be going into specifics in this post, as I feel that would be singling out individuals and causing a disruptance of which is not my goal.
        // However, this all needed to be said, because the bulk of students here don't have a clue regarding the future failures they are being set up for by learning this way.
        // I hope that the faculty care enough to look into the concerns brought up above. 
    }
}
