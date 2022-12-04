public class Handphone extends Perangkat {
    protected boolean fingerprint;
    Handphone(String drive, int ram, float processor,boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    };
    @Override
    public String informasi(){
        if(this.fingerprint){
            return ("Handphone ini memiliki drive tipe " + this.drive + ", RAM sebesar " + this.ram + ", dan juga Processor secepat " + this.processor + ". Handphone ini juga dilengkapi dengan fingerprint");
        }
        return ("Handphone ini memiliki drive tipe " + this.drive + ", RAM sebesar " + this.ram + ", dan juga Processor secepat " + this.processor+ " Ghz. Handphone ini tidak dilengkapi dengan fingerprint" );
    };
    public String telfon(int no_hp){
        return ("menyambungkan telfon ke nomor " + no_hp + ".");
    };
    public String kirimSMS(int no_hp){
        return ("Berhasil mengirim sms ke nomor " + no_hp + ".");
    };
    public String kirimSMS(int no_hp1,int no_hp2){
        return ("Berhasil mengirim sms ke nomor " + no_hp1 + " dan " + no_hp2 + ".");
    };
    
}
