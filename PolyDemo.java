

/**
 * InnerPolyDemo
 */
class InnerPolyDemo {
    int ans;
    void area(int a){
        ans = a * a;
        System.out.println("Area of the square: " +ans);
    }
    void area(int l, int b ){
        ans = l * b;
        System.out.println("Area of rectangle: " +ans);
    }
    void area (int l, int b,int h){
        ans =l*b*h;
        System.out.println("Area of the cuboid:"+ans);
    }
    
}

public class PolyDemo {
    public static void main(String[] args) {
        InnerPolyDemo p = new InnerPolyDemo();
        // call methods
        p.area(10);
        p.area(10,20);
        p.area(10,20,30);
    }
}





