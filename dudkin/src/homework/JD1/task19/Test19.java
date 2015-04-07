package homework.JD1.task19;

public class Test19 {
    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder();
        String[] str = new String[5];
        str[0] = "Привет привет ";
        str[1] = "Привет и  привет ";
        str[2] = "Привет снова привет ";
        str[3] = "Привет ";
        str[4] = "Привет 123 ";

        String line = "";
        for (int i = 0; i < str.length; i++) {
            line = line + str[i];
            System.out.println(line);
        }
        /*for (int i = 0; i < str.length; i++) {
            strBuilder.append(str[i]);
        }
        System.out.println(strBuilder.toString());*/
        long time = System.nanoTime();
        System.out.println(time);
    }


}
