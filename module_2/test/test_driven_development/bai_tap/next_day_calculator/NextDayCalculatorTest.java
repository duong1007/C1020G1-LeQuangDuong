package test_driven_development.bai_tap.next_day_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testShowNextDay0() {
        String date = "1/1/2018";
        String expected = "2/1/2018";

        String result = NextDayCalculator.showNextDay(date);
        assertEquals(expected,result);
    }

    @Test
    void testShowNextDay1() {
        String date = "31/1/2018";
        String expected = "1/2/2018";

        String result = NextDayCalculator.showNextDay(date);
        assertEquals(expected,result);
    }

    @Test
    void testShowNextDay2() {
        String date = "30/4/2018";
        String expected = "1/5/2018";

        String result = NextDayCalculator.showNextDay(date);
        assertEquals(expected,result);
    }

    @Test
    void testShowNextDay3() {
        String date = "28/2/2018";
        String expected = "1/3/2018";

        String result = NextDayCalculator.showNextDay(date);
        assertEquals(expected,result);
    }

    @Test
    void testShowNextDay4() {
        String date = "29/2/2020";
        String expected = "1/3/2020";

        String result = NextDayCalculator.showNextDay(date);
        assertEquals(expected,result);
    }

    @Test
    void testShowNextDay5() {
        String date = "31/12/2018";
        String expected = "1/1/2019";

        String result = NextDayCalculator.showNextDay(date);
        assertEquals(expected,result);
    }
}