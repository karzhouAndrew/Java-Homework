package workbook;

/**
 * Created by Asus on 27.02.2015.
 */
public class Descripsion {
    private String s;
    Descripsion(String s){
        this.s = s;
        System.out.println("Создаем Descripsion " + s);
    }
    protected void dispose(){
        System.out.println("Завершаем Descripsion " + s);
    }
}
