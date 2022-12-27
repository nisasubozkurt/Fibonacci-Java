/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        int birinci = 1;
        System.out.print(birinci + " ");
        int ikinci = 1;
        System.out.print(ikinci + " ");
        
     
        
        for (int i=3; i<=10; i++){
            int yeni = birinci + ikinci;
            birinci=ikinci;
            ikinci=yeni;
            System.out.print(yeni + " ");
        }
    }
    }
    

