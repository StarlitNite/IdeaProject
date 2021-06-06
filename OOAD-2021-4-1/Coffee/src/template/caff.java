package template;

public abstract class caff {
   public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    public void boilWater(){
        System.out.println("Boiling water...");
    }
    public abstract void brew();
    public void pourInCup(){
        System.out.println("poured the beverage into a cup");
    }
    public abstract void addCondiments();
}
