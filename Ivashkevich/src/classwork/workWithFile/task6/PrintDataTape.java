package classwork.workWithFile.task6;

/**
 * Created by Leonid on 13.03.2015.
 */
public class PrintDataTape {

    public void print(String res) {
        for (; ; ) {
            int input = InputDataType.input();
            if (input == 6) {
                System.out.print("Неизвестный тип данных.");
            }
            if (input == 5) {
                break;
            }
            String[] resSplit = res.split(" +");
            for (String currentResSplit : resSplit) {
                String resTrim = currentResSplit.replaceAll(",$", "").replaceAll(",", ".");
                try {
                    Integer isInt = Integer.parseInt(resTrim);
                    if (input == 1) {
                        System.out.print(resTrim + " ");
                    }
                } catch (NumberFormatException e) {
                    try {
                        Double isDouble = Double.parseDouble(resTrim);
                        if (input == 2) {
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