package ru.geekbrains.ntr_ads02;

import ru.geekbrains.ntr_ads02.arrayscollection.*;


public class Main {

    public static final int ARRAY_SIZE = 100_000;

    public static void main(String[] args) {

        Array<Float> testArray1 = fillArray(ARRAY_SIZE);
        Array<Float> testArray2 = fillArray(ARRAY_SIZE);
        Array<Float> testArray3 = fillArray(ARRAY_SIZE);

        Timer.start();
        testArray1.sortBubble();
        Timer.stop();
        System.out.printf("Сортировка методом пузырька. Время выполнения: %.3f с\n", Timer.getTimeInS());

        Timer.start();
        testArray2.sortSelect();
        Timer.stop();
        System.out.printf("Сортировка выбором. Время выполнения: %.3f c\n", Timer.getTimeInS());


        Timer.start();
        testArray3.sortInsert();
        Timer.stop();
        System.out.printf("Сортировка вставками. Время выполнения: %.3f c\n", Timer.getTimeInS());

        if (testArray1.equals(testArray2) && testArray2.equals(testArray3)){
            System.out.println("Массивы после сортировки идентичны.");
        } else {
            System.out.println("Массивы после сортировки НЕ идентичны.");
        }
    }

    private static ArrayImpl<Float> fillArray(int size) {
        ArrayImpl<Float> arr = new ArrayImpl<>(size);
        for (int i = 0; i < size; i++) {
            arr.add((float) (32 * Math.sin(-2 * i) + 13 * Math.cos(1.5f * i)));
        }
        return arr;
    }
}
