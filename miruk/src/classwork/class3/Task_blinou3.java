package classwork.class3;

/**
 * Created by Tonya on 21.02.2015.
 */
public class Task_blinou3 {
    public static void main(String[] args) {
        String str = "Как правило, дети относятся к отдыху иначе, чем их родители. Дети любят шуметь и веселиться, маме и папе хочется отдохнуть и расслабиться. Но есть главное желание, самое важное для ребят – чтобы всё было «по-взрослому». Вы хотите, чтобы отдых для ребёнка прошёл с максимальной отдачей? Детская дискотека в акватории – это замечательная возможность исполнить их желание! Развлекать деток будет аниматор, который будет также учить их различным танцевальным движениям!";
        String[] arr = str.split("[.!?]");//разбиваем на предложения
        String[][] word = new String[arr.length][];

        for (int i = 0; i<arr.length;i++){//
            word[i] = arr[i].split("[ ,–«»]+");//каждое предложение разбиваем на слова
        }
        boolean[] compare = new boolean[word[0].length];
        for (int i = 0; i<1;i++){//бежим по массиву предложений
            for (int k = 0; k<word[i].length; k++) {//бежим по словам в предложении
                if (word[i][k].isEmpty())continue;//защита от пустых ячеек
                for (int j = 0; j < word.length; j++) {//берем предложение, с которым будем сравнивать
                    if (i == j) continue;//пропускаем одинаковые предложения
                    for (int m = 0; m<word[j].length;m++){//бежим по словам в предложении
                        if (word[i][k].compareToIgnoreCase(word[j][m]) == 0) {
                            compare[k] = true;
                        }
                    }
                }
                if (compare[k] == false){
                    System.out.println("Этого слова нет ни в одном другом предложении: \""+word[i][k]+"\"");
                }
            }
        }
    }
}
