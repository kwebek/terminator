package terminator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Terminator implements HumanI,TerminatorI {

    private final String MISSION = "Переместиться в Лос-Анджелес 1984 года. Найти и уничтожить Сару Коннор";
    private final String RAZMER = "XL"; //размеры терминатора :)
    private String destination = "неизвестно";
    private String curTarget;//текущая цель
    private String model;//модель терминатора

    //список адресов Сары Коннор из справочника, которые должен проверить терминатор
    List sarahAddress = new ArrayList();//список адресов Сары Коннор из справчника
    List rndAddrList = new ArrayList();//рандомный список адресов Сары Коннор

    public Terminator(String Tmodel){
        this.model = Tmodel;
    }

    @Override
    public List getRndAddress() {
        sarahAddress.add("LA, Elm Street, 3");
        sarahAddress.add("LA, Hackers Boulevard, 551");
        sarahAddress.add("LA, Melrose Avenue, 9021");
        sarahAddress.add("LA, Santa Monica Boulevard, 327");

        for (int i = 0; i < sarahAddress.size(); ) {
            int index = ThreadLocalRandom.current().nextInt(sarahAddress.size());

            if (rndAddrList.contains(sarahAddress.get(index))) {
                //do nothing
            } else {
                System.out.println(sarahAddress.get(index));
                rndAddrList.add(sarahAddress.get(index)); //добавляем адрес в список рандомных адресов
                i++;
            }


        }

        return rndAddrList;
    }



    @Override
    public String setName(String humanName) {
        return null;
    }

    @Override
    public void setTarget(String curTarg) {
        curTarget = curTarg;
    }

    @Override
    public String getTarget() {
        return curTarget;
    }

    @Override
    public void searchSarah() {

    }

    @Override
    public boolean killTarget(String target) {
        return false;
    }





    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getMission() {
        return MISSION;
    }

    @Override
    public String getMissionTarget() {
        return null;
    }


    @Override
    public void setDestination(String dest) {
        destination = dest;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public void walk(String destination) {
        System.out.println("Терминатор " + getModel() + " идет к " + destination);
           }

    @Override
    public void drive(String driveTo) {
        System.out.println("Терминатор " + getModel() + " едет к " + destination);
    }

    @Override
    public String scan() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Map<String, String> setItems(Map<String, String> sItems) {
        return null;
    }

    @Override
    public String getItems() {
        return null;
    }


    @Override
public void run(){
           System.out.println("Терминатор " + getModel() + "бежит к " + getDestination());
       }

    @Override
    public String getAnswer() {
        return null;
    }

    @Override
    public void talk(String words) {

    }

    public void talk() {

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
    public void useWeapon(String weapon) {

    }

    @Override
    public void reloadWeapon(String weapon) {

    }

    @Override
    public void teleport() {
        System.out.println("Терминатор " + model + " перемещается в " + getDestination());
    }
}
