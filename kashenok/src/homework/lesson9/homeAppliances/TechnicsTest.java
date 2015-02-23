package homework.lesson9.homeAppliances;

public class TechnicsTest {

    public static void main(String[] args) {
        LargeTechnics refrigerator1 = new LargeTechnics();
        refrigerator1.setColour("Белый");
        refrigerator1.setMass("50 кг");
        refrigerator1.setOn(true);
        System.out.println("refrigerator1.isOn = " + refrigerator1.isOn);
        System.out.println("refrigerator = " + refrigerator1);


        System.out.println();


        CitchenAppliances microwave = new CitchenAppliances();
        microwave.isOn = true;
        microwave.setPrice(108.6);
        microwave.setColour("Черный");
        microwave.setMass("12 кг");
        microwave.setOn(false);
        System.out.println("microwave.isOn = " + microwave.isOn);
        System.out.println("microwave = " + microwave);

        System.out.println();

        MicrowaweSamsung Mw700s = new MicrowaweSamsung();
        Mw700s.setOn(true);
        Mw700s.setPrice(212.4);
        Mw700s.setColour("Silver");
        Mw700s.setMass("12 кг");
        System.out.println("Mw700s.isOn = " + Mw700s.isOn);
    }
}
