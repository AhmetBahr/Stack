public class Odev_4 {
	public static void main(String[] args) {
		kitap k=new kitap();
		mesaj m=new mesaj();
		
		System.out.println(k.oku());
		System.out.println(k.getIsim());	
		System.out.println(m.oku());
		System.out.println(m.getG�nderen());	
	}
}

interface okuma{
	public String oku();
}

class kitap implements okuma{
	String isim="Penguenler";
	int sayfalar [] = {0,1,2,3,4,5,6,7,8,9,10};
	int sayfaNo=1;	
	
	public static void kitap(String isim, int sayfalar[]) {	
	
		
	}
	
	public String getIsim() {
		return isim;
	}
	
	public int SyfaSay�s�() {
		return sayfalar[10];
	
	}
	public String oku() {
	return Integer.toString(sayfaNo);
	}
	
	public void SonrakiSayfa()
	{
			sayfaNo++;
			
			if(sayfaNo==sayfalar.length-1)
				sayfaNo=0;
	}
}

class mesaj implements okuma{
	 String g�nderen="�ok ho� bir kitapt�",icerik="Penguenlerin hayat�.."; 
	
	 public String oku(){
		return icerik;
	}
	
	 public mesaj(String g�nderen,String icerik) {	
	}
	
	 public mesaj() {	
	}
	
	 public String getG�nderen() {
		return g�nderen;
	}
}