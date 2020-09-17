package terminator;

import java.util.List;

public interface TerminatorI {

    List getRndAddress();
    String getMission(); //узнать миссию
    String getMissionTarget(); //узнать цель миссии
    void setTarget(String curTarget); //установить текущую цель
    String getTarget(); //узнать текущую цель
    void searchSarah();//посещает адреса из справочника в поисках Сары
    boolean killTarget(String target);//убивает цель - Сару
    String getModel(); //получить модель терминатора
    void teleport(); //телепортироваться
    String scan(); //способность сканировать объекты и выбирать из них подходящие для выполнения текущего задания
}
