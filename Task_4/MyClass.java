package Modul_10.Task_4;

public class MyClass {
    static public void f() throws SomeException, SomeException2{
        try {
            g();
        }catch (SomeException e){
            System.out.println("Have catched Exception1");
            throw (new SomeException2());
        }
    }

    public static void g() throws SomeException{
       throw (new SomeException());
    }
}
