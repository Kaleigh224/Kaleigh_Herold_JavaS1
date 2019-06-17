public class IceCreamFactory {
    int pint;
    int gallon;
    int fiveGallon;

    public int getPint() {
        return pint;
    }

    public void setPint(int pint) {
        this.pint = pint;
    }

    public int getGallon() {
        return gallon;
    }

    public void setGallon(int gallon) {
        this.gallon = gallon;
    }

    public int getFiveGallon() {
        return fiveGallon;
    }

    public void setFiveGallon(int fiveGallon) {
        this.fiveGallon = fiveGallon;
    }

    public IceCreamFactory(int getPint, int getGallon, int getFiveGallon) {
        this.pint = getPint;
        this.gallon = getGallon;
        this.fiveGallon = getFiveGallon;
    }
}
