public class Printer {

    private int paperLeft;
    private int tonerVol;

    public Printer(int sheets, int tonerVol) {
        this.paperLeft = sheets;
        this.tonerVol = tonerVol;
    }

    public int getPaperLeft() {
        return this.paperLeft;
    }

    public int getTonerVol() {
        return this.tonerVol;
    }

    public void print(int sheets, int copies) {
        int requiredSheets = sheets * copies;
        if (requiredSheets <= this.paperLeft) {

            if (requiredSheets <= this.tonerVol) {
                System.out.println("Print successful");
                this.paperLeft -= requiredSheets;
                this.tonerVol -= requiredSheets;
            } else {
                this.paperLeft -= this.tonerVol;
                int remainAfterPrint = requiredSheets - this.tonerVol;
                this.tonerVol = 0;
                System.out.println("Print failed: " + remainAfterPrint + " sheets still to print");
            }
        }
    }
}
