public class Lingkaran extends BangunDatar{
	
	private int r;
	
	public Lingkaran(int r){
		this.r = r;
	}
	
	public float luas(){
		return (float) (3.14 * r * r);
	}
	
	public void gambar(){
		System.out.println("Menggambar Lingkaran");
	}
}