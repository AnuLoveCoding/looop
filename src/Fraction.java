public class Fraction {
    int numerator, denominator;
    public Fraction(int numerator, int denominator){
       this.numerator = numerator;
       this.denominator = denominator;
    }

    Fraction add(Fraction a){
//        this.numerator = a.numerator;
//        this.denominator = a.denominator;

        System.out.println(this.numerator); // x -> numerator;
        System.out.println(this.denominator); // x -> denominator;
        System.out.println(a.numerator); // y -> numerator;
        System.out.println(a.denominator); // y -> denominator;

        return new Fraction(0,0);
    }

    Fraction subtract(Fraction a){

        return new Fraction(0,0);
    }

   Fraction multiply(Fraction a){


        return new Fraction(0,0);
    }


    public static void main(String[] args) {
            Fraction x = new Fraction(2,3);
            Fraction y = new Fraction(4,5);
            Fraction z1 = x.add(y); // 22/15
            Fraction z2 = x.subtract(y); // -2/15
            Fraction z3 = x.multiply(y); // 8/15
    }
}
