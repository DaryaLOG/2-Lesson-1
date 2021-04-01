package Lesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneList {
    HashMap<Integer, String> phoneList = new HashMap<>();

    public void add(int phone, String name) {
        phoneList.put(phone, name);
    }
    public String get(int phone) {
        return phoneList.get(phone);
    }
    public ArrayList<Integer> get(String name) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer key : phoneList.keySet()) {
            if (name == phoneList.get(key)) {
                arrayList.add(key);
            }
        }
        return arrayList;
    }
}
