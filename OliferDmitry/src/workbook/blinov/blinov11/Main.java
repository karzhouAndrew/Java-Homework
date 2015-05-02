// V kajdom predlojenii texta iskluchit' podstroku max dliny, nachinauschuusia i zakanchivauschuusia zadannymi simvolami
package workbook.blinov.blinov11;

import static workbook.blinov.blinovStringMethods.StringMethods.*;

public class Main {
    public static void main(String[] args) {
        char beginCh = 'а', endCh = 'о';
        String text = "Прокопович также напомнил о необходимости снизить зависимость от импорта. \"При нормальной работе" +
                      " мы импорт можем сократить практически в полтора раза! Потребительский импорт может быть не более 15-20%" +
                      " от потребления!!! Все остальное мы можем делать сами, а в прошлом году увеличили импорт почти на миллиард." +
                      " Значит, работу мы проводим недостаточную? Этот вопрос остается одним из ключевых\", - уверен он.";

        String[] sentences = stringToSentences(text);

        for (int i = 0; i < sentences.length; i++) {
            int beginInd = sentences[i].indexOf(beginCh);
            int endInd = sentences[i].lastIndexOf((int)endCh);
            if (beginInd > 0 && endInd > 0) {
                sentences[i] = sentences[i].substring(0, beginInd) + "[...]" + sentences[i].substring(endInd + 1);
            }
            System.out.println(sentences[i]+".");
        }
    }
}
