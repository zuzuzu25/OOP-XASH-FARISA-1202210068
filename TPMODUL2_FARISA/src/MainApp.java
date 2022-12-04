public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat unknwn = new Perangkat("transcend",2,1.80f);
        Laptop asus = new Laptop("Seagate",8,2.4f,true);
        Handphone iphone = new Handphone("sandisk",3,2.7f,false);  
        System.out.println(unknwn.informasi());
        System.out.println();
        System.out.println(asus.informasi());
        System.out.println(asus.bukaGame("Dota 2"));
        System.out.println(asus.kirimEmail("farisa.mumtaza@gmail.com"));
        System.out.println(asus.kirimEmail("farisa.fikri.mumtaza@gmail.com","farisamumtaza@gmail.com"));
        System.out.println();
        System.out.println(iphone.informasi());
        System.out.println(iphone.telfon(629832568));
        System.out.println(iphone.kirimSMS(628765899));
        System.out.println(iphone.kirimSMS(628446489, 628765432));
    }
}
