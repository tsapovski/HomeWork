package com.overone.blok12Collections.lesson63_67;
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<HeavyBox> list = new ArrayList<>();
        HeavyBox box = new HeavyBox(10);
        HeavyBox box1 = new HeavyBox(11);
        HeavyBox box2 = new HeavyBox(12);
        HeavyBox box3 = new HeavyBox(300);
        HeavyBox box4 = new HeavyBox(14);
        list.add(box);
        list.add(box1);
        list.add(box2);
        list.add(box3);
        list.add(box4);

        determineWeight(list);

    }
    public static void determineWeight(ArrayList<HeavyBox> list){
        ArrayList<HeavyBox>arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getWeight() == 300){
                arrayList.add(list.get(i));
                list.remove(list.get(i));
            }
        }

    }

}
