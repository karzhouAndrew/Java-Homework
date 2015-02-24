package classwork.class3;

import java.util.Vector;

/**
 * Created by Tonya on 21.02.2015.
 */
public class Task_blinou4 {
    public static void main(String[] args) {
        String str = "Как правило, дети относятся к отдыху иначе, чем их родители? Дети любят шуметь и веселиться, маме и папе хочется отдохнуть и расслабиться. Но есть главное желание, самое важное для ребят – чтобы всё было «по-взрослому». Вы хотите, чтобы отдых для ребёнка прошёл с максимальной отдачей? Детская дискотека в акватории – это замечательная возможность исполнить их желание! Развлекать деток будет аниматор, который будет также учить их различным танцевальным движениям!";
        str = str.replaceAll("[?] +","?\n");//ищем вопросительные предложения
        str = str.replaceAll("[.!] +","\n");//ищем все остальные
        String[] arr = str.split("\n");//разбиваем на предложения
        String[][] word = new String[arr.length][];
        int [] cntr = new int[arr.length];//счетчик совпадений слов
        int lenth = 5;
        for (int i = 0; i<arr.length; i++){
            word[i] = arr[i].split("[ ,–«»?]+");//каждое предложение разбиваем на слова
        }

        for (int i = 0; i<arr.length;i++){//
            if (arr[i].charAt(arr[i].length()-1) == '?'){
                boolean[] compare = new boolean[word[0].length];
                System.out.println(arr[i]);
                for (int k = 0; k<word[i].length; k++) {//бежим по словам в предложении
                    if (word[i][k].isEmpty())continue;//защита от пустых ячеек
                    for (int j = 0; j < arr.length; j++) {//берем предложение, с которым будем сравнивать
                        if (i == j||arr[j].charAt(arr[j].length()-1) != '?') continue;//пропускаем одинаковые и не вопросительные предложения
                        for (int m = 0; m<word[j].length;m++){//бежим по словам в предложении
                            if (word[i][k].compareToIgnoreCase(word[j][m]) != 0 && word[i][k].length() == lenth) {
                                compare[k] = true;
                                //System.out.println(word[i][k]+"="+word[j][m]);
                            }
                        }
                    }
                    if (compare[k] == true&&word[i][k].length() == lenth){
                        System.out.println("\""+word[i][k]+"\"");
                    }
                }
            }
        }
    }
}
