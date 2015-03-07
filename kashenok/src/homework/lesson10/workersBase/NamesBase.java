package homework.lesson10.workersBase;


import java.util.Random;

class NamesBase {

    String[] names = {"Кирилл", "Андрей", "Роман", "Вадим", "Максим", "Александр", "Павел", "Валерий", "Ольга", "Людмила", "Владимир"};
    String[] surnames = {"Андреич", "Валерич", "Кириллыч", "Саныч", "Вячславыч", "Олегыч", "Палыч", "РОманыч", "Дмитрич"};
    String[] usingTechnology = {"Java", "C", "C++", "PHP", "Python", "Java Script"};

    Random rand = new Random();
    int i;

    public  String nameGenerator() {

        i = rand.nextInt(names.length - 1) + 1;
        String name1 = names[i];
        return name1;
    }

    public  String surNameGenerator() {
        Random rand = new Random();
        int i;
        i = rand.nextInt(surnames.length - 1) + 1;
        String name1 = surnames[i];
        return name1;
    }

    public  String usingTechnologyGEnerator() {
        Random rand = new Random();
        int i;
        i=rand.nextInt(usingTechnology.length-1)+1;
        return usingTechnology[i];
    }

}
