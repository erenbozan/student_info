package deneme;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ogrenci kisi1 = new Ogrenci();
		Lisans kisi2 = new Lisans();
		Y�ksekLisans kisi3 = new Y�ksekLisans();
		
	
		int asama = 1;
		
		for( ;asama == 1;){
			System.out.println("-----��renci bilgi sistemi------\n\n\n");
			System.out.println("��renci kay�t i�in-------->1\nbilgi d�k�m� i�in------>2");
			asama = scan.nextInt();
			
			switch(asama) {
			case 1:
				

				System.out.println("ogrenci ad� gir:");
				String adi =  scan.nextLine();
				
				System.out.println("ogrenci no gir:");
				int nosu = scan.nextInt();
				scan.nextLine();
				
				System.out.println("ogrenci bolum ad� gir:");
				String bolumu = scan.nextLine();
				
				kisi1.setOgrenciAdi(adi);
				kisi1.setOgrenciNO(nosu);
				kisi1.setBolum(bolumu);
				
				System.out.println("ders say�s� giriniz");
				int dersAdet = scan.nextInt();
				String[] dersKodlar = new String[dersAdet];
				String[] dersAdlar= new String[dersAdet];
				int[] dersAktsler= new int[dersAdet];
				int[] dersPuanlar= new int[dersAdet];
				
				
				
				
			    for(int i=0; i < dersAdet; i++ ) {
					scan.nextLine();
					System.out.println("ders kodu giriniz "+(i+1));
					dersKodlar[i] = scan.nextLine();
					
					System.out.println("ders ad� giriniz "+(i+1));
					dersAdlar[i] = scan.nextLine();
					
					System.out.println("ders akts giriniz "+(i+1));
			    	dersAktsler[i] = scan.nextInt();
					
					System.out.println("ders notu giriniz "+(i+1));
					dersPuanlar[i] = scan.nextInt();
					
				}
			    kisi1.setDersKodu(dersKodlar);
			    kisi1.setDersAdi(dersAdlar);
			    kisi1.setDersAkts(dersAktsler);
			    kisi1.setPuan(dersPuanlar);
				
				
				
			
				
				System.out.println("---ogrenci t�r� se�iniz---\n "
												+ "lisans ��rencisi i�in---------1\n"
												+ "y�ksek lisans ��rencisi i�in--2\n"
												+ "doktora ��rencisi i�in--------3\n");
				int OgretimTur = scan.nextInt();
				if(OgretimTur>1) {
					System.out.println("lisans yap�lan �niversite ad� giriniz");
					scan.nextLine();
					String UniAdi1 = scan.nextLine();
					kisi2.setLisansOkulu(UniAdi1);
					System.out.println("lisans yap�lan bolum ad� giriniz");
					String LisBolum = scan.nextLine();
					kisi2.setLisansBolum(LisBolum);
					
					if(OgretimTur>2) {
						System.out.println("y�ksek lisans yap�lan �niversite ad� giriniz");
						String UniAdi2 = scan.nextLine();
						kisi3.setYuksekOkul(UniAdi2);
						System.out.println("y�ksek lisans yap�lan bolum ad� giriniz");
						String YukBolum = scan.nextLine();
						kisi3.setYuksekBolum(YukBolum);
					}
				}
				
				
				
				
			break;
			
			case 2:	
				if(kisi1.getBolum() !=  null) {
					
					System.out.print("��renci no:" + kisi1.getOgrenciNO()+"; ");
					System.out.print("isim:" + kisi1.getOgrenciAdi()+"; ");			
					System.out.println("b�l�m:" + kisi1.getBolum()+ "; ");
					System.out.println("ders kodlar� :"+Arrays.toString(kisi1.getDersKodu()));
					System.out.println("ders isimleri:"+Arrays.toString(kisi1.getDersAdi()));
					System.out.println("ders aktsler :"+Arrays.toString(kisi1.getDersAkts()));
					System.out.println("ders puanlar�:"+Arrays.toString(kisi1.getPuan()));
					if(kisi3.getYuksekBolum() != null) {
						System.out.println("---y�ksek lisans bilgileri---");
						System.out.print(kisi3.getYuksekOkul()+ "; ");
						System.out.println(kisi3.getYuksekBolum());
						System.out.println("---lisans bilgileri---");
						System.out.print(kisi2.getLisansOkulu()+"; ");
						System.out.println(kisi2.getLisansBolum());
					}
					else if( (kisi2.getLisansBolum() != null)    &&   (kisi3.getYuksekBolum()==null) ) {
						System.out.println("---lisans bilgileri---");
						System.out.print(kisi2.getLisansOkulu()+"; ");
						System.out.println(kisi2.getLisansBolum());
					}
				}
			break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	
}
