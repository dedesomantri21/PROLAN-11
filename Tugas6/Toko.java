public class Toko {
  protected String nama;
  protected String pemilik;
  protected char Status;
  protected boolean kredit;

 Toko() {
   
    nama = "Dede Nada";
    pemilik = "Dede Somantri";
   
  }



 public String rewrite_status(char status) { 
    String text_status;
    switch (status) {
      case 'A': text_status = "Aktif"; break;
      case 'N': text_status = "Tidak Aktif"; break;
      case 'B': text_status = "Diblokir"; break;
      case 'D': text_status = "Dihapus"; break;
      default: text_status = "Tidak diketahui"; break;
    }
return text_status;
 }
  public void informasi_toko() {
      System.out.print("-- Informasi --\n");
      System.out.print("Nama Toko       : " + nama + "\n");
      System.out.print("Pemilik Toko    : " + pemilik + "\n");
	  
      System.out.print("\n");
  }
}