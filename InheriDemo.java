class Manager {
    public String name;
    public int empno;
    public String dept;
    public int age;
    Manager(String name,int empno,String dept,int age){
        this.name=name;
        this.empno=empno;
        this.dept=dept;
        this.age=age;
    }
    void getDetail(){
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}
class Employee extends  Manager{
    Employee(String name,int empno,String dept,int age){
        super(name, empno, dept, age);
    }
    void getDetail(){
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}
class Team extends Manager{
    Team(String name,int empno,String dept,int age){
        super(name, empno, dept, age);
    }
    void getDetail(){
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}

public class InheriDemo {
    public static void main(String[] args) {
        Manager m =new Manager("Anand", 22, "it", 1001);
        m.getDetail();
        Employee e =new Employee("Gopi", 22,"it", 1002);
        e.getDetail();
        Team t = new Team("Deepak",21,"it",1003);
        t.getDetail();
    }
}
   


    





