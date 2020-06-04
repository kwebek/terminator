/**
 Program: "T800 in action", based on movie "TERMINATOR-2" 1991
 @Version: 0.1.1
 @Author: Alexander Machnev
 *
 */
package terminator;
import org.w3c.dom.ls.LSOutput;

import javax.management.StringValueExp;
import javax.swing.text.Element;
import java.lang.reflect.Array;
import java.util.*;

public class Terminator1991 {


    public static void main(String[] args) throws InterruptedException, IndexOutOfBoundsException {
        String curTarget = "nobody";
        List <Human> bikersList = new ArrayList();//список байкеров
        List namesList = new ArrayList();//список имен
        List sizesList = new ArrayList();//список размеров одежды
        List itemsList = new ArrayList();//список вещей

        Map <String, String> bikersInfo = new HashMap<>();//список вещей и характеристик байкеров

        // ---- закидываем вещи, имена и размеры байкеров ----

        //наполняем список с именами
        namesList.add("Bill");
        namesList.add("Jhon");
        namesList.add("Nathan");

        //наполняем список размеров одежды
        sizesList.add("L");
        sizesList.add("S");
        sizesList.add("XL");

        //наполняем список вещей
        itemsList.add("Beer");
        itemsList.add("Cards");
        itemsList.add("Shotgun");

        for (int i=0;i<3;i++){ //создаем ,байкеров в цикле и помещаем их в список
            String name = (String) namesList.get(i);//кастуем элемент массива в строковую переменую
            String size = (String) sizesList.get(i);//кастуем элемент массива в строковую переменую
            String item = (String) itemsList.get(i);//кастуем элемент массива в строковую переменую
            Human biker = new Human(name,size,item);
            //System.out.println("\nИмя байкера: " + biker.getName() + "\nРазмер одежды: " + biker.getSize() + "\nВещь: " +biker.getItem());
            bikersList.add(biker);
        }

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

        /* //выводим только имена. Способ № 2
        namesList.forEach((El)->{
            System.out.println(El);//вывод только имени
            });*/

        Terminator terminator = new Terminator("T-800");//создаем терминатора T-800
        Human sarah = new Human("Sarah Connor", "M", "Desert Eagle");//создаем человека Sarah Connor


        System.out.println("\n" + terminator.getModel() + " получил задание: \"" + terminator.getMission());
        Thread.sleep(2000);
        terminator.setDestination("Лос-Анджелес 1984 года");

        System.out.println("\n" + terminator.getModel() + " установил местоназначение для перемещения на \"" + terminator.getDestination() + "\"");
        System.out.println("                    ↓");
        Thread.sleep(1500);

        terminator.teleport();
        System.out.println("                    ↓");
        Thread.sleep(1500);

        System.out.println("Терминатор " + terminator.getModel() + " осмотрелся и увидел рядом бар, где шумели люди. \nВозможно там есть человек с подходящей одеждой и транспортом");
        System.out.println("                    ↓");
        Thread.sleep(1500);

        terminator.walk(" ближайшему бару"); //терминатор идет к ближайшему бару
        System.out.println("                    ↓");
        Thread.sleep(1500);

        System.out.println("Терминатор " + terminator.getModel() + " сканирует байкеров на предмет \nподходящей для него одежды");
        terminator.scan(); //сканирует байкеров на размер одежды и наличие оружия
        terminator.setTarget(curTarget); //установить текущую цель (нужного байкера)
        System.out.println("                    ↓");
        Thread.sleep(1500);

        System.out.println("Терминатор идет к байкеру");
        System.out.println("                    ↓");
        terminator.walk(terminator.getTarget()); //терминатор идет к подходящему байкеру
        Thread.sleep(1500);

        System.out.println("Терминатор просит у байкера его одежду");
        terminator.talk(); //терминатор просит байкера отдать ему одежду и шотган
        System.out.println("                    ↓");
        Thread.sleep(1500);

        terminator.walk("выходу из бара"); //терминатор выходит из бара
        System.out.println("                    ↓");
        Thread.sleep(1500);

        terminator.walk("мотоциклу"); //терминатор идет к мотоциклу
        System.out.println("                    ↓");
        Thread.sleep(1500);

        terminator.drive("ближайшей телефонной будке"); //терминатор едет к ближайшей телефонной будке
        System.out.println("                    ↓");
        Thread.sleep(1500);

        System.out.println("Терминатор находит в будке телефонный справочник");
        System.out.println("                    ↓");
        Thread.sleep(1500);

        System.out.println("Терминатор нашел в справочнике список адресов Сары Коннор");
        terminator.getRndAddress();//выводим рандомный список адресов Сары Коннор
        System.out.println("                    ↓");
        Thread.sleep(1500);

        System.out.println("Терминатор посещает адреса и ищет там Сару");
        terminator.searchSarah();//ищем Сару Коннор
        System.out.println("                    ↓");
        Thread.sleep(1500);

        System.out.println("Терминатор ликвидирует цель - Сару Коннор");
        terminator.killTarget(terminator.getTarget());//ликвидация цели
        System.out.println("                    ↓");
        Thread.sleep(1500);

        terminator.setDestination("Назад в будущее");
        terminator.teleport();
        System.out.println("                    ↓");
        System.out.println("-------------КОНЕЦ-------------");

    }



}

