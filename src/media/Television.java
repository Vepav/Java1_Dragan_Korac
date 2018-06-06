package media;

public class Television {

    private int volume;
    private int currentProgram;
    private boolean turnOn;

    public Television() {
        currentProgram = 0;
    }

    public Television(int volume, int currentProgram, boolean turnOn) {
        this.volume = volume;
        this.currentProgram = currentProgram;
        this.turnOn = turnOn;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getcurrentProgram() {
        return currentProgram;
    }

    public void setcurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }

    public boolean getturnOn() {
        return turnOn;
    }

    public void setturnOn(boolean turnOn) {
        this.turnOn = turnOn;

    }

    public void showData() {
        System.out.println("Jačina je: " + getVolume());
        System.out.println("Trenutni program je: " + getcurrentProgram());
        System.out.println("Uključeno: " + getturnOn());
    }

}
