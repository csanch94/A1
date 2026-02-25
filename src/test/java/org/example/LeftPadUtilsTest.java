package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeftPadUtilsTest {
    @Tag("spec")
    @Test
    void nullLeftPad() {
        String str = null;
        String padStr = "hello";
        Integer size = 0;
        String actual = LeftPadUtils.leftPad(str, size, padStr);
        String expected = null;
        assertEquals(expected, actual);
    }

    @Tag("spec")
    @Test
    void emptyLeftPad() {
        String str = "";
        String padStr = "hello";
        Integer size = 0;
        String actual = LeftPadUtils.leftPad(str, size, padStr);
        String expected = "";
        assertEquals(expected, actual);
    }

    @Tag("coverage")
    @Test
    void emptyLeftPad2() {
        String str = "";
        String padStr = "hello";
        Integer size = 5;
        String actual = LeftPadUtils.leftPad(str, size, padStr);
        String expected = "hello";
        assertEquals(expected, actual);
    }

    @Tag("coverage")
    @Test
    void emptyLeftPad3() {
        String str = "";
        String padStr = "hello";
        Integer size = 3;
        String actual = LeftPadUtils.leftPad(str, size, padStr);
        String expected = "hel";
        assertEquals(expected, actual);
    }

    @Tag("coverage")
    @Test
    void emptyLeftPad4() {
        String str = "";
        String padStr = "hello";
        Integer size = 7;
        String actual = LeftPadUtils.leftPad(str, size, padStr);
        String expected = "hellohe";
        assertEquals(expected, actual);
    }

    @Tag("spec")
    @Test
    void spaceLeftPad() {
        String str = "";
        String padStr = "";
        Integer size = 7;
        String actual = LeftPadUtils.leftPad(str, size, padStr);
        String expected = "       ";
        assertEquals(expected, actual);
    }

    @Tag("spec")
    @Test
    void spaceLeftPad2() {
        String str = "";
        String padStr = null;
        Integer size = 7;
        String actual = LeftPadUtils.leftPad(str, size, padStr);
        String expected = "       ";
        assertEquals(expected, actual);
    }


    @Tag("coverage")
    @Test
    void lengthOneLeftPad() {
        String str = "1";
        String padStr = "hello";
        Integer size = 0;
        String actual = LeftPadUtils.leftPad(str, size, padStr);
        String expected = "1";
        assertEquals(expected, actual);
    }


    @Tag("spec")
    @Test
    void lengthOneLeftPad2() {
        String str = "1";
        String padStr = "hello";
        Integer size = 6;
        String actual = LeftPadUtils.leftPad(str, size, padStr);
        String expected = "hello1";
        assertEquals(expected, actual);
    }

    @Tag("spec")
    @Test
    void lengthOneLeftPad3() {
        String str = "1";
        String padStr = "hello";
        Integer size = 5;
        String actual = LeftPadUtils.leftPad(str, size, padStr);
        String expected = "hell1";
        assertEquals(expected, actual);
    }

    @Tag("spec")
    @Test
    void lengthOneLeftPad4() {
        String str = "1";
        String padStr = "hello";
        Integer size = 10;
        String actual = LeftPadUtils.leftPad(str, size, padStr);
        String expected = "hellohell1";
        assertEquals(expected, actual);
    }

    @Tag("spec")
    @Test
    void lengthFiveLeftPad() {
        String str = "hello";
        String padStr = "hello";
        Integer size = 0;
        String actual = LeftPadUtils.leftPad(str, size, padStr);
        String expected = "hello";
        assertEquals(expected, actual);
    }

    @Tag("coverage")
    @Test
    void lengthFiveLeftPad2() {
        String str = "hello";
        String padStr = "hello";
        Integer size = 10;
        String actual = LeftPadUtils.leftPad(str, size, padStr);
        String expected = "hellohello";
        assertEquals(expected, actual);
    }

    @Tag("coverage")
    @Test
    void lengthFiveLeftPad3() {
        String str = "hello";
        String padStr = "hello";
        Integer size = 7;
        String actual = LeftPadUtils.leftPad(str, size, padStr);
        String expected = "hehello";
        assertEquals(expected, actual);
    }


    @Tag("coverage")
    @Test
    void lengthFiveLeftPad4() {
        String str = "hello";
        String padStr = "hello";
        Integer size = 15;
        String actual = LeftPadUtils.leftPad(str, size, padStr);
        String expected = "hellohellohello";
        assertEquals(expected, actual);
    }


}