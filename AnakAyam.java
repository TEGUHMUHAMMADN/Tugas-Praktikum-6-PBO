/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg6;

/**
 *
 * @author 62859
 */
public class AnakAyam {
  public static void main(String[] args) {
        int N = 10; 
        for (int n = N; n >= 1; n--) {
            if (n > 1) {
                System.out.println("Tekotek kotek anak ayam turun berkotek,");
                System.out.println("Anak ayam turun " + n + " mati satu tinggal " + (n - 1));
            } else {
                System.out.println("Tekotek kotek anak ayam turun berkotek,");
                System.out.println("Anak ayam turun " + n + " mati satu habis semua");
            }
        }
  }
}
