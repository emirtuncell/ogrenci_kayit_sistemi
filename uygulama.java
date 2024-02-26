package ogrenci_kayit;

import java.util.Scanner;

public class uygulama {
          public static void main(String[] args) {
			
        	  liste_yapisi kayıt =new liste_yapisi();
        	  Scanner scan=new Scanner(System.in);
        	  
        	  int secim;
        	  
        	  while(true) {
        		  System.out.println("YAPMAK İSTEDİĞİNİZ İŞLEMİ GİRİNİZ. ");
        		  
        		  System.out.println("1- YENİ ÖĞRENCİ KAYDI  \n2- KAYIT SİLME \n3-KAYITLARI GÖRÜNTÜLE \nÇIKIŞ YAPMAK İÇİN 0'A BASINIZ...");
        		  secim=scan.nextInt();
        		  
        		  if(secim==1) {
        			  kayıt.ekle();
        			         			  
        			  System.out.println("\n");
        		  }
        		  else if(secim ==2) {
        			  kayıt.sil();
        			  System.out.println("\n");
        		  }
        		  else if(secim==3) {
        			  kayıt.yazdir();
        			  System.out.println("\n");
        		  }
        		  else if(secim==0) {
        			  break;
        			  
        		  }
        		  else {
        			  System.out.println("HATALI GİRİŞ YAPTINIZ... TEKRAR GİRİNİZ. \n");
        		  }
        		  
        	  }
		}
}
