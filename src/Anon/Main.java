package Anon;

public class Main {
    public static void main(String[] args) {

        Sayer say = new Sayer() {
            @Override
            public void do1() {
                System.out.println("Implemented do1");
            }

            @Override
            public void do2() {
                System.out.println("Implemented do2");
            }

            @Override
            public void do3() {
                System.out.println("Implemented do3");
            }
        };

        say.do1();
        say.do2();
        say.do3();

    }
}