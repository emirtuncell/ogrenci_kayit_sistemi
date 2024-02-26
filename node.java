package ogrenci_kayit;

public class node {
	int numara;
	String isim;
	String soyad;
	int vize;
	int fin;
	double ortalama;
	String durum;
	
	node next;
	

	public node(int numara, String isim, String soyad, int vize, int fin) {
		
		this.numara = numara;
		this.isim = isim;
		this.soyad = soyad;
		this.vize = vize;
		this.fin = fin;
		
		ortalama=vize*0.4 + fin*0.6;
		
		if(ortalama> 60) {
			System.out.println(ortalama+ " NOTUYLA GEÇTİ.");
		}
		else {
			System.out.println(ortalama+ " NOTUYLA KALDI.");
		}
		
		next =null;
		
	}


	
	
	
	
	
}
