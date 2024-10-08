package com.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Unit test for the ArithmeticApp class.
 * This test verifies that the parse tree generated by the getTreeFromString
 * method
 * matches the expected structure for a given arithmetic expression.
 */
public class ArithmeticAppTest {

    /**
     * Test that verifies the parse tree for the expression "2".
     * The expected parse tree is a simple expression tree with a single number.
     */
    @Test
    public void testApp() {
        // Expected parse tree in LISP-like format
        String expected = "(expr (term (factor 2)))";

        // Actual parse tree generated by the getTreeFromString method
        String actual = ArithmeticApp.getTreeFromString("2");

        // Assert that the actual parse tree matches the expected parse tree
        assertThat(actual, equalTo(expected));

    }
}