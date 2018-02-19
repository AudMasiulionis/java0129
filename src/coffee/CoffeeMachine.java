package coffee;

public class CoffeeMachine {
    private final int MAX_USAGES = 5;

    private int usageCount;
    private int sugarCount;
    private int beanCount;
    private int waterCount;
    private int milkCount;

    public CoffeeMachine(int sugarCount, int beanCount, int waterCount, int milkCount) {
        this.sugarCount = sugarCount;
        this.beanCount = beanCount;
        this.waterCount = waterCount;
        this.milkCount = milkCount;
    }

    public void addProducts(int sugarCount, int beanCount, int waterCount, int milkCount) {
        this.sugarCount += sugarCount;
        this.beanCount += beanCount;
        this.waterCount += waterCount;
        this.milkCount += milkCount;
    }

    public void clean() {
        this.usageCount = 0;
    }

    public void makeCoffee(String coffeeType) {

        if (this.usageCount == this.MAX_USAGES) {
            System.out.println("Time to clean your machine");
            return;
        }

        switch (coffeeType) {
            case "black":
                this.makeBlack();
                break;
            case "latte":
                this.makeLatte();
                break;
            case "espresso":
                this.makeEspresso();
                break;
            default:
                System.out.println("Selection does not exist");
                break;
        }
    }

    private void makeBlack() {
        final int requiredSugar = 1;
        final int requiredBeans = 2;
        final int requiredWater = 3;
        final int requiredMilk = 0;
        this.makeProduct(requiredSugar, requiredBeans, requiredWater, requiredMilk);
    }

    private void makeLatte() {
        final int requiredSugar = 1;
        final int requiredBeans = 2;
        final int requiredWater = 2;
        final int requiredMilk = 2;
        this.makeProduct(requiredSugar, requiredBeans, requiredWater, requiredMilk);
    }

    private void makeEspresso() {
        final int requiredSugar = 1;
        final int requiredBeans = 2;
        final int requiredWater = 1;
        final int requiredMilk = 0;
        this.makeProduct(requiredSugar, requiredBeans, requiredWater, requiredMilk);
    }

    private void makeProduct(int requiredSugar, int requiredBeans, int requiredWater, int requiredMilk) {
        if (!this.enoughProducts(requiredSugar, requiredBeans, requiredWater, requiredMilk)) {
            System.out.println("Not enough products for coffee");
            return;
        }

        this.sugarCount -= requiredSugar;
        this.beanCount -= requiredBeans;
        this.waterCount -= requiredWater;
        this.milkCount -= requiredMilk;
        this.usageCount++;
        System.out.println("Your coffee is ready!");
    }

    private boolean enoughProducts(int sugarCount, int beanCount, int waterCount, int milkCount) {
        return sugarCount <= this.sugarCount - sugarCount  &&
                beanCount <= this.beanCount - beanCount &&
                waterCount <= this.waterCount - waterCount &&
                milkCount <= this.milkCount - milkCount;
    }

    //chill I will explain later :)
    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "\nusageCount=" + usageCount +
                ",\nsugarCount=" + sugarCount +
                ",\nbeanCount=" + beanCount +
                ",\nwaterCount=" + waterCount +
                ",\nmilkCount=" + milkCount +
                "\n}";
    }
}
