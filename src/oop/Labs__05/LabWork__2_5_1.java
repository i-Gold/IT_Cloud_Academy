package oop.Labs__05;

public class LabWork__2_5_1 {
    public static void main(String[] args) {

        MyInitTest main1 = new MyInitTest();
        MyInitTest main2 = new MyInitTest(77);
    }
}

class MyInitTest {

    private int x;

    static {
        System.out.println("Static initialization block 1");
    }
    static {
        System.out.println("Static initialization block 2");
    }
    {
        System.out.println("Non-static initialization block 1");
    }
    {
        System.out.println("Non-static initialization block 2");
    }

    public MyInitTest(){
        //this(25);
        System.out.println("Constructor 1");
    }

    public MyInitTest(int x){
        this.x = x;
        System.out.println("Constructor 2");
    }
}