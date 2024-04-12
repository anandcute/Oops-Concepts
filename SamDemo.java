//fuctional interface-its only single interface fn

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface InnerSamDemo {
    void method1();
    
}
interface InnerSamDemo1 {
    Boolean check(int a);
}
    
   
interface InnerSamDemo2{
    Boolean check1(String b);
}
   
    
// class MyInterface implements InnerSamDemo{
//     int a =10 ,b=12;
//     public void method1 (){
//         int c = a+b;
//         System.out.println("value of c : " +c);
//         System.out.println("this is method");
//     }
// }

    


public class SamDemo {
    public static void main(String[] args) {
        // MyInterface m = new MyInterface();
        
        // lambda expression
        InnerSamDemo m = ()->System.out.println("this is method");
       // m.method1();

        InnerSamDemo1 m1 = (x)->x>0;
        //System.out.println(m1.check(19));

        InnerSamDemo2 m2 = (y)->y.equals("india");
        //System.out.println(m2.check1("india"));


        Predicate<Integer> p =(x)->x>0;
        System.out.println(p.test(12));

        Predicate<String> str =(y)-> y.equals("anand");
        System.out.println(str.test("anand"));

        BiPredicate <Integer,Integer> n =(a,b)->(a+b)>0;
        System.out.println("value"+ (n.test(22, 99)));

        // BiPredicate <String,String> n =(c,d)->(c,d).equals("ak","love");
        // System.out.println("value"+ (n.test("ak", "love")));

        Function<String,String> e1 = (x)->x.toLowerCase();
        System.out.println(e1.apply("anand"));

        Function<Integer,Integer> e = (x)->x*2;
        System.out.println(e.apply(4));

        Function<String,Integer> e2= (x)->x.length();
        System.out.println(e2.apply("anand"));
        
        
        BiFunction <Integer,Integer,Integer> nn = (a,b)-> a*b;
        System.out.println(nn.apply(10,2));

        Consumer <Integer> c = (y)->System.out.println("c is " + y*y);
        c.accept(4);

        BiConsumer <String,String> b=(x,z)->System.out.println("x ,y is:" + x+z);
        b.accept("Anand","kumar");

        Supplier s =()-> Math.random();
        System.out.println("s is : " + s.get());

    }
}
