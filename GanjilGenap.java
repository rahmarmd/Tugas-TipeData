/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rizal U
 */
import java.util.*;

public class GanjilGenap {


public static void main(String[] args) {

 int input;
        boolean isTrue = false;
        Scanner user = new Scanner(System.in);

 System.out.println("Masukkan angka -->");
                input = user.nextInt();
                if (input % 2 == 0) {
                    System.out.println(input + " Adalah Bilangan Genap");
                 
                } else {
                    System.out.println(input + " Adalah Bilangan Ganjil");
                }




}
}