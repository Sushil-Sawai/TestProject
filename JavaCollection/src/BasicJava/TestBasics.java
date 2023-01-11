package BasicJava;

public class TestBasics {

	static {
        System.out.println("static block executed");
    }
 
    {
        System.out.println("block executed");
    }
 
    public TestBasics() {
        System.out.println("constructor executed");
    }
 
    public void fun() {
        System.out.println("fun executed");
    }
 
    public static void main(String args[ ])  {
        System.out.println("main started");
        new TestBasics().fun();
    } 

}
