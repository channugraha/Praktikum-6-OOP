public class Persegi extends BangunDatar{
	
	private float panjang;
	private float lebar;
	
	public Persegi(float panjang, float lebar){
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	public float luas(){
		return this.panjang * this.lebar;
	}
	
	public void gambar(){
		System.out.println("Menggambar Persegi");
	}
}