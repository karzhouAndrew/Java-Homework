/**
 * Created by Рома on 17.02.2015.
 */
public class replaceFirstTesting {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Here is some text behind. I'll try to do my best in Java learning now, and in programming in future.");
       text = text.reverse();

        System.out.println(text); // Cool :-D
        
        String str = "Here is some text behind. I'll try to do my best in Java learning now, and in programming in future.";
        str=str.replaceFirst(" +", "__");
        String str1 = str.replaceAll(" +","__");

        System.out.println("str.replaceFirst = " + str);
        System.out.println("str1.replaceAll = " + str1);

        
        

    }
}
