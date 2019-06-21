public class IceCream {
    private String employees;
    private String Flavors;
    private int numOfFreezers;
    private int pints;

    public IceCream(String employees, String flavors, int numOfFreezers, int pints) {
        this.employees = employees;
        Flavors = flavors;
        this.numOfFreezers = numOfFreezers;
        this.pints = pints;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getFlavors() {
        return Flavors;
    }

    public void setFlavors(String flavors) {
        Flavors = flavors;
    }

    public int getNumOfFreezers() {
        return numOfFreezers;
    }

    public void setNumOfFreezers(int numOfFreezers) {
        this.numOfFreezers = numOfFreezers;
    }

    public int getPints() {
        return pints;
    }

    public void setPints(int pints) {
        this.pints = pints;
    }
}