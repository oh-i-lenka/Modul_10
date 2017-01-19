package Modul_10.Task_5;

public class Main {
    public static void main(String[] args) throws SomeException, SomeException2,SomeException3 {
       try {
           MyClass.methodThrowExceptions();
       }catch (Exception e){
           System.out.println("Have catched all Exceptions");
       }
    }
}

