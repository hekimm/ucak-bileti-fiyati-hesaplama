/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        double mesafe;
        int yas;
        int yolculukTipi;
       double mesafeBasiUcret = 0.10,normalTutar;
       Scanner scanner = new Scanner(System.in);
        System.out.println("Gidilecek mesafeyi giriniz(km): ");
       mesafe = scanner.nextDouble();
       
       
        System.out.println("Yaşınızı giriniz: ");
        yas = scanner.nextInt();
        double yasIndirimOrani=0,yasIndirimi=0,indirimliTutar=0;
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukTipi = scanner.nextInt();
       
       if(mesafe>0 && yas>0 && (yolculukTipi ==1 || yolculukTipi ==2)){
          normalTutar = mesafe*mesafeBasiUcret;
          if(yas<12){
              yasIndirimOrani = 0.5;
          }
          else if(yas>=12 && yas<24){
              yasIndirimOrani = 0.1;
          }
          else if(yas>65){
              yasIndirimOrani = 0.3;
          }
          
          else{
             yasIndirimOrani =0;
          }
          yasIndirimi = normalTutar*yasIndirimOrani;
          indirimliTutar =normalTutar - yasIndirimi;
         if(yolculukTipi ==2){
              indirimliTutar -= (indirimliTutar*0.2);
              indirimliTutar*=2;
         }
         
           System.out.println("Toplam : " + indirimliTutar);  
          
       }
       else{
           System.out.println("Hatalı veri girdiniz!!");
       }
       
       
       
       
       
       
       
      
       
       
      
       
    }
}
