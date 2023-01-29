import java.util.*;

public class car {
    String name ;
    int  milage ;
    String color ;
    boolean is_sunroof ;
    String model;
    car next;

    public  car(int milage, String name, String color, boolean is_sunroof,String model,car next){
        this.milage = milage;
        this.name = name;
        this.color = color;
        this.is_sunroof = is_sunroof;
        this. model = model;
        this.next = next;

    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        car farrai = new car (15,"farrai","red",true,"es7",null);
        car marcedeis = new car(12,"mercedies","blue",false,"cc89",null);
        car alto = new car(9,"alto","yellow",false,"i90",null);

         farrai.next = marcedeis;
         marcedeis.next = alto;
        farrai.next = farrai.next.next;
         car temp = farrai;

//         while(temp != null){
//             System.out.println(temp.name);
//             temp = temp.next.next;
//         }

        while(temp != null){
            System.out.println(temp.name);
            temp = temp.next;
        }


//        System.out.println("milage");
//        int milage = scn.nextInt();
//
//        System.out.println("name");
//        String name = scn.next();
//
//        System.out.println("color");
//        String color = scn.next();
//
//        System.out.println("is_sunroof");
//        boolean is_sunroof = scn.nextBoolean();
//
//        System.out.println("model");
//        String model = scn.next();

//        System.out.println("name: " + alto.name);
//        System.out.println("milage: " + alto.milage);
//        System.out.println("model: " + alto.model);
//        System.out.println("is_sunroof: " + marcedeis.is_sunroof);
    }
}
