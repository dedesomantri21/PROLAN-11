
public class OnMusik {
  public static void main(String[] args) {
    Toko Dede = new Toko();
    Dede.nama = "Toko Dede";
    Dede.pemilik = "Dede Somantri";
    Dede.informasi_toko();

    Barang barang_1 = new Barang();
    Barang barang_2 = new Barang();

    barang_1.nama = "Gitar";
    barang_1.jumlah = 6;
    barang_1.Merk = "Yamaha";
    barang_1.harga = 66600.00;
    barang_1.informasi_barang();

    barang_1.nama = "Drum";
    barang_1.jumlah = 44;
    barang_1.Merk = "Rolling";
    barang_1.harga = 6673000.00;
    barang_1.informasi_barang();
  }
}