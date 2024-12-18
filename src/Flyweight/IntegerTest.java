package Flyweight;

public class IntegerTest {

    public static void main(String[] args) {

        String s1 = "ok";
        String s2 = "ok";
        String s3 = new String("ok");
        String s4 = new String("okk");
        String s5 = "okk";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s4 == s5);
    }
}
