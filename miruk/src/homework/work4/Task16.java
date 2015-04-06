package homework.work4;

/*найти в строке не только запятые, но и др знаки препинания. посчитать их общее кол-во*/

public class Task16 {
    public static void main(String[] args) {
        System.out.println("Исследуемая строка:");
        String str = "Суть проекта “Центр славянских языков и культур” – собрать под свои знамена молодых и креативных преподавателей с новым подходом к образованию. У нас работают люди, на занятия к которым вы будете приходить с большой радостью и желанием учиться. Мы умеем сочетать позитив и хорошее настроение с эффективной подачей знаний. Так что не удивляйтесь, если в один прекрасный день вам вручат какой-либо музыкальный инструмент и превратят группу в настоящий оркестр, а в другой раз придется блеснуть знаниями языка во время игры “Крокодил” или “Мафия”.";
        System.out.println(str);
        System.out.println();
        int dot = 0, comma = 0, exclamation = 0, question = 0, colon = 0, dash = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '.') {
                dot++;
            } else if (ch == ',') {
                comma++;
            } else if (ch == '-') {
                dash++;
            } else if (ch == '!') {
                exclamation++;
            } else if (ch == '?') {
                question++;
            } else if (ch == ':') {
                colon++;
            }
        }
        System.out.println("В это строке: '.' - " + dot + ", ',' - "
                + comma + ", '!' - " + exclamation + ", '?' - " + question + ", ':' - " + colon + ", ' - ' - " + dash);
    }
}
