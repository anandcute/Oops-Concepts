enum Level{
    LOW("L"),MEDIUM("M"),HIGH("H");
    private String abbr;
    Level(String ab){
        abbr=ab;
    }
    public String getDetails(){
        return abbr;
    }
}



public class EnumDemo{
    enum Start{
        START1,START2,START3,START4,START5,START6,START
    }
    public static void main(String[] args) {
       Level l1 = Level.HIGH;
       Level l = Level.LOW;
       System.out.println(l1);
       System.out.println("THE INDEX OF THE ENUM VALUE : "+l1.ordinal());
       System.out.println("CONVERT TO STRING VALUE : "+l1.toString());
       System.out.println("VALUE OF MEMORY ADDRESS : "+l1.hashCode());
       //compare to
       System.out.println("COMPARISON : "+l.compareTo(l1));
      
       //value of
       Level level = Level.valueOf("HIGH");
       System.out.println("Ans : "+level);

       System.out.println(l1);
       //System.out.println(l1.getDetails());

      //loop
      for(Start s:Start.values()){
        System.out.println("values:"+s);
      }
        


    }
}