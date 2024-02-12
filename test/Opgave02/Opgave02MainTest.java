package Opgave02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

import static Opgave02.Opgave02Main.fibonacci;
import static org.junit.jupiter.api.Assertions.*;

public class Opgave02MainTest {
    @Test
    @DisplayName("fibonacci(0)")
    void fibonacciZeroShouldBeZero() {
        int[] results = {};
        int actual = fibonacci(0, results);
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("fibonacci(1)")
    void fibonacciOneShouldBeOne() {
        int[] results = {-1};
        int actual = fibonacci(1, results);
        assertEquals(1, actual);
    }

    @Test
    @DisplayName("fibonacci(10)")
    void fibonacciTenShouldBe55() {
        int[] results = new int[10];
        for (int i = 0; i < 10; i++) {
            results[i] = -1;
        }
        int actual = fibonacci(10, results);
        assertEquals(55, actual);
    }

}