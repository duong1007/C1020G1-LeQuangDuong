package test_driven_development.bai_tap.triangle_classifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void showTriangleClassifier0() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "tam giác đều";

        String result = TriangleClassifier.showTriangleClassifier(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    void showTriangleClassifier1() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "tam giác cân";

        String result = TriangleClassifier.showTriangleClassifier(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    void showTriangleClassifier2() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "tam giác thường";

        String result = TriangleClassifier.showTriangleClassifier(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    void showTriangleClassifier3() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "không phải là tam giác";

        String result = TriangleClassifier.showTriangleClassifier(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    void showTriangleClassifier4() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "không phải là tam giác";

        String result = TriangleClassifier.showTriangleClassifier(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    void showTriangleClassifier5() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "không phải là tam giác";

        String result = TriangleClassifier.showTriangleClassifier(a,b,c);
        assertEquals(expected,result);
    }

}