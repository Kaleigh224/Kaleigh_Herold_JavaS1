public class IceCreamFactory extends IceCream{
    private String ingredients;


    public IceCreamShop (String employees, String flavors[], int numOfFreezers, int pints) {
        super(employees, flavors[], numOfFreezers, pints);
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
