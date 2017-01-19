package Modul_10.Task_3;

public class Main {
    public static void main(String[] args) {
        try {
            Object ref = null;
            ref.toString();
        }catch (NullPointerException e){
            System.out.println("Your object is null!");
        }
    }
}
