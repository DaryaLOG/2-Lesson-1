package Lesson3;

import java.util.ArrayList;

public class Box<T> implements Comparable<Box> {
    private ArrayList<T> arrayList;

    public Box(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

//    public void add(ArrayList<T> array){
//        this.arrayList = array;
//    }

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }
    public double getWeight(){
        double weight = 0;
        for (T t: arrayList) {
            weight += ((Fruit)t).getWeight();
        }
        return weight;
    }

    @Override
    public int compareTo(Box o) {
        return (int)(getWeight()-o.getWeight());
    }
    public void pourover(Box box){
        //arrayList.add((T)box.getArrayList().clone());
        //box.arrayList.clear();
        ArrayList<T> arr = box.getArrayList();
        for (T t: arr) {
            arrayList.add(t);
        }
        box.arrayList.clear();
    }

    public void addFruit(T t){
        arrayList.add(t);
    }
}
