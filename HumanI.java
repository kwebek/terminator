package terminator;

import java.util.Map;

public interface HumanI {

    String setName(String humanName);//дать имя человеку
    String getName(); //получить имя человека


    Map<String, String> setItems(Map<String, String> sItems); //дать человеку вещи
    String getItems(); //получить инфо об инвентаре человека
    void setDestination(String dest); //назначение целевой точки перемещения
    String getDestination(); //местоназначение
    void walk(String destination); //ходить куда то
    void drive(String driveTo); //ехать куда то
    void run(); //бегать
    String getAnswer();
    void talk(String words); //говорить
    void take(boolean take, String thing); //брать что либо
    void give(boolean give, String thing); //отдавать что либо
    void live(boolean live); //жить
    void useWeapon(String weapon); //использовать какое либо оружие
    void reloadWeapon(String weapon); //перезарядить какое либо оружие
}
