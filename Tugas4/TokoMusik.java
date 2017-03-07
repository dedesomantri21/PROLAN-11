public class TokoMusik {
  protected String nama, satuan;
  protected Integer jumlah;
  protected Double harga;

  public void informasi_alat() {
    System.out.print("-- Informasi --\n\n");
    System.out.print("Nama Barang     : " + nama + "\n");
    System.out.print("Jumlah Barang   : " + jumlah + " " + satuan + "\n");
    System.out.print("Harga Barang    : " + harga + "\n");
    System.out.print("\n");
  }
}
