package lr11.RIV_120906y_LR11.ex7;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

//В кругу стоят N человек, пронумерованных от 1 до N. При ведении счета по кругу вычеркивается каждый второй человек,
//пока не останется один. Составить две программы, моделирующие процесс. Одна из программ должна использовать класс ArrayList,
//а вторая — LinkedList.

public class ArrayListExample {
    public static void main(String[] args) {
        Date currentTime = new Date();

        Random random = new Random();
        int N = random.nextInt(2, 20);
        System.out.println("Количество элементов: " + N + " (от 0 до " + (N-1) + ")");

        ArrayList<Integer> circle = new ArrayList<>();
        for(int i=0; i<N; i++) circle.add(i);

        System.out.println("Вычёркиваем каждого второго по кругу, пока не останется один:");

        int counter = 0;
        while(circle.size() > 1){
            for(int i=0;i< circle.size();i++){
                counter++;
                if(counter == 2){
                    System.out.println(circle.get(i) + " ("+counter+") - вычеркнут");
                    circle.remove(i);
                    i--;
                    counter = 0;
                }else {
                    System.out.println(circle.get(i) + " (" + counter + ")");
                }
            }
            System.out.println();
        }

        System.out.println("Оставшийся элемент: " + circle.get(0));

        System.out.println();
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Результат в миллисекундах: " + msDelay);
    }



}