package basic.practice;

public class Cars {

    String company;
    String color;
    int priceInLakhs;


    @Override
    public String toString() {
        return "Cars [color=" + color + ", company=" + company + ", priceInLakhs=" + priceInLakhs + "]";
    }

    //constructor with parameters

    public Cars(String company, String color, int priceInLakhs) {
        this.company = company;
        this.color = color;
        this.priceInLakhs = priceInLakhs;
    }

    //getters and setters

    public String getCompany() {
        return company;
    }


    public void setCompany(String company) {
        this.company = company;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public int getPriceInLakhs() {
        return priceInLakhs;
    }


    public void setPriceInLakhs(int priceInLakhs) {
        this.priceInLakhs = priceInLakhs;
    }

    // methods

    public void car(String carColor, int carPrice){
        System.out.println("The cost of that "+carColor+" is "+carPrice+"lakhs");
    }


    public static void main(String[] args) {
        Cars models = new Cars("Benz", "red", 25);
        models.car(models.color, models.priceInLakhs);
    }
}
