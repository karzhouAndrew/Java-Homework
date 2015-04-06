package classwork.class2;

/**
 * Есть Класс куб.
 * Нужно найти:
 * 1) Площадь куба
 * 2) Объем куба
 * 3) Покрасить куб в определенный цвет
 * <p/>
 * Обязательное использование
 * Конструкторов с параметрами и без параметров.
 * Желательно чтобы все подсчеты делал отдельный класс.
 */
public class Kub {
    float a;
    String color;
    float square;
    float volume;

    public Kub() {
        a = 10;
        color = "Белый";
    }

    @Override
    public String toString() {
        return "Kub{" +
                "a=" + a +
                ", color='" + color + '\'' +
                ", square=" + square +
                ", volume=" + volume +
                '}';
    }
}
