package com.overone.blok12.lesson63_67;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<HeavyBox> arrayList = new ArrayList<>();
        HeavyBox box = new HeavyBox(10);
        HeavyBox box1 = new HeavyBox(11);
        HeavyBox box2 = new HeavyBox(12);
        HeavyBox box3 = new HeavyBox(13);
        HeavyBox box4 = new HeavyBox(14);
        arrayList.add(box);
        arrayList.add(box1);
        arrayList.add(box2);
        arrayList.add(box3);
        arrayList.add(box4);


        for (HeavyBox b : arrayList) {
            System.out.println(b.toString());
        }
        box.setWeight(box.getWeight()+1);
        arrayList.set(0,box);

        arrayList.remove(arrayList.size()-1);

        /* Первый способ*/

        HeavyBox[] firstWay = arrayList.toArray(new HeavyBox[0]);

        for (HeavyBox b : firstWay) {
            System.out.println(b.toString());
        }

        /* Второй способ*/
        HeavyBox[] secondWay = new HeavyBox [arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            secondWay[i] = arrayList.get(i);
        }

        for (HeavyBox b : secondWay) {
            System.out.println(b.toString());
        }

        /* Третий способ*/
        HeavyBox[] thirdWay = arrayList.stream().toArray(HeavyBox[]::new);
        for (HeavyBox b : thirdWay) {
            System.out.println(b.toString());
        }


        arrayList.clear();

        for (int i = 0; i < firstWay.length; i++) {
            firstWay[i] = null;
        }

        for (int i = 0; i < secondWay.length; i++) {
            secondWay[i] = null;
        }

        for (int i = 0; i < thirdWay.length; i++) {
            thirdWay[i] = null;
        }


    }

}

