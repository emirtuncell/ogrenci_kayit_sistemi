package ogrenci_kayit;

import java.util.Scanner;

public class liste_yapisi {
	node head=null;
	node tail=null;
	node temp=null;
	node temp2=null;
	
	int numara;
	String isim;
	String soyad;
	int vize;
	int fin;
	double ortalama;
	String durum;
	
	Scanner scan = new Scanner(System.in);
	
	void ekle() {
		
		
		System.out.println("ÖĞRENCİNİN NUMARASI:  "); numara=scan.nextInt(); scan.nextLine();
		System.out.println("ÖĞRENCİNİN ADI:  "); isim=scan.nextLine();
		System.out.println("ÖĞRENCİNİN SOYADI:  "); soyad=scan.nextLine();
		
		
	    while(true) {
	    	System.out.println("VİZE NOTU:  "); vize=scan.nextInt();
	    	if(vize<0 || vize>100) {
	    		System.out.println("HATALI GİRİŞ. ");
	    		
	    	}
	    	else {
	    		break;
	    	}
	    }
		
	    while(true) {
		System.out.println("FİNAL NOTU:  "); fin=scan.nextInt();
		if(fin <0 || fin> 100) {
			System.out.println("HATALI GİRİŞ !!!");
		}else {
			break;
		}
		
	    }
		node eleman=new node (numara , isim , soyad , vize , fin);
		
		if(head==null) {
			head=eleman;
			tail=eleman;
			System.out.println("ÖĞRENCİ KAYIT LİSTESİ OLUŞTURULDU ve İLK ÖĞRENCİ SİSTEME KAYIT EDİLDİ.");
			
		}
		else {
		
			
			eleman.next=null;
			tail.next=eleman;
			tail=eleman;
			
			System.out.println(numara+ " NUMARALI ÖĞRENCİ KAYIT SİSTEMİNE KAYDEDİLDİ.");
		}
		
	}
	
	
	void sil() {
		
		if(head==null) {
			System.out.println("LİSTE BOŞ.SİLİNECEK BİR KAYIT YOK.");
		}
		else {
			System.out.println("SİLİNECEK ÖĞRENCİNİN NUMARASINI GİRİNİZ:  ");
			numara=scan.nextInt();
			
			if(numara==head.numara && head.next==null) {
				head=null;
				tail=null;
				System.out.println(numara+" NUMARALI ÖĞRENCİNİN KAYDI SİLİNMİŞTİR.BİLGİNİZE...");
			}
			else if(numara==head.numara && head.next !=null) {
				head=head.next;
				System.out.println(numara+" NUMARALI ÖĞRENCİNİN KAYDI SİLİNMİŞTİR.BİLGİNİZE...");
				
			
				
			}
			else {
				temp=head;
				temp2=head;
				
				while(temp.next != null) {
					if(numara==temp.numara ) {
						temp2.next=temp.next;
						System.out.println(numara+" NUMARALI ÖĞRENCİNİN KAYDI SİLİNMİŞTİR.BİLGİNİZE..."); 
						
					}
					temp2=temp;
					temp=temp.next;
					if(numara ==temp.numara) {
						temp2.next=null;
						tail=temp2;
						System.out.println(numara+ " NUMARALI ÖĞRENCİNİN KAYDI SİLİNMİŞTİR.BİLGİNİZE...");
					}
				}
			}
		
		}
	}
	
	
	void yazdir() {
		if(head==null) {
			System.out.println("GÖRÜNTÜLENECEK BİR KAYIT BULUNAMADI.");
		}
		else {
			temp=head;
			
			while(temp != null) {
				System.out.println("\n" +temp.numara+ " NUMARALI ÖĞRENCİNİN BİLGİLERİ ");
				System.out.println("<------------------------------------>");
				System.out.println("ÖĞRENCİNİN NUMARASI : "+temp.numara);
				System.out.println("ÖĞRENCİNİN ADI : "+temp.isim);
				System.out.println("ÖĞRENCİNİN SOYADI : "+temp.soyad);
				System.out.println("ÖĞRENCİNİN VİZE NOTU : "+temp.vize);
				System.out.println("ÖĞRENCİNİN FİNAL NOTU : "+temp.fin);

				System.out.println("<------------------------------------>");
				
				
				temp=temp.next;
			}
		}
	}
	
}
