package com.franco.casting;

public class MainCasting {
    public static void main(String[] args) {
        String numberString="10";
        String numberString2="1";
        int number = Integer.parseInt(numberString);
        int number2 = Integer.parseInt(numberString2);
        numberString+=5;
        number+=5;
        int res = number+number2;
        System.out.println("numberString = " + numberString+numberString2);
        System.out.println("number = " + res);
        
    }
}
