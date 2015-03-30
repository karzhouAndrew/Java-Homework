package workbook.classesAndInterfaces.task05;
// Sozdat' ierarhiju klassov, opisyvauschih bytovuju tehniku (hotia by 3 urovnia). Sozdat' neskolko objektov opisannyh klassov, chast' iz nih vkluchit' v rozetku
public class Main {
    public static void main(String[] args) {
        Technics    tvSet1 = new TVSet("Phillips", "PS-32"),
                    tvSet2 = new TVSet("LG", "42-D11"),
                    homeComputer1 = new HomeComputer("IBM", "AT-286"),
                    notebook1 = new Notebook("HP", "Pavilion dm3"),
                    smartphone1 = new Smartphone("Samsung", "Galaxy S+"),
                    smartphone2 = new Smartphone("Nokia", "8606"),
                    refrigerator1 = new Refrigerator("Atlant"),
                    washingMashine1 = new WashingMashine("Indesit");

            System.out.println();
        tvSet1.turnOn();
        smartphone1.turnOn();
        smartphone2.turnOn();
        refrigerator1.turnOn();
            System.out.println();
        tvSet2.turnOff();
    }
}
/*Console output:
Phillips(PS-32) is turned OFF
LG(42-D11) is turned OFF
IBM(AT-286) is turned OFF
HP(Pavilion dm3) is turned OFF
Samsung(Galaxy S+) is turned OFF
Nokia(8606) is turned OFF
Atlant(...) is turned OFF
Indesit(...) is turned OFF

Phillips(PS-32) is turned ON
Samsung(Galaxy S+) is turned ON
Nokia(8606) is turned ON
Atlant(...) is turned ON

LG(42-D11) is turned OFF*/