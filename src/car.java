public class car {
    String name ;
    int  milage ;
    String color ;
    boolean is_sunroof ;

    public  car(int milage, String name, String color, boolean is_sunroof){
        this.milage = milage;
        this.name = name;
        this.color = color;
        this.is_sunroof = is_sunroof;

    }

    public static void main(String[] args) {
          car farrai = new car (15,"farrai","red",true);
    }
}
