package workbook.lab25;

/**
 * Created by vasilevich on 03.03.2015.
 */
public class CardProcess {

    private double moneyAtCard;
    private boolean isLoginNow;

    public boolean putMoneyToCard(double money) {
        if (isLoginNow) {
            if (money > 0) {
                moneyAtCard += money;
                return true;
            }
        }
        return false;
    }

    public boolean getMoney(double money) {
        if (isLoginNow) {
            if ((money > 0) && (money < moneyAtCard)) {
                moneyAtCard -= money;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public boolean loginCard(short pinCode1ForCompare, short pinCode2ForCompare) {
        if (pinCode1ForCompare == pinCode2ForCompare) {
            isLoginNow = true;
        } else {
            isLoginNow = false;
        }
        return isLoginNow;
    }

    public boolean logoffCard() {
        isLoginNow = false;
        return true;
    }


    public double showSumMoneyAtCard() {
        if (isLoginNow) {
            return moneyAtCard;
        } else {
            System.out.println("Card didn''t login");
            return -1;
        }


    }

}
