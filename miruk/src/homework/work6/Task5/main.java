package homework.work6.Task5;

/**
 * Создать иерархию классов, описывающих бытовую технику. Создать несколько объектов описанных классов, часть из них включить в розетку.
 Иерархия должна иметь хотя бы три уровня.

 */
public  class main {
    public static void main(String[] args) {
        Radio tv = new Radio(10,1,100,true);
        Radio radio = new Radio(5,3,20,false);
        tv.setEnable(false);
        tv.setProgram(3);
        tv.setVolume(tv.getVolume()-3);
        tv.setEnable(true);
        radio.setEnable(true);
    }
}