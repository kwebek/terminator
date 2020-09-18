package terminator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Human implements HumanI {

    private String name; //имя человека
    private String size; //размер одежды
    private String item; //вещь или оружие
    private static int qtyNames; //кол-во имен для списка байкеров
    private String answer; //ответ человека или робота на требование или вопрос
    private boolean live = true;
    private String destination;


    static List namesList = new ArrayList();//список имен
    static List sizesList = new ArrayList();//список размеров одежды
    List<Human> bikersList = new ArrayList();//список байкеров

    List itemsList = new ArrayList();//список вещей

    public List addNames() { //создаем список имен для байкеров
        //наполняем список с именами
        namesList.add("Bill");
        namesList.add("Jhon");
        namesList.add("Nathan");

        return namesList;
    }

    public List addSizes() { //наполняем список размеров одежды

        sizesList.add("L");
        sizesList.add("S");
        sizesList.add("XL");

        return sizesList;
    }
    public List addItems() {
        //наполняем список вещей
        itemsList.add("Beer");
        itemsList.add("Cards");
        itemsList.add("Shotgun");

        return itemsList;
    }



    public int getQtyNames(){
        qtyNames = namesList.size();

        System.out.println("Кол-во имен\n" + qtyNames);
        return qtyNames;
    }

public List createBikersList() {

    for (int i = 0; i < 3; i++) { //создаем ,байкеров в цикле и помещаем их в список
        String name = (String) namesList.get(i);//кастуем элемент массива в строковую переменую
        String size = (String) sizesList.get(i);//кастуем элемент массива в строковую переменую
        String item = (String) itemsList.get(i);//кастуем элемент массива в строковую переменую
        Human biker = new Human(name, size, item);
        //System.out.println("\nИмя байкера: " + biker.getName() + "\nРазмер одежды: " + biker.getSize() + "\nВещь: " +biker.getItem());
        bikersList.add(biker);
    }
    
    return bikersList;}



    //выводим имена, размеры и вещи байкеров. Способ № 1
        for(int i=0; i<bikersList.size();i++){
        System.out.println("------------------------------");
        Human tempBiker = bikersList.get(i);
        System.out.println("Имя: " + tempBiker.getName());
        System.out.println("Размер: " + tempBiker.getSize());
        System.out.println("Вещь: " + tempBiker.getItem());

        if (i >=(namesList.size()-1)){
            System.out.println("------------------------------");}
    }

    //конструктор человека. В параметрах подставляем имя, размер одежды и вещь
    public Human(String name,String size, String item) {
        this.name = name;
        this.size = size;
        this.item = item;
    }


    @Override
    public String setName(String humanName) {
        name = humanName;
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getSize() { return size; }
    public String getItem() { return item; }

    @Override
    public Map<String, String> setItems(Map<String, String> sItems) {
        return null;
    }


    @Override
    public String getItems() {
        return item;
    }


    @Override
    public void setDestination(String dest) {
        destination = dest;
    }

    @Override
    public void run() {
    }

    @Override
    public String getDestination() {
        return destination;
    }


    @Override
    public void drive(String driveTo) {

    }


    @Override
    public void reloadWeapon(String weapon) {

    }

    @Override
    public void useWeapon(String weapon) {

    }

    @Override
    public void talk(String words) {
    answer = words;
    }

    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public void take(boolean take, String thing) {

    }

    @Override
    public void give(boolean give, String thing) {

    }

    @Override
    public void live(boolean live) {

    }

    @Override
    public void walk(String destination) {

    }
}
