public class Perangkat {
    protected String drive;
    protected int ram;
    protected float processor;
    Perangkat(String drive,int ram,float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    public String informasi(){
        return ("Perangkat tidak diketahui memiliki ddrive tipe " + this.drive + ", RAM sebesar " + this.ram + " GB, dan Processor secepat " + this.processor + " Ghz.");
    }
}
