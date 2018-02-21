package coffee;

public class CoffeeMachine {
    private final int MAX_USAGES = 5;
    private int usageCount;
    private Products products;

    public CoffeeMachine(Products products) {
        this.products = products;
    }

    public void addProducts(int sugarCount, int beanCount, int waterCount, int milkCount) {
       this.products.addSugar(sugarCount);
        this.products.addBeans(beanCount);
        this.products.addWater(waterCount);
        this.products.addMilk(milkCount);
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

    public CoffeeCup makeCoffeeCup(String coffeeType){
        if (this.usageCount == this.MAX_USAGES) {
            System.out.println("Time to clean your machine");
            return null;
        }

        switch (coffeeType) {
            case "black":
                this.makeBlack();
                return this.makeBlackCup();
            case "latte":
                this.makeLatte();
                return this.makeLatteCup();
            case "espresso":
                return this.makeEspressoCup();
            default:
                return null;
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

    private BlackCoffee makeBlackCup() {
        final int requiredSugar = 1;
        final int requiredBeans = 2;
        final int requiredWater = 3;
        final int requiredMilk = 0;

        if (!this.enoughProducts(requiredSugar, requiredBeans, requiredWater, requiredMilk)) {
            System.out.println("Not enough products for coffee");
            return null;
        }

        return new BlackCoffee(new Products(
                requiredSugar,
                requiredBeans,
                requiredWater,
                requiredMilk ));
    }

    private LatteCoffee makeLatteCup() {
        final int requiredSugar = 1;
        final int requiredBeans = 2;
        final int requiredWater = 2;
        final int requiredMilk = 2;

        if (!this.enoughProducts(requiredSugar, requiredBeans, requiredWater, requiredMilk)) {
            System.out.println("Not enough products for coffee");
            return null;
        }

        return new LatteCoffee(new Products(
                requiredSugar,
                requiredBeans,
                requiredWater,
                requiredMilk ));
    }

    private EspressoCoffee makeEspressoCup() {
        final int requiredSugar = 1;
        final int requiredBeans = 2;
        final int requiredWater = 1;
        final int requiredMilk = 0;

        if (!this.enoughProducts(requiredSugar, requiredBeans, requiredWater, requiredMilk)) {
            System.out.println("Not enough products for coffee");
            return null;
        }

        return new EspressoCoffee(new Products(
                requiredSugar,
                requiredBeans,
                requiredWater,
                requiredMilk ));
    }

    private void makeProduct(int requiredSugar, int requiredBeans, int requiredWater, int requiredMilk) {
        if (!this.enoughProducts(requiredSugar, requiredBeans, requiredWater, requiredMilk)) {
            System.out.println("Not enough products for coffee");
            return;
        }

        this.products.removeSugar(requiredSugar);
        this.products.removeBeans(requiredBeans);
        this.products.removeWater(requiredWater);
        this.products.removeMilk(requiredMilk);
        this.usageCount++;
        System.out.println("Your coffee is ready!");
    }

    private boolean enoughProducts(int sugarCount, int beanCount, int waterCount, int milkCount) {
        return sugarCount <= this.products.getSugarCount() - sugarCount  ||
                beanCount <= this.products.getBeanCount() - beanCount ||
                waterCount <= this.products.getWaterCount() - waterCount ||
                milkCount <= this.products.getMilkCount() - milkCount;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                ", usageCount=" + usageCount +
                ", products=" + products.toString() +
                '}';
    }
}
