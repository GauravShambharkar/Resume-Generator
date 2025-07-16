public class Example {
    static int a = 10;

    static int m1(){
        System.out.println("static variable 1 : a");
        return 10;
    }

    static {
        System.out.println("Static block 1");
    }

    static int b = m2();

    static int m2(){
        System.out.println("static variable 2 : b");
        return 20;
    }

    static void m4(){
        System.out.println("static method");
    }

    static int c = m3();

    static int m3(){
        System.out.println("static variavle 3 : c");
        return 30;
    }

    static {
        System.out.println("static block 2");
}

}

class Test {
    public static void main(String[] args) {

        System.out.println();
        Example.m1();

        System.out.println("main method");
}
}