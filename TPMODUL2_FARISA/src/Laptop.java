public class Laptop extends Perangkat{
    protected boolean webcam;
    Laptop(String drive, int ram, float processor,boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    @Override
    public String informasi(){
        if(this.webcam){
            return("Laptop ini memiliki drive tipe "+ this.drive +" dengan ram sebesar "+ this.ram +" GB dan processor secepat "+ this.processor +" Ghz. Selain itu laptop ini juga memiliki webcam.");
        }
        return("Laptop ini memiliki drive tipe "+ this.drive +" dengan ram sebesar "+ this.ram +" GB dan processor secepat "+ this.processor +" Ghz.");
    };
    public String bukaGame(String nama_game){
        return("Laptop berhasil membuka game " + nama_game );
    };
    public String kirimEmail(String email1){
        return("Berhasil kirim email kepada " + email1);
    };
    public String kirimEmail(String email1,String email2){
        return("Berhasil kirim email kepada " + email1 + " dan " + email2 + ".");
    }
}
