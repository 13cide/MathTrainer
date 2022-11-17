package com.example.mathtrainer;

import java.util.Random;

public class Problem {
    private int result;
    private final Random random = new Random();

    public int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public int getResult() {
        return result;
    }

    public int getNoiseResult() {
        int a;
        do {
            a = getRandom(-5, 5);
            if (a != 0) return result + a;
        } while (true);
    }

    public String getProblem() {
        int a, b;
        switch (getRandom(1, 4)) {
            case 1:
                a = getRandom(-50, 50);
                b = getRandom(0, 50);
                String sign = new Random().nextBoolean() ? "-" : "+";
                if (sign.equals("+")) result = a + b;
                else result = a - b;
                return a + sign + b;
            case 2:
                do {
                    a = getRandom(-100, 100);
                    b = getRandom(-100, 100);
                } while (a == 0 || b == 0 || a % b != 0);
                result = a / b;
                return a + " / " + b;
            case 3:
                do {
                    a = getRandom(-20, 20);
                    b = getRandom(-20, 20);
                } while (a == 0 || b == 0);
                result = a * b;
                return a + " * " + b;
        }
        return null;
    }
}
