public class gitar extends onmusik {
public void tampilkan(){
     double stok =16;
     String garansi="No Warranty";
     String kategori="Billy Musik-BM0028";

     onmusik m = new onmusik();

     m.inputData("Yamaha Gitar SS2A ", "Hitam", "Gitar Acoustik",400000);
     m.tampilkandata();

      System.out.println("banyak nya stok:"+stok);
      System.out.println("Tipe garansi :"+garansi);
      System.out.println("Kategori Model :"+kategori);
    
}    
}