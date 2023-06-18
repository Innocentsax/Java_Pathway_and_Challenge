package Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted =0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1; // if the toner level is >=0 and <=100, we set it to  tonerLevel, otherwise we set it to -1!
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        int tempAmount = tonerAmount + tonerLevel;
        if (tempAmount > 100 || tempAmount <0){
            return -1;
        }
        return (tonerLevel += tonerAmount);
        //(tempAmount > 100 || tempAmount <0) ? -1 : (tonerLevel += tonerAmount) NOT CORRECT? WHY!
    }

    public int printPages(int pages){
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
