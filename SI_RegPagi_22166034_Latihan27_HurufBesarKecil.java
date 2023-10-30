/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166034_latihan27_hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 * Nama     : Nur Hidayah
 * Kelas    : PBO 027
 * NIM      : 22166034
 * Deskripsi Program : Huruf Besar Kecil
 */
public class SI_RegPagi_22166034_Latihan27_HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        
        System.out.println("====Hasil Formatting====");
         System.out.println();

        System.out.println("uruf Besar: " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil: " + kalimat.toLowerCase());

        }
    }

