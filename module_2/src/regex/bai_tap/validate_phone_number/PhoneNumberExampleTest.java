package regex.bai_tap.validate_phone_number;

public class PhoneNumberExampleTest {
    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
        String str = "(84)-(0978489648)";
        System.out.println(phoneNumberExample.validate(str));
    }
}
