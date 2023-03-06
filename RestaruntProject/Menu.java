package RestaruntProject;

public class Menu {
    private int order;
    private String name;

    private int rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
    Menu(int number,String name,int rate){
        this.order=number;
        this.name=name;
        this.rate=rate;
    }
    public void displayMenu(){
        System.out.println(order+" )"+ "   Item :"+ name +"      Price:"+ rate );
    }

}
