public class VariableMutation {

  public static void main(String[] args) {
    int a = 3;
    // 01) make it bigger by 10
    a += 10;

    System.out.println("01) " + a);




    int b = 100;
    // 02) make it smaller by 7
    b -= 7;

    System.out.println("02) " + b);




    int c = 44;
    // 03) please double c's value
    c *= 2;

    System.out.println("03) " + c);




    int d = 125;
    // 04) please divide by 5 d's value
    d /= 5;

    System.out.println("04) " + d);




    int e = 8;
    // 05) please cube of e's value
    e *= e * e;

    System.out.println("05) " + e);




    int f1 = 123;
    int f2 = 345;
    // 06) tell if f1 is bigger than f2 (print as a boolean)
    System.out.println("06) " + (f1 > f2));




    int g1 = 350;
    int g2 = 200;
    // 07) tell if the double of g2 is bigger than g1 (print as a boolean)
    System.out.println("07) " + (2 * g2 > g1));



    long h = 1357988018575474L;
    // 08) tell if it has 11 as a divisor (print as a boolean)
    System.out.println("07) " + (h % 11 == 0));





    int i1 = 10;
    int i2 = 3;
    // 08) tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
    System.out.println("08) " + (i1 > i2 * i2 && i1 < i2 * i2 * i2));



    int j = 1521;
    // 09) tell if j is dividable by 3 or 5 (print as a boolean)
    System.out.println("09) " + (j % 3 == 0 || j % 5 == 0));



    String k = "Apple";
    // 10) fill the k variable with its content 4 times
    k += k;
    k += k;


    System.out.println("10) " + k);
  }
}
