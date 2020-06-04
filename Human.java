package terminator;

import java.util.Map;

public class Human implements HumanI {

    private String name; //имя человека
    private String size; //размер одежды
    private String item; //вещь или оружие
    private String answer;
    private boolean live = true;
    private String destination;
    //мэп, описывающий название вещи или ее: характеристики, названия, размеры

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
