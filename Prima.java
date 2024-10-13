/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg6;

/**
 *
 * @author 62859
 */
public class Prima {
  public static void main(String[] args) {
        for (int n = 0; n <= 20; n++) {
            if (n == 0) {
                System.out.println(n + " bukan bilangan prima");
            } else if (n == 1) {
                System.out.println(n + " bilangan prima");
            } else {
                boolean Prima = true;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        Prima = false;
                        break;
                    }
                }
                if (Prima) {
                    System.out.println(n + " bilangan prima");
                } else {
                    System.out.println(n + " bukan bilangan prima");
                }
            }
        }
    }
}
