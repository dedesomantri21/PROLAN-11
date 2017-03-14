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
   
	  public static void tentang() { //
    System.out.print("--- " + AppName + " ---\n\n");
    System.out.print("AppName     : " + AppName + "\n");
    System.out.print("AppVersion  : " + AppVers + "\n");
    System.out.print("AppAuthor   : " + AppAuth + "\n");
    System.out.print("\n");
  }

  public static void main_menu() { //menu utama aplikasi
    int menu;
    boolean exit = false;
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