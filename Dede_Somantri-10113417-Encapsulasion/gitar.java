public class gitar extends onmusik {
	        
			@Override
  public void stok(){
        super.stok();
        System.out.println("13");
   
  }
  	@Override
    public void garansi(){
        super.garansi();
        System.out.println("Bergarasi 14 Tahun");
   
  }
  	@Override
    public void kategori(){
        super.kategori();
        System.out.println("Billy Musik-BM0028");
   
  }
public void tampilkan(){
        
   

     onmusik m = new onmusik();

     m.inputData("Yamaha Gitar SS2A ", "Hitam", "Gitar Acoustik",400000);
     m.tampilkandata();

 
    
}    
}