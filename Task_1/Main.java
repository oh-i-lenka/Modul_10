package Modul_10.Task_1;

public class Main {
    public static void main(String[] args) {
        try {
            throw (new Exception("My exception"));
        }catch (Exception e){
            System.err.println(e);
        }
        finally {
            System.out.println("We was there! Absolutely!");
        }
    }
}
