package test_driven_development.bai_tap.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void readNum0() {
        String a = "162";
        String expected = "một trăm sáu mươi hai";

        ArrayList<String> result = FizzBuzz.readNum(a);
    }

    @Test
    void readNum1() {
        String a = "19";
        String expected = "Fizz";

        ArrayList<String> result = FizzBuzz.readNum(a);
    }

    @Test
    void readNum2() {
        String a = "555";
        String expected = "Buzz";

        ArrayList<String> result = FizzBuzz.readNum(a);
    }

    @Test
    void readNum3() {
        String a = "15";
        String expected = "FizzBuzz";

        ArrayList<String> result = FizzBuzz.readNum(a);
    }

    @Test
    void readNum4() {
        String a = "132";
        String expected = "Fizz";

        ArrayList<String> result = FizzBuzz.readNum(a);
    }
    
    @Test
    void readNum5() {
        String a = "151";
        String expected = "Buzz";

        ArrayList<String> result = FizzBuzz.readNum(a);
    }
}