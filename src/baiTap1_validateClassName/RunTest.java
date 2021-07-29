package baiTap1_validateClassName;

public class RunTest {
    private static ClassNameExample classNameExample = new ClassNameExample();
    public static void main(String[] args) {
        String test1 = "C0521G";
        String [] test2 = {"M0318G","P0323A","P0000C"};

        System.out.println( "Class Name is "+ test1+" is "+ classNameExample.validate(test1));

        for (String t: test2
             ) {
            System.out.println("Class Name is "+ t +" is " +classNameExample.validate(t));
        }


    }
}
