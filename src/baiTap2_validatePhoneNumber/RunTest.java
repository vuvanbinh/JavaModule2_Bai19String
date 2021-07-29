package baiTap2_validatePhoneNumber;

public class RunTest {
    private static PhoneNumberExample phoneNumberExample = new PhoneNumberExample();

    public static void main(String[] args) {
        String test1 = "(84)-(0978489648)";
        String test2 = "(88)-(2222222200)";

        System.out.println("Phone Number is + "+test1 +" is :" + phoneNumberExample.validate(test1));
        System.out.println("Phone Number is + "+test2 +" is :" + phoneNumberExample.validate(test2));
    }
}
