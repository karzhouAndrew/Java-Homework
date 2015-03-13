package classwork.workWithFile.task6;

/**
 * Created by Leonid on 13.03.2015.
 */
public class PrintDataTape {

    public void print(String res) {
        for (; ; ) {
            int input = InputDataType.input();
            if(input==6){
                System.out.print("Неизвестный тип данных.");
            }
            if (input == 5) {
                break;
            }
            String[] resSplit = res.split(" +");
            for (int i = 0; i < resSplit.length; i++) {
                String resTrim = resSplit[i].replaceAll(",$", "").replaceAll(",", ".");
                try {
                    Integer ie = Integer.parseInt(resTrim);
                    if (ie instanceof Integer && input == 1) {
                        System.out.print(resTrim + " ");
                    }
                } catch (NumberFormatException e) {
                    try {
                        Double ie = Double.parseDouble(resTrim);
                        if (ie instanceof Double && input == 2) {
                            System.out.print(resTrim + " ");
                        }
                    } catch (NumberFormatException e2) {
                        if (resTrim.matches("[а-яА-Я]+")) {
                            if (input == 3) {
                                System.out.print(resTrim + " ");
                            }
                        } else {
                            if (input == 4) {
                                System.out.print(resTrim + " ");
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}