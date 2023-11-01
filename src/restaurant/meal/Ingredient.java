package restaurant.meal;

public class Ingredient {
    public String name;
    public String unitOfMeasure;
    public double measure;

    public Ingredient(double measure, String unitOfMeasure, String name) {
        this.name = name;
        this.unitOfMeasure = unitOfMeasure;
        this.measure = measure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public double getMeasure() {
        return measure;
    }

    public void setMeasure(double measure) {
        this.measure = measure;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", unitOfMeasure='" + unitOfMeasure + '\'' +
                ", measure=" + measure +
                '}';
    }

}
