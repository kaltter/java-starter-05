package hw.hwBasic4Hw3;

/**
 * Created by User on 30.05.2016.
 */
//Создайте 2 интерфейса Playable и Recodable. В каждом из интерфейсов создайте по 3 метода void play() / void pause() / void stop() и void record() / void pause() / void stop() соответственно.
//        Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
//        Написать программу, которая выполняет проигрывание и запись.

public interface Playable {
    void play();

    void pause();

    void stop();
}
