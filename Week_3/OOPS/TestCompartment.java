// package Week_3.OOPS;

import java.util.*;

abstract class Compartment 
{
    public abstract String notice();
}

class FirstClass extends Compartment 
{
    public String notice() 
    {
        return "First Class: Luxury coach. Maintain silence.";
    }
}

class Ladies extends Compartment 
{
    public String notice() 
    {
        return "Ladies Compartment: Reserved for women.";
    }
}

class General extends Compartment 
{
    public String notice() 
    {
        return "General Compartment: Open for all passengers.";
    }
}

class Luggage extends Compartment 
{
    public String notice() 
    {
        return "Luggage Compartment: Goods only.";
    }
}

public class TestCompartment 
{
    public static void main(String[] args) 
    {
        Compartment[] c = new Compartment[10];
        Random r = new Random();

        for(int i = 0; i < 10; i++) 
        {
            int x = r.nextInt(4) + 1;

            switch(x) 
            {
                case 1:
                    c[i] = new FirstClass();
                    break;

                case 2:
                    c[i] = new Ladies();
                    break;

                case 3:
                    c[i] = new General();
                    break;

                case 4:
                    c[i] = new Luggage();
                    break;
            }
        }

        for(int i = 0; i < 10; i++) 
        {
            System.out.println(c[i].notice());
        }
    }
}

// // output 
// PS C:\Coding\Summer_Assignment_2401920130067\Week_3\OOPS> javac TestCompartment.java
// PS C:\Coding\Summer_Assignment_2401920130067\Week_3\OOPS> java TestCompartment
// General Compartment: Open for all passengers.
// First Class: Luxury coach. Maintain silence.
// Ladies Compartment: Reserved for women.
// Luggage Compartment: Goods only.
// Luggage Compartment: Goods only.
// General Compartment: Open for all passengers.
// Ladies Compartment: Reserved for women.
// Ladies Compartment: Reserved for women.
// General Compartment: Open for all passengers.
// First Class: Luxury coach. Maintain silence.
