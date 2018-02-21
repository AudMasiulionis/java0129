package coffee;

public class Products {
    private int sugarCount;
    private int beanCount;
    private int waterCount;
    private int milkCount;

    public Products(int sugarCount, int beanCount, int waterCount, int milkCount) {
        this.sugarCount = sugarCount;
        this.beanCount = beanCount;
        this.waterCount = waterCount;
        this.milkCount = milkCount;
    }

    public int getSugarCount() {
        return sugarCount;
    }

    public int getBeanCount() {
        return beanCount;
    }

    public int getWaterCount() {
        return waterCount;
    }

    public int getMilkCount() {
        return milkCount;
    }

    protected void addSugar(int value){
        this.sugarCount += value;
    }
    protected void addBeans(int value){
        this.beanCount += value;
    }
    protected void addWater(int value){
        this.waterCount += value;
    }
    protected void addMilk(int value){
        this.milkCount += value;
    }

    protected void removeSugar(int value){
        this.sugarCount -= value;
    }
    protected void removeBeans(int value){
        this.beanCount -= value;
    }
    protected void removeWater(int value){
        this.waterCount -= value;
    }
    protected void removeMilk(int value){
        this.milkCount -= value;
    }



    @Override
    public String toString() {
        return "Products{" +
                "sugarCount=" + sugarCount +
                ", beanCount=" + beanCount +
                ", waterCount=" + waterCount +
                ", milkCount=" + milkCount +
                '}';
    }
}
