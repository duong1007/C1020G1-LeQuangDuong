package regex.bai_tap.validate_class_name;

public class ClassNameExampleTest {
    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();
        String str = "C0318G";
        String str2 = "P0323A";
        System.out.println(classNameExample.validate(str));
        System.out.println(classNameExample.validate(str2));
    }
}
