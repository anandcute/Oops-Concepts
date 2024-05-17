abstract class Test{
    void function1(){
        System.out.println("This is function1");
    }
    abstract void function2();
}
class TestDemo extends Test{
    void function2(){
        System.out.println("This is the function2");
    }
}



public class AbstractDemo {
    public static void main(String[] args) {
        Test t = new TestDemo();
        t.function1();
        t.function2();
    }
}
