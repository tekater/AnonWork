package Reverser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Reverser reverser = new Reverser() {
            @Override
            public String do1(String str) {

                String[] array = str.split("");
                String result = "";

                for (int i = array.length - 1; i >= 0; i--) {
                    //result += array[i];
                    result = result + array[i];

                }
                return result;
        }
        };
        System.out.println("Введите слово:");
        String word = (new Scanner(System.in).nextLine());
        System.out.println(reverser.do1(word));
    }
}