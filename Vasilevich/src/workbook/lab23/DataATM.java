package workbook.lab23;

/**
 * Created by vasilevich on 23.02.2015.
 */
public class DataATM {
    private NotesCount notesCount;

    public DataATM() {
        notesCount = new NotesCount();
    }

    public DataATM(int bill20, int bill50, int bill100) {
        notesCount = new NotesCount(bill20, bill50, bill100);
    }

    public int getAllSumATM() {
        return (notesCount.getSum());
    }

    public boolean addNotes(int bill20, int bill50, int bill100) {
        if ((bill20 >= 0) && (bill50 >= 0) && (bill100 >= 0)) {
            this.notesCount.addBill20(bill20);
            this.notesCount.addBill50(bill50);
            this.notesCount.addBill100(bill100);
            return true;
        } else {
            System.out.println("Количество добавляемых купюр невалидно!");
            return false;
        }
    }

    public boolean recieveSum(int sum) {
        if (!notesCount.checkNotesCountWithSum(sum)) {
            System.out.println("Запрашиваемая сумма " + sum + " превышает наличность в АТМ");
            return false;
        } else {
            NotesCount notes = getNotesCountsForSum(sum);
            if (notes == null) {
                System.out.println("Запрошенная сумма не может быть обеспечена наличным номиналом банкомата");
                return false;
            } else {
                notesCount.subBill20(notes.getBill20());
                notesCount.subBill50(notes.getBill50());
                notesCount.subBill100(notes.getBill100());
                System.out.println("Была выдана сумма " + sum + " купюрами: 20(" + notes.getBill20() + "), 50(" + notes.getBill50() + "), 100(" + notes.getBill100() + ")");
                return true;
            }
        }
    }

    // стандартный алгоритм получения денег из банкомата, т.е. сначала набиваем сумму 100, потом 50, потом 20.
    private NotesCount getNotesCountForSumSimpleAlgorithm(int sum, NotesCount tmpNotesCount) {

        int tmpSum = sum;
        // проверяем возможность набрать сумму сотнями
        if (notesCount.getBill100() >= (tmpSum / 100)) {  //если купюр хватает, то берем столько сколько надо
            tmpNotesCount.addBill100(tmpSum / 100);
            tmpSum -= tmpSum / 100 * 100;
        } else {
            // если купюр не хватает, то забираем все что есть
            tmpNotesCount.setBill100(notesCount.getBill100());
            tmpSum -= tmpNotesCount.getBill100() * 100;
        }
        // проверяем возможность набрать сумму пятидесятками
        if (notesCount.getBill50() >= (tmpSum / 50)) { //если купюр хватает, то берем столько сколько надо
            tmpNotesCount.addBill50(tmpSum / 50);
            tmpSum -= tmpSum / 50 * 50;
        } else {
            // если купюр не хватает, то забираем все что есть
            tmpNotesCount.setBill50(notesCount.getBill50());
            tmpSum -= tmpNotesCount.getBill50() * 50;
        }
        // проверяем возможность набрать сумму двадцатками. Будем пытаться собрать оставшуюся сумму ими
        if (notesCount.getBill20() >= (tmpSum / 20)) {
            tmpNotesCount.addBill20(tmpSum / 20);
            tmpSum -= tmpSum / 20 * 20;
            if (tmpSum == 0) {
                return tmpNotesCount;
            }
        }
        //возвращаем набранный набор купюр, который удалось собрать. Проверка будет позже
        return tmpNotesCount;
    }

    private boolean checkSumToUnusualValue(int sum) {
        return ((sum % 20 == 0) || (sum > 50)) && (sum % 100 != 0) && (sum % 100 != 50) && (sum != 0);
    }

    private NotesCount getNotesCountsForSum(int sum) {
        int tmpSum = sum;
        if (tmpSum % 10 != 0) {
            return null;
        }

        NotesCount tmpNotesCount = new NotesCount();
        // проверка нестандартной суммы, которую можно сформировать двадцатками, и ее начальное формирование.
        // Т.е. например 130 = 20 + 20 + 20 + 20 + 50. Получить обычным алгоритмом уменьшения ее не получится
        while (checkSumToUnusualValue(tmpSum)) {
            tmpNotesCount.addBill20(1);
            tmpSum -= 20;
            // проверка, не изъята ли вся наличность двадцаток
            if (tmpNotesCount.getBill20() >= notesCount.getBill20()) {
                break;
            }
        }
        // убираем набранную сумму двадцаток из общего хранилища, что бы она больше не учавствовала в будущих расчетах
        int tmpBill20 = tmpNotesCount.getBill20();
        notesCount.subBill20(tmpBill20);
        // стандартный алгоритм получения денег из банкомата, т.е. сначала набиваем сумму 100, потом 50, потом 20.
        tmpNotesCount = getNotesCountForSumSimpleAlgorithm(tmpSum, tmpNotesCount);
        // возвращаем сумму двадцаток назад
        notesCount.addBill20(tmpBill20);
        if (tmpNotesCount != null) {
            // если окончательная сумма не сходится, значит не удалось ее собрать
            if (sum != tmpNotesCount.getSum()) {
                return null;
            }
        }
        return tmpNotesCount;
    }
}
