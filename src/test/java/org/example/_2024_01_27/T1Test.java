package org.example._2024_01_27;

import jdk.jfr.Description;
import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class T1Test {
    private static final T1 T_1 = new T1();
    private static final double PARAM_A = 10;

    @Test
    void getPositiveTest() {
        double expected = 10;
        double b = 1;

        Assertions.assertEquals(expected, T_1.get(T1Test.PARAM_A, b));
    }

    @Test
    @Description("do test which throws ArithmeticException")
    void getWithExceptionTest() {
        double b = 0;

        Assertions.assertThrows(ArithmeticException.class, () -> T_1.get(T1Test.PARAM_A, b));
    }
}