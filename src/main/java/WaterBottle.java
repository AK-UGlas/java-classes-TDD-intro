public class WaterBottle {

    private int volume = 100;

    public WaterBottle() {

    }

    public int getVolume() {
        return this.volume;
    }

    public void drink() {
        this.volume -= 10;
        if (this.volume < 0) {
            this.volume = 0;
        }
    }

    public void empty() {
        this.volume = 0;
    }

    public void fill() {
        this.volume = 100;
    }
}
