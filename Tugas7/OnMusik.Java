import java.util.Scanner;

public class OnMusik {
  public static String AppName;
  public static String AppVers;
  public static String AppAuth;

  public static Scanner input = new Scanner(System.in);
  public static OnMusik On_Musik = new OnMusik();
  public static Toko Dede = new Toko();
  
   public static alatmusik barang1 = new alatmusik();
   public static alatmusik barang2 = new alatmusik();
   

  OnMusik() {
    
    this.AppName = "onmusik (nada)";
    this.AppVers = "2.78";
    this.AppAuth = "Dede Somantro";
   }
   public static void set_barang() {
 
   barang1.namaalat = "Yamaha Gitar YCD";
    barang1.jenismsk= "Gitar Listrik";
    barang1.harga = 12021300;
 	
   barang2.namaalat = "Genta Z1";
   barang2.jenismsk= "Bass";
    barang2.harga = 7021300;
       }
   
	 public static void belanja_tunai(int jumlah_transaksi) { //fitur belanja
    Scanner input = new Scanner(System.in);
    Belanja belanja_tunai = new Belanja();

    char confirm = 'Y';
    String kode_barang;
    int jumlah_barang, count_jumlah_barang = 0;
    float uang_dibayarkan, total_biaya = 0, sum_harga_barang = 0;

    System.out.print("\n======\n");
    System.out.print("TRX/" + jumlah_transaksi + "\n");
    System.out.print("======\n\n");
    do {
      //kode_barang = "";
      //System.out.print("Kode Barang   : ");
      //kode_barang = input.nextLine(); //ceritanya cek dari database.
      System.out.print("Nama Barang   : " + barang_1.nama + "\n");//ceritanya cek dari database.
      System.out.print("Jumlah Barang : ");
      jumlah_barang = input.nextInt();
      System.out.print("Harga Barang  : " + barang_1.harga + "\n"); //ceritanya cek dari database.
      total_biaya = belanja_tunai.biaya_barang(barang_1.harga, jumlah_barang);
      System.out.print("Total Biaya   : " + total_biaya + "\n\n");

      System.out.print("Tambahkan barang lagi [Y/T] : ");confirm = input.next().charAt(0);
      System.out.print("-------------------------------\n");
      count_jumlah_barang += jumlah_barang;
      sum_harga_barang += total_biaya;
      if (confirm != 'Y') {
        break;
      }
    } while (confirm == 'Y');

    System.out.print("\nTotal Belanja   : " + count_jumlah_barang + " Barang = Rp" + sum_harga_barang);
    System.out.print("\nUang Dibayarkan : "); uang_dibayarkan = input.nextFloat();
    System.out.print("\nKembalian       : " + belanja_tunai.kembalian(uang_dibayarkan, sum_harga_barang));
    System.out.print("\n\n");
    System.out.print("~~~ ETok, kenyamanan tiada henti(^_^)/ ~~~\n");
    System.out.print("\n");
  }

  public static void tentang() { //tentang ETok
    System.out.print("--- " + AppName + " ---\n\n");
    System.out.print("AppName     : " + AppName + "\n");
    System.out.print("AppVersion  : " + AppVers + "\n");
    System.out.print("AppAuthor   : " + AppAuth + "\n");
    System.out.print("\n");
  }

  public static void main(String[] args) { //program utama
    Scanner input = new Scanner(System.in);

    int menu, trx = 0;
    boolean exit = false;
    set_barang();

    do {
      System.out.print("--- " + AppName + " ---\n\n");
      System.out.print("1. Lihat Toko\n");
      System.out.print("2. Lihat Barang\n");
      System.out.print("3. Belanja (new!)\n");
      System.out.print("4. Tentang On_Musik\n");
      System.out.print("0. Keluar\n\n");
      System.out.print("Pilih Menu : ");
      menu = input.nextInt();
      switch (menu) {
        case 0 : exit = true; break;
        case 1 : Dede.informasi_toko(); break;
        case 2 : set_barang();
                 //barang1.informasimusik();
                 //barang2.informasimusik();
				    break;
        case 3 : break;
        case 4 : tentang(); break;
        default : break;
      }
    } while ((menu >= 0 || menu <= 4) && (!exit));
  }

  public static void main(String[] args) {
main_menu();
	
    	}
}