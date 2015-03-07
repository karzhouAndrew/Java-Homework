package training.methodsOverloading;

public class OverloadMethods {

    public  void  overloadDemo (){
        System.out.println("Вызов метода без параметров");
    }

    public void  overloadDemo (int a){
        System.out.println("Перегрузка метода с параметром  int a=" + a);
    }

    public void overloadDemo (int a, String str){
        System.out.println("Перегрузка метода с параметрами int a=" + a + " и входным строковым параметром str=" + str);
    }
}
