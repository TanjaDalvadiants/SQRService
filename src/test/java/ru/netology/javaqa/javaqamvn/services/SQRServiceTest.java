package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void testBetweenLimit() {
        SQRService service = new SQRService();

        int min = 200;
        int max = 300;

        int expected = 3;

        int actual = service.calculate(min, max);
        //System.out.println("1.ExpectedCount: " + expected + "/" + "ActualCount: "+ actual);

        // производим проверку (сравниваем ожидаемый и фактический):

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testUnderLimit() {
        SQRService service = new SQRService();

        int min = 0;
        int max = 9;

        int expected = 0;

        int actual = service.calculate(min, max);
        //System.out.println("1.ExpectedCount: " + expected + "/" + "ActualCount: "+ actual);

        // производим проверку (сравниваем ожидаемый и фактический):

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testUpperLimit() {
        SQRService service = new SQRService();

        int min = 10_000;
        int max = Integer.MAX_VALUE;

        int expected = 0;

        int actual = service.calculate(min, max);
        //System.out.println("1.ExpectedCount: " + expected + "/" + "ActualCount: "+ actual);

        // производим проверку (сравниваем ожидаемый и фактический):

        Assertions.assertEquals(expected, actual);


    }
}
