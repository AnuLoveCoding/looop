import java.util.*;

public class car {
    String name ;
    int  milage ;
    String color ;
    boolean is_sunroof ;

    String model;

    public  car(int milage, String name, String color, boolean is_sunroof,String model){
        this.milage = milage;
        this.name = name;
        this.color = color;
        this.is_sunroof = is_sunroof;
        this. model = model;

    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        car farrai = new car (15,"farrai","red",true,"es7");
        car marcedeis = new car(12,"mercedies","blue",false,"cc89");

        System.out.println("milage");
        int milage = scn.nextInt();

        System.out.println("name");
        String name = scn.next();

        System.out.println("color");
        String color = scn.next();

        System.out.println("is_sunroof");
        boolean is_sunroof = scn.nextBoolean();

        System.out.println("model");
        String model = scn.next();

        car alto = new car(milage,name,color,is_sunroof,model);


        System.out.println("name: " +alto.name);
        System.out.println("milage: " +alto.milage);
        System.out.println("model: " + alto.model);
        System.out.println("is_sunroof: " + marcedeis.is_sunroof);
    }
}
