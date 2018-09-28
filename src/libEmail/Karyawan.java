package libEmail;

public class Karyawan {
	private String nama;
	private int umur;
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setUmur(int umur) {
		this.umur = umur;
	}
	
	public void showInfo() {
		System.out.println("nama : " + nama);
		System.out.println("umur : " + umur);
	}
	
}
