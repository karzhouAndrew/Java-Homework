package homework.work3;

/*в задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер*/

public class Task12 {
    public static void main(String[] args) {
        int array[] = new int[20];
        int maxIndex = 0;
        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            System.out.print(array[i] + ", ");
        }
        int maxElem = array[0];
        System.out.println("  ");
        for (int i = 1; i < array.length; i++) {
            if (maxElem < array[i]) {
                maxElem = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальный индекс элемента: " + maxIndex);

    }
}
