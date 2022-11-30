public class Utama{
	
	public static void main(String[] args) {
		
		BangunDatar persegi1 = new Persegi(5,8);
		BangunDatar lingkaran1 = new Lingkaran(4);
		BangunDatar segitiga1 = new Segitiga(5,8);
		
		persegi1.gambar();
		lingkaran1.gambar();
		segitiga1.gambar();
		
		System.out.println("Luas Persegi: " + persegi1.luas());
		System.out.println("Luas Lingkaran: " + lingkaran1.luas());
		System.out.println("Luas Segitiga: " + segitiga1.luas());
	}
}
		