public class menu{
    public String nama;
    public String jenis;
    public String harga;
    public void menu(String nama,String jenis,String harga){
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
        Database database = new Database();
        database.tambahMenu(nama,harga,jenis);
    }
}

