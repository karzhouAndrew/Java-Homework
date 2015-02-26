package workbook.lab23;

/**
 * Created by Leonid on 23.02.2015.
 */
public class Atm {
    private int banknote20;
    private int banknote50;
    private int banknote100;
    private String text = "Доступны банкноты номиналом 20, 50, 100";


    public int getBanknote20() {
        return banknote20;
    }

    public void setBanknote20(int banknote20) {
        this.banknote20 = banknote20;
    }

    public int getBanknote50() {
        return banknote50;
    }

    public void setBanknote50(int banknote50) {
        this.banknote50 = banknote50;
    }

    public int getBanknote100() {
        return banknote100;
    }

    public void setBanknote100(int banknote100) {
        this.banknote100 = banknote100;
    }

    public boolean atmStatus() {

        if (banknote20 == 0 && banknote50 == 0 && banknote100 == 0) {
            System.out.println("Банкомат пуст");
            return false;
        } else {
            if (banknote20 == 0) {
                text = text.replaceAll("20, ", "");
            }
            if (banknote50 == 0) {
                text = text.replaceAll("50, ", "");
            }
            if (banknote100 == 0) {
                text = text.replaceAll("100", "");
            }
            System.out.println(text);
            return true;
        }
    }


    public boolean inputStatus(int input) {
        int i = 0;
        if (banknote20 == 0 && banknote50 == 0 && banknote100 == 0) {
            return false;
        } else {
            if (banknote20 == 0) {
                text = text.replaceAll("20, ", "");
            } else {
                if ((input % 100 % 50 % 20) == 0) {
                    i++;
                }
            }
            if (banknote50 == 0) {
                text = text.replaceAll("50, ", "");
            } else {
                if ((input % 100 % 50) == 0) {
                    i++;
                }
            }
            if (banknote100 == 0) {
                text = text.replaceAll("100", "");
            } else {
                if (input % 100 == 0) {
                    i++;
                }
            }
            if (i != 0) {
                return true;
            } else {
                return false;
            }
        }
    }


    public boolean transaction(int input, int cashClient) {
        int cashBank = banknote100 * 100 + banknote50 * 50 + banknote20 * 20;
        if (cashClient >= input && input <= cashBank && (input % 100 % 50 % 20) == 0) {
            int temp;
            temp = (input - input % 100) / 100;
            if (temp - banknote100 <= 0) {
                input -= temp * 100;
                banknote100 = banknote100 - temp;
            } else {
                input -= banknote100 * 100;
                banknote100 = 0;
            }
            temp = (input - input % 50) / 50;
            if (temp - banknote50 <= 0) {
                input -= temp * 50;
                banknote50 = banknote50 - temp;
            } else {
                input -= banknote50 * 100;
                banknote50 = 0;
            }
            temp = input / 20;
            if (temp - banknote20 <= 0) {
                banknote20 = banknote20 - temp;
            } else {
                banknote20 = 0;
            }
            System.out.println("Операция проведена успешно: ");
            return true;
        }
        if ((input % 100 % 50 % 20) == 0 && input > cashBank) {
            System.out.println("Недостаточно средств");
        }
        if ((input % 100 % 50 % 20) == 0 && input > cashClient) {
            System.out.println("Недостаточно денег на счету");
        }
        return false;
    }
}

