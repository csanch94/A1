package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

 /*
    Part 2
    2a.
    left | right:
    Null
    Empty
    Valid digits
    Invalid digit (<0)
    Invalid digit (>9)
    Single digit
    Multiple digits

    2b.
    Both null
    One null
    Both empty
    One empty
    Same length, no carry
    Same length, with carry
    Different lengths
    Carry at final digit
    Invalid digit in either

    2c.
    null
    Single digit
    Multiple digits
    Zero
    Exception
 */

class NumberUtilsTest {

    @Tag("specification")
    @Test
    void addWithNull() {
        List<Integer> left = null;
        List<Integer> right = new ArrayList<>(Arrays.asList(3, 4));
        List<Integer> actual = NumberUtils.add(left, right);
        List<Integer> expected = null;
        assertEquals(expected, actual);

    }

    @Tag("specification")
    @Test
    void addWithEmpty() {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
        List<Integer> actual = NumberUtils.add(left, right);
        List<Integer> expected = right;
        assertEquals(expected.reversed(), actual);

    }

    @Tag("specification")
    @Test
    void addCarryOver() {
        List<Integer> left = new ArrayList<>(Arrays.asList(7, 4));
        List<Integer> right = new ArrayList<>(Arrays.asList(3, 4));
        List<Integer> actual = NumberUtils.add(left, right);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 0, 8));
        assertEquals(expected, actual);

    }

    @Tag("specification")
    @Test
    void addSingleDigits() {
        List<Integer> left = new ArrayList<>(Arrays.asList(4));
        List<Integer> right = new ArrayList<>(Arrays.asList(4));
        List<Integer> actual = NumberUtils.add(left, right);
        List<Integer> expected = new ArrayList<>(Arrays.asList(8));
        assertEquals(expected, actual);

    }

    @Tag("specification")
    @Test
    void addEmptyList() {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>(Arrays.asList(4));
        List<Integer> actual = NumberUtils.add(left, right);
        List<Integer> expected = new ArrayList<>(Arrays.asList(4));
        assertEquals(expected, actual);

    }

    @Tag("specification")
    @Test
    void addInvalidNumber() {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>(Arrays.asList(-9));
        Assertions.assertThrows(IllegalArgumentException.class, () -> NumberUtils.add(left, right));

    }
    @Tag("structural")
    @Test
    void addWithRightNull() {
        List<Integer> left = new ArrayList<>(Arrays.asList(3, 4));
        List<Integer> right = null;

        List<Integer> actual = NumberUtils.add(left, right);
        List<Integer> expected = null;
        assertEquals(expected, actual);

    }

    @Tag("structural")
    @Test
    void addWithLeadingZeros() {
        List<Integer> left = new ArrayList<>(Arrays.asList(9));
        List<Integer> right = new ArrayList<>(Arrays.asList(0, 3, 4, 7, 7));

        List<Integer> actual = NumberUtils.add(left, right);
        List<Integer> expected = new ArrayList<>(Arrays.asList(3, 4, 8, 6));
        assertEquals(expected, actual);

    }

    @Tag("structural")
    @Test
    void addWithBadRightNumber() {
        List<Integer> left = new ArrayList<>(Arrays.asList(0));
        List<Integer> right = new ArrayList<>(Arrays.asList(0, 3, 4, 7, 10));

        Assertions.assertThrows(IllegalArgumentException.class, () -> NumberUtils.add(left, right));
    }

    @Tag("structural")
    @Test
    void addWithBadLeftNumber() {
        List<Integer> left = new ArrayList<>(Arrays.asList(-9));
        List<Integer> right = new ArrayList<>(Arrays.asList(0, 3, 4, 7, 10));

        Assertions.assertThrows(IllegalArgumentException.class, () -> NumberUtils.add(left, right));
    }

    @Tag("structural")
    @Test
    void addWithBadLeftNumber2() {
        List<Integer> left = new ArrayList<>(Arrays.asList(10));
        List<Integer> right = new ArrayList<>(Arrays.asList(0, 3, 4, 7, 10));

        Assertions.assertThrows(IllegalArgumentException.class, () -> NumberUtils.add(left, right));
    }

    @Tag("structural")
    @Test
    void addWithLargeLeft() {
        List<Integer> left = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> right = new ArrayList<>(Arrays.asList(1));

        List<Integer> actual = NumberUtils.add(left, right);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7));
        assertEquals(expected, actual);
    }
}