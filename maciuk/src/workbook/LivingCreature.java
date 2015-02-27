package workbook;

/**
 * Created by Asus on 27.02.2015.
 */
public class LivingCreature {
    private Characteristic p = new Characteristic("Живое существо");
    private Descripsion t = new Descripsion("Обычное живое существо");

    public LivingCreature() {
        System.out.println("LivingCreature");
    }
    protected void dispose(){
        System.out.println("dispose() в LivingCreature()");
        t.dispose();
        p.dispose();
    }
}
