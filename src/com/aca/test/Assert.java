package com.aca.test;

import java.util.Objects;

public class Assert {
    public static void equals(void value, Object expected){
        if (!Objects.equals(value,expected)){
            throw new AssertionError("expected value - "+expected+", actual value - "+value);
        }
    }
}