1. We want to define an interface Growable. Many things are Growable. Fill in the blank in the given header.

public interface Growable 
{ ... }

2. We want to declare an interface Readable. It has one method read(). Read() takes no parameters and is void. 
Complete the code

public interface Readable
{  void read();  }

3. A class Dog wishes to implement the Growable interace. Complete the class header to do that.

public class Dog implements Growable

4. The class Billboard implements the Readable interface. It has one method read() which is void and takes no parameters. 
Bill board may contain many methods but there is one method that is required. Provide the header for that method

public void read()
{  ..  }

5. What is the name of the method that a class must provide if the class implements the Comparable interface from 
the standard Java library?

compareTo()

6. // Here is a class called UnitCircle. Its radius is an int. A couple of methods have been
// provided.

// Add the code so that the UnitCircle class implements the Comparable interface

/**
 * Represents a circle whose radius is multiples of the unit circle - a circle with radius 1
 */
// TODO: add everything necessary for this class to implement Comparable
// HINT: There are two things you need to do
public class UnitCircle implements Comparable<UnitCircle>
{
    private int radius;

    public UnitCircle(int radius)
    {
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public String toString()
    {
        return "UnitCircle[r=" + radius + "]";
    }

    //... other methods
    public int compareTo(UnitCircle x)
    {
        int answer = x.getRadius();
        if (answer < radius) {return 1;}
        else if (answer == radius) {return 0;}
        else return -1;
    }
}

=============================================================================
7. String and Integer classes both implement the Comparable interface.
For each of the following statements mark if it is valid or invalid

Comparable c1 = new String("Hello");	valid
Comparable c2 = new Integer(42);		valid
Comparable c3 = new Comparable();		invalid
String s = c1;							invalid

=============================================================================

8. // Complete the method getLength() which takes a Comparable object as its parameter.
// If the parameter references a String object, return the length of the String
// otherwise return -1.

public class DataMethods
{
    /**
     * Gets the length of the object if it is a string
     * @param c the object wehose length we want
     * @return the length if the object is a string otherwise -1
     */

    // TODO: implement the method described by this javadoc
    public int getLength ( Comparable c)
    {
        if (c instanceof String)
        {
         //   String thisisastring = (String) c;
         //   return thisisastring.length();
            return ((String) c).length();
        }
        else { return -1; }
    }
    
}
=============================================================================
9. // Add static method to the Data class to return the smallest object in
// an array of objects that implement the measurable interface

public class Data
{
    /**
       Computes the average measure of the given objects.
       @param objects an array of Measurable objects
       @return the average of the measures
    */
    public static double average(Measurable[] objects)
    {
        double sum = 0;
        for (Measurable obj : objects)
        {
            sum = sum + obj.getMeasure();
        }
        if (objects.length > 0)
        {
            return sum / objects.length;
        }
        else
        {
            return 0;
        }
    }

    /**
       Computes the largest of the given objects.
       @param objects an array of Measurable objects
       @return the object with the largest measure
    */
    public static Measurable largest(Measurable[] objects)
    {
        if (objects.length == 0)
        {
            return null;
        }
        Measurable largestSoFar = objects[0];
        for (int i = 1; i < objects.length; i++)
        {
            Measurable current = objects[i];
            if (current.getMeasure() > largestSoFar.getMeasure())
            {
                largestSoFar = current;
            }
        }
        return largestSoFar;
    }

    /**
       Computes the smallest of the given objects.
       @param objects an array of Measurable objects
       @return the object with the smallest measure
    */
     // TODO: implement the smallest method described in the javadoc
    public static Measurable smallest(Measurable[] objects)
    {
        if (objects.length == 0)
        {
            return null;
        }
        Measurable smallestSoFar = objects[0];
        for (int i = 1; i < objects.length; i++)
        {
            Measurable current = objects[i];
            if (current.getMeasure() < smallestSoFar.getMeasure())
            {
                smallestSoFar = current;
            }
        }
        return smallestSoFar;
    }
}
=============================================================================
10. Consider classes Cat and Mammal. Which is the super class

Answer: Mammal

11. Motorcycle is a subclass of vehicle. Complete the code in this method header of Motorcycle

public class Motorcycle extends Vehicle

=============================================================================
17. 
// This is the first of two problems to use these classes
// The manager class is a subclass of Employee. A Manager is different from an employee in that
// a Manager has a bonus. So we add that instance variable

// Add the code to complete the constructor

public class Manager extends Employee
{
    private double bonus;

    /**
     * Constructs a Manager
     * @name the name of the manager
     * @salary the salary of this manager
     * @param theBonus the bonus for this Manager
     */
    public Manager(String name, double salary, double theBonus)
    {
        // TODO: complete the constructor
        super(name,salary);
        this.bonus = theBonus;
    }

    public double getBonus()
    {
        return bonus;
    }

}
=============================================================================
18.
// This problem builds on the class from the previous project.

// The manager class is a subclass of Employee. A Manager is different from an employee in that
// a Manager has a bonus. So we add that instance variable

// In the previous problem you added the code to complete the constructor
// Now override the getSalary method to return the total of the salary and bonus

public class Manager extends Employee
{
    private double bonus;

    /**
     * Constructs a Manager
     * @name the name of the manager
     * @salary the salary of this manager
     * @param theBonus the bonus for this Manager
     */
    public Manager(String name, double salary, double theBonus)
    {
        // TODO: complete the constructor
        super(name,salary);
        this.bonus = theBonus;
    }

    public double getBonus()
    {
        return bonus;
    }


     // Gets the total salary for this Manager
     // that is the salary + the bonus

    public double getSalary()
    {
        // TODO: finish the method implementation
        return (super.getSalary() + bonus);
    }
}
=============================================================================

19. Given that Sub is a subclass of Sandwich and the following declarations

Sandwich sandwich = new Sandwich();
Sub sub = new Sub();

Which of the following are legal?
a. sandwich = sub;
b. sub = sandwich;
c. sub = new Sandwich
d. sandwich = new Sub();

Answer = {a, d}

=============================================================================

20. The CheckingAccount class extends BankAccount.
The BankAccount class has a deposit method and the CheckingAccount class overrides it. 
Now given this code segment

BankAccount account = new CheckingAccount();
account.deposit(amount);

Whose deposit method is called:
a. BankAccount
b. CheckingAccount
c. Not enough information to say

Answer b.

=============================================================================
