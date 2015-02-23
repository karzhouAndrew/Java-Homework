public class stringAndStringBuilder {
    public static void main(String[] args) {
        String text = "Some text goes here^ ";
        for (int i = 0; i <= 50; i++) {
            text += " example \n";
        }
        System.out.println("text of String concotination = " + text);

        System.out.println();


        StringBuilder text1 = new StringBuilder("Some text goes here: ");
        for (int i = 0; i <= 500; i++) {
            text1.append("example \n");


        }
        System.out.println("text of String Buffer concotination = " + text1.toString());
    }
}
