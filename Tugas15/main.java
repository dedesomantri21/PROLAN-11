public class main {
 public static void main (String [] args){
	 	
	 System.out.println();
System.out.println("==== INFORMASI BARANG ======");
    System.out.println();
System.out.println("Gitar");

gitar h = new gitar();
 h.tampilkan();
       h.stok();
	   h.garansi();
	   h.kategori();


System.out.println("\nBass");
bass t = new bass();
t.tampilkan();

     bayar obj;
	 
	diskon pp = new diskon(5,3);
    superdiskon bs = new superdiskon(5);
    penawaran st = new penawaran(4, 3);
    
    
    // obj mengacu pada objek diskon
    obj = pp;
	System.out.println();
	System.out.println("==== INFORMASI DISKON ======");
	System.out.println();
    // akan memanggil method yang terdapat pada diskon
    System.out.println("Diskon Yang Di Dapatkan (%) : " + obj.luas());
    System.out.println();
    
    // obj mengacu pada objek superdiskon
    obj = bs;
    // akan memanggil method yang terdapat pada superdiskon
    System.out.println("Diskon Yang Di Dapatkan (%) : " + obj.luas());
    System.out.println();
    
    // obj mengacu pada objek penawaran
    obj = st;
    // akan memanggil method yang terdapat pada penawaran
    System.out.println("Diskon Tambahan(%) : " + obj.luas());
    System.out.println();
    
	
	System.out.println("==== INFORMASI TOKO ======");
	System.out.println();
      Box<Integer> integerBox = new Box<Integer>();
      Box<String> stringBox = new Box<String>();
    
      integerBox.add(new Integer(101132));
      stringBox.add(new String("Bandung , jl.Pasarbaru"));

      System.out.printf("Kode Toko :%d\n\n", integerBox.get());
      System.out.printf("Alamat :%s\n", stringBox.get());
 
     
 }
}