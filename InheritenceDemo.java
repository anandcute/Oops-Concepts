//Single inheritence
/**
 * 
 */
class Parent  {
    int a;
    void geta(int x){
        this.a=x;

    }
    void ShowParent(){
        System.out.println("Parent:" + a);
    }
}
class Child extends Parent {
    int b;
    void getb(int x){
        this.b=x;

    }
    void ShowChild(){
        System.out.println("child:" + b);
    }
}
//Multi inheritence 
class GrandChild extends Child {
    int c;
    void getc(int x){
        this.c=x;

    }
    void ShowGrandChild(){
        System.out.println("Grand child:" + c);
    }
}

    
public class InheritenceDemo {
    public static void main(String[] args) {
        GrandChild g=new GrandChild();
        g.geta(1804);
        g.ShowParent();

        g.getb(2309);
        g.ShowChild();

        g.getc(333);
        g.ShowGrandChild();
    }
    
}
