package test_driven_development.bai_tap.triangle_classifier;

public class TriangleClassifier {
    public static final String NOT_TRIANGLE = "không phải là tam giác";
    public static final String EQUILATERAL_TRIANGLE = "tam giác đều";
    public static final String NORMAL_TRIANGLE = "tam giác thường";
    public static final String ISOSCELES_TRIANGLE = "tam giác cân";

    public static String showTriangleClassifier(int a, int b, int c) {
        if (a * b * c <= 0 || (a+b < c || a+c < b || b+c < a)) {
            return NOT_TRIANGLE;
        }
        if (a == b && b == c) {
            return EQUILATERAL_TRIANGLE;

        }
        if (a != b && b != c && c != a) {
            return NORMAL_TRIANGLE;

        }

        return ISOSCELES_TRIANGLE;
    }
}
