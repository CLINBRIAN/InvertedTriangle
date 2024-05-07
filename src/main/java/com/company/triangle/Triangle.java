/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.triangle;

/**
 *
 * @author kamau
 */
public class Triangle {

    public static void main(String[] args) {
       for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < 5; j++) {
                System.out.print(" *");
            }
             for (int j = i; j <= 5; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
