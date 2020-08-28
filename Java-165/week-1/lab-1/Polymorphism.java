import java.util.ArrayList;

public class Polymorphism {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person jennifer = new Person("Jennifer", 40);
        Person michael = new Employee("Michael", 56, 370_000, "Dunder Mifflin");
        Person david = new Manager("David", 39, 13_000_000, "Dunder Mifflin");

        people.add(jennifer);
        people.add(michael);
        people.add(david);

        for (int i = 0; i < people.size(); i++) {
            Person p = people.get(i);
            System.out.println(p.toString());
        }

        /* Look at and run the code above, then take a moment to think about the
         * following questions. Write down your answers somewhere.
         *
         * 1. How is it that we were able to store an Employee or a Manager in a
         * variable that has a type Person?
         * 
         * Answer: We have an ArrayList of Type class Person, which is our parent class.
         *
         * 2. When we called the toString() method on each of the people in the
         * list, it resulted in something totally different. Why? They're all
         * stored in variables of type Person, so why would they not be the
         * same?
         * 
         * Answer: This is due to how virtual functions operate under the hood of java. 
         * In java, every method is considered a virtual method (adopted from c++ virtual functions) due to its efficiency at runtime. 
         * When an Array of type Person is created and people.get(i) is assigned to it, the compiler looks at this as a pointer, and uses vtables and vptrs to trace each method pointer back to the original method. Cool Stuff! Thanks c++!
         * 
         * 3. We wrote three different versions of toString() across three
         * different classes. When we call p.toString(), which one of these
         * versions does Java use, and why?
         * 
         * Answer: My response above answers this question directly. 
         * p.toString() is actually using a ptr that is pointing to 'its' own method. 
         * thanks to the key word 'this' this can be done efficiently with vtables and vptrs.
         */

         // Consider the following code:
         //michael.setSalary(800000);

         /* 
          * 4. Will this code cause errors? Uncomment it and see.
          *
          * Answer: yes! it will. michael is of type Person. Not of type Employee.
          * To fix this, you could add cast to michael. Something like this:
          *
          *               ((Employee) michael).setSalary(800000);
          *
          * 5. You should have found that the above code results in a
          * compilation error. Why can't Java figure out what to do? Employee
          * has a perfectly valid setSalary method, doesn't it?
          * 
          * Answer: Please reference the above answer for this answer. 
          */

         /* Now consider this code: */
         Employee anotherMichael = new Employee("Michael", 56, 370000, "Dunder Mifflin");

         /* This is the exact same person as above, the only difference is that
          * we've stored it in a variable of type Employee instead of a variable
          * of type Person. If we try */

         //anotherMichael.setSalary(800000);

         /* Will it work? Make a guess, then uncomment the line and see.
          *
          * Answer: Yes, the type is now of Employee, which has the setSalary() method housed.
          *
          * 6. You should have found that this code DOES NOT produce a
          * compilation error. Why?
          * 
          * Answer: The type Employee owns the virtual method setSalary() 
          */

         /* 7. What you have just seen in action from the previous few questions
          * is known as dynamic binding. Describe what dynamic binding is, in
          * your own words.
          *
          * Answer: To understand dynamic binding, we first must take a quick peek at binding.
          * Binding (in abstract view) converts variables, functions, and other performance names into addresses.
          * Binding takes place at either compile time, or run time. These are often referred to as Early Binding (compile time) and Late Binding (run time) 
          * Late Binding (aka dynamic binding) happens during the LATER part of the program, run time.
          * This brings us to virtual functions, which java loved so much, they made every method in java take the role of virtual function, which was adopted from C++.
          * This concept is also known as RunTime Polymorphism and is acheived by using base class pointers to point to derived class objects.
          */
    }
}
