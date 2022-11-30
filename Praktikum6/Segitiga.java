public class Segitiga extends BangunDatar{
	
	private int alas;
	private int tinggi;
	
	public Segitiga(int alas, int tinggi){
		this.tinggi = tinggi;
		this.alas = alas;
	}
	
	public void gambar(){
		System.out.println("Menggambar Segitiga");
	}
	
	public float luas(){
		return (float) (alas * tinggi / 2);
	}
}