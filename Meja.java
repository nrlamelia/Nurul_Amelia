public class Meja // kata kunci untuk nama file yang akan disimpan
 { // fungsi memulai sebuah program
	public int kaki_meja(){ //membuat variabel dengan nama kaki_meja bertipe data integer.
	return 70; //
	} // fungsi untuk menutup sebuah program


	public int alas_meja() { //membuat variable dengan nama alas_meja bertipe data integer.
	return 120; // nilai dari sebuah variable
	}
	public static void main (String [] args) //Menghasilkan nilai tetap yang bersifat public
	{
	Meja nana = new Meja(); // membuat variable nama dengan tipe data meja dan objek baru menggunakan keyword.
	int kaki = nana.kaki_meja(); // meemanggil variable bertipe integer dengan nama kaki_meja
	int alas_meja = nana.alas_meja();// memanggil variable bertipe integer dengan nama alas_meja
	System.out.println(kaki * alas_meja); // menampilkan hasil aritmatika dari variable ( kaki * alas_kaki)
	}
}