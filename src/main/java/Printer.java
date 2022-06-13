public class Printer {
    private int paperSheetsLeft;
    private int toner;

    public Printer(int paperSheetsLeft, int toner){
        this.paperSheetsLeft = paperSheetsLeft;
        this.toner = toner;
    }

    public int getPaperSheetsLeft() {
        return paperSheetsLeft;
    }

    public int print(int copies){
        if (paperSheetsLeft >= copies){
            paperSheetsLeft = paperSheetsLeft - copies;
            toner = toner - copies;
        }
        return paperSheetsLeft;
    }
}
