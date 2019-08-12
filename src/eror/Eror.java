package eror;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Eror {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Masukkan nama: ");
            String namakm = input.nextLine();
        }
        catch (InputMismatchException x){
            System.out.print("Woy masukin nama lu yang bener!!");
            input.nextLine();
        }
        finally{
            System.out.print("Nama lu dah bener cuy Thanks!!");
        }
    }
    
}
