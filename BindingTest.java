public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println(p.y);
        System.out.println(c.x);
        System.out.println(c.y);
/*      p.method2();
        System.out.println(p.c);
*               에러!!
*                   원인 _ 조상 인스턴스에 없는 멤버*/

    }
}

class Parent    {
    int y = 100;

    void method()   {
        System.out.println("Parent Method");
    }
}

class Child extends Parent  {
    int x = 200;

    int c = 100;

    void method()   {
        System.out.println("Child Method");
    }

    void method2()  {
        System.out.println("Only Child");
    }
}
