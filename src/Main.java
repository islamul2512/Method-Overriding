public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        A objA = new A();
        B objB = new B();

        // Task 3: Call method meth of class A using objB
        System.out.println("Calling method meth from class A using objB: " + objB.meth());

        // Task 5: Call overridden method meth from obj of class B
        System.out.println("Calling overridden method meth from obj of class B: " + objB.meth());
    }
}