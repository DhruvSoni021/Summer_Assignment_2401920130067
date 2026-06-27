
class Outer {
    void display() 
    {
        System.out.println("Outer class method");
    }

    class Inner {
        void display() 
        {
            System.out.println("Inner class method");
        }
    }
}

public class Main {
    public static void main(String[] args) 
    {
        Outer obj = new Outer();
        obj.display();

        Outer.Inner in = obj.new Inner();
        in.display();
    }
}