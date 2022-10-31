public class Database{
    private String[][] menu = {{"ayam goreng","makanan","13.000"},{"bakso","makanan","20.000"},{"es degan","minuman","15.000"}};

    public void tambahMenu(String nama,String harga,String jenis){
        menu[menu.length-1][0] = nama;
        menu[menu.length-1][1] = harga;
        menu[menu.length-1][2] =jenis;
    }
    public void insertMenu(String nama){
        for(int i = 0; i < menu.length; i++){
            if (nama == menu[i][0]){
                System.out.println(nama + " " + menu[i][1] + " " + menu[i][2]);
                break;
            }
        }
        System.out.println("Menu yang dicari tidak ada!");            
    
    public static void main(String[] args){
        Database a = new Database();
        a.insertMenu("ayambrazil");
    }
}