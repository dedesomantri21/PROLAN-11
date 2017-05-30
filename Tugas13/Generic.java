/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

class cabang<T>{
    private T nik;

    public cabang(T nik) {

        this.nik = nik;

    }

    public void setNik(T nik) {
        this.nik = nik;
    }

    public T getNik() {
        return nik;
    }

    public void getType() {
        System.out.println("Tipe awalnya " + nik.getClass().getName());
    }
}
public class Generic {
    public static void main(String[] args) {
        
        /*
        CASE 1
        */
        
        cabang<Integer> p = new cabang<Integer>(2121);
        int y = p.getNik();
        System.out.println("Kode Cabang Bandung : " + y);
        
        System.out.println("");
        System.out.println("-----------");
        System.out.println("");
        
        cabang<String> p2 = new cabang<String>("21213");
        String z = p2.getNik();
        System.out.println("Kode Cabang Saat Ini: " + z);
        
        
    }
    
}