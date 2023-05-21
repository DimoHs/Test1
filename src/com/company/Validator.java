package com.company;

public class Validator {

    public static boolean TextLength(String text) {
        int words = 0;

        for (int index = 0; index < text.length(); index++) {
            words++;

        }
        if (words >= 5 && words < 30) {
            return false;
        }
        return true;
    }

    public static boolean NoSymbols(String text) {

        for (int index = 0; index < text.length(); index++) {
            char symbol = text.charAt(index);
            boolean isDigit = Character.isDigit(symbol);
            String SpecialChar = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
            String tabulation = " ";

            if (isDigit) {
                return true;
            }
            if (SpecialChar.contains(Character.toString(symbol))) {
                return true;
            }
            if (text.contains(tabulation)) {
                return true;
            }
        }
        return false;
    }

    public static boolean TeacherIsAdult(int number) {

        if (number < 18) {
            return true;
        }
        return false;
    }

    public static boolean SalaryMinimumPay(int number) {

        if (number < 580) {
            return true;
        }
        return false;
    }

    public static boolean CourseNames (String text) {
        String word1 = "Database";
        String word2 = "Programing with Java";
        String word3 = "QA";
        if (text.equals(word1)) {
            return false;
        }
        if (text.equals(word2)) {
            return false;
        }
        if (text.equals(word3)) {
            return false;
        }
            return true;
    }
}
