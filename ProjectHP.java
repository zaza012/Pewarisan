/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.java.projecthp;

/**
 *
 * @author Fikri Fahmi Azim
 * 21103088
 * SI 05 C
 */

import java.util.Scanner;

public class ProjectHP {

    public static void main(String[] args) {
        Phone redmiNote8 = new Xiaomi();
        Phone iPhone14 = new iPhone();
        Phone GalaxyZ = new Samsung();
        Phone Reno8 = new Oppo();
        PhoneUser a = new PhoneUser(redmiNote8);
        PhoneUser b = new PhoneUser(iPhone14);
        PhoneUser c = new PhoneUser(GalaxyZ);
        PhoneUser d = new PhoneUser(Reno8);
        Scanner input = new Scanner(System.in);
        int aksi;
        int pilihan;
        
        do{
            System.out.println("");
            System.out.println("\t--------------------------");
            System.out.println("\t--- APLIKASI INTERFACE ---");
            System.out.println("\t--------------------------\n");
            System.out.println("Pilihan Phone : ");
            System.out.println("[1] Xiomi");
            System.out.println("[2] iPhone");
            System.out.println("[3] Samsung");
            System.out.println("[4] Oppo");
            System.out.println("[0] Keluar");
            System.out.println("Silahkan Masukkan Pilihan Anda : ");
            pilihan = input.nextInt();
            System.out.println("");
            switch (pilihan){
                case 1  : 
                    do{
                        System.out.println("");
                        System.out.println("\t=== XIAOMI ===");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan Hp");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[5] Ganti HP");
                        System.out.println("[0] Exit");
                        System.out.println("Masukkan Pilihan Anda : ");
                        aksi = input.nextInt();
                        switch (aksi){
                            case 1 :
                                a.turnOnThePhone();
                                break;
                            case 2 :
                                a.turnOffThePhone();
                                break;
                            case 3 :
                                a.makeVolumeUp();
                                break;
                            case 4 :
                                a.makeVolumeDown();
                                break;
                            case 0 :
                                System.exit(0);
                                break;
                            default :
                                System.out.println("");
                            }
                        }while(aksi != 5);
                        break;
                        
                case 2 :
                    do{
                        System.out.println("");
                        System.out.println("\t=== IPHONE ===");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan Hp");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[5] Ganti HP");
                        System.out.println("[0] Exit");                        
                        System.out.println("Masukkan Pilihan Anda : ");
                        aksi=input.nextInt();
                        switch (aksi){
                            case 1 :
                                b.turnOnThePhone();
                                break;
                            case 2 :
                                b.turnOffThePhone();
                                break;
                            case 3 :
                                b.makeVolumeUp();
                                break;
                            case 4 :
                                b.makeVolumeDown();
                                break;
                            case 0 :
                                System.exit(0);
                                break;
                            default :
                                System.out.println("");   
                            }
                        }while(aksi != 5);   
                        break;
            
                case 3 :
                    do{
                        System.out.println("");
                        System.out.println("\t=== SAMSUNG ===");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan Hp");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[5] Ganti HP");
                        System.out.println("[0] Exit");
                        System.out.println("Masukkan Pilihan Anda : ");
                        aksi=input.nextInt();
                        switch (aksi){
                            case 1 :
                                c.turnOnThePhone();
                                break;
                            case 2 :
                                c.turnOffThePhone();
                                break;
                            case 3 :
                                c.makeVolumeUp();
                                break;
                            case 4 :
                                c.makeVolumeDown();
                                break;
                            case 0 :
                                System.exit(0);
                                break;
                            default :
                                System.out.println("");   
                            }
                        }while(aksi != 5);   
                        break;
                case 4 :
                    do{
                        System.out.println("");
                        System.out.println("\t=== OPPO ===");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan Hp");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[5] Ganti HP");
                        System.out.println("[0] Exit");
                        System.out.println("Masukkan Pilihan Anda : ");
                        aksi=input.nextInt();
                        switch (aksi){
                            case 1 :
                                d.turnOnThePhone();
                                break;
                            case 2 :
                                d.turnOffThePhone();
                                break;
                            case 3 :
                                d.makeVolumeUp();
                                break;
                            case 4 :
                                d.makeVolumeDown();
                                break;
                            case 0 :
                                System.exit(0);
                                break;
                            default :
                                System.out.println("");   
                            }
                        }while(aksi != 5);   
                        break;
                        
                case 0 :
                    System.exit(0);
                    break;
                    
                default :
                    System.out.println("Pilihan yang Anda Masukkan Salah");
            }
        }while(pilihan != 0);
    }
}
