package deneme;

public class Ogrenci extends AbstractYazdýrma {
	
	
	private int OgrenciNO;
	private String OgrenciAdi;
	private String Bolum;
	
	private String[] DersAdi;
	private String[] DersKodu;
	private int[] DersAkts;
	private int[] Puan;
	
	public String[] getDersAdi() {
		return DersAdi;
	}
	public void setDersAdi(String[] dersAdi) {
		DersAdi = dersAdi;
	}
	public String[] getDersKodu() {
		return DersKodu;
	}
	public void setDersKodu(String[] dersKodu) {
		DersKodu = dersKodu;
	}
	public int[] getDersAkts() {
		return DersAkts;
	}
	public void setDersAkts(int[] dersAkts) {
		DersAkts = dersAkts;
	}
	public int[] getPuan() {
		return Puan;
	}
	public void setPuan(int[] puan) {
		Puan = puan;
	}
	
	public int getOgrenciNO() {
		return OgrenciNO;
	}
	public void setOgrenciNO(int ogrenciNO) {
		OgrenciNO = ogrenciNO;
	}
	
	public String getOgrenciAdi() {
		return OgrenciAdi;
	}
	public void setOgrenciAdi(String ogrenciAdi) {
		OgrenciAdi = ogrenciAdi;
	}
	
	public String getBolum() {
		return Bolum;
	}
	public void setBolum(String bolum) {
		Bolum = bolum;
	}
	
	
	
	
	
	
	@Override
	void yazdýr() {
		System.out.println(Bolum);
		
	}
	
	
}
