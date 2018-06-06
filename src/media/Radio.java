package media;

public class Radio {
    
    private double fmFrequency;
    private double amFrequency;
    private boolean band;
    
 public Radio() {
     fmFrequency = 91.8;
     amFrequency = 600;     
 }
     
     
 
    public Radio(double fmFrequency, double amFrequency, boolean band) {
        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
        this.band = band;

    }
   
    public double getfmFrequency() {
        return fmFrequency;
    }

    public void setfmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;
    }

    public double getamFrequency() {
        return amFrequency;
    }

    public void setamFrequency(double amFrequency) {
        this.amFrequency = amFrequency;
    }

    public boolean getband() {
        return band;
    }

    public void setturnOn(boolean band) {
        this.band = band;

    }

    public void showData() {
        System.out.println("FM frekvencija je: " + getfmFrequency());
        System.out.println("AM frekvencija je: " + getamFrequency());
        System.out.println("Band je : " + getband());
    }

}
