package classwork.class3;

public class Task_blinou {
    public static void main(String[] args) {
        String str = "Как правило, дети относятся к отдыху иначе, чем их родители. Дети любят шуметь и веселиться, маме и папе хочется отдохнуть и расслабиться. Но есть главное желание, самое важное для ребят – чтобы всё было «по-взрослому». Вы хотите, чтобы отдых для ребёнка прошёл с максимальной отдачей? Детская дискотека в акватории – это замечательная возможность исполнить их желание! Развлекать деток будет аниматор, который будет также учить их различным танцевальным движениям!";
        String[] arr = str.split("[.!?] +");//разбиваем на предложения
        String[][] word = new String[arr.length][];
        int [] cntr = new int[arr.length];//счетчик совпадений слов
        for (int i = 0; i<arr.length;i++){//
            word[i] = arr[i].split("[ ,–«»]+");//каждое предложение разбиваем на слова
            for (int j = 0; j<word[i].length; j++){
                System.out.print(word[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i<word.length;i++){//бежим по массиву предложений
            for (int k = 0; k<word[i].length; k++) {//бежим по словам в предложении
                if (word[i][k].isEmpty())continue;//защита от пустых ячеек
                for (int j = 0; j < word.length; j++) {//берем предложение, с которым будем сравнивать
                    if (i == j) continue;//пропускаем одинаковые предложения
                    for (int m = 0; m<word[j].length;m++){//бежим по словам в предложении
                        if (word[i][k].compareToIgnoreCase(word[j][m]) == 0) {
                            //System.out.println(word[i][k]+"="+word[j][m]);
                            cntr[i]++;
                        }
                    }
                }
            }
        }
        for(int i = 1; i < cntr.length; i++) {
            for (int j = cntr.length - 1; j >= i; j--) {
                if (cntr[j - 1] > cntr[j]) {
                    int tmp = cntr[j - 1];
                    cntr[j - 1] = cntr[j];
                    cntr[j] = tmp;
                    String temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = arr.length-1; i>=0; i--){
            System.out.println("Совпадений "+cntr[i]+". Текст предложения: \"" +arr[i]+"\"");
        }
    }
}
