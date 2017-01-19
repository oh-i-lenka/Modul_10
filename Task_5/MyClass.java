package Modul_10.Task_5;

import java.lang.reflect.Array;

public class MyClass {
    Exception ArrayOfExceptions[];

    public static void methodThrowExceptions() throws Exception{
        Exception[] ArrayOfExceptions = new Exception[3];
        ArrayOfExceptions[0] = new SomeException();
        ArrayOfExceptions[1] = new SomeException2();
        ArrayOfExceptions[2] = new SomeException3();

        for (int i=0; i<=2; i++ ){
            throw ArrayOfExceptions[i];
        }
    }
}
