public class IceCreamShop {
    int numOfScoops;
    String cones;
    String bowls;

    public IceCreamShop(int getNumOfScoops, String getCones, String getBowls) {
        this.numOfScoops = getNumOfScoops;
        this.cones = getCones;
        this.bowls = getBowls;
    }

    public int getNumOfScoops() {
        return numOfScoops;
    }

    public void setNumOfScoops(int numOfScoops) {
        this.numOfScoops = numOfScoops;
    }

    public String getCones() {
        return cones;
    }

    public void setCones(String cones) {
        this.cones = cones;
    }

    public String getBowls() {
        return bowls;
    }

    public void setBowls(String bowls) {
        this.bowls = bowls;
    }

}
