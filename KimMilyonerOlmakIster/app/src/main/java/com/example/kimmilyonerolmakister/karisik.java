package com.example.kimmilyonerolmakister;

import java.util.ArrayList;
import java.util.Random;

public class karisik {
    int k;
    ArrayList<Integer> karisikDizi=new ArrayList<Integer>();
    ArrayList<Integer> karisik2=new ArrayList<Integer>();
    public ArrayList<Integer> karistir(){
        for(int i=0;i<45;i++){
            karisik2.add(i);
        }
        for (int i=0;i<45;i++){
            Random r=new Random();
            k=r.nextInt(karisik2.size());
            karisikDizi.add(karisik2.get(k));
            karisik2.remove(k);
        }
        return karisikDizi;
    }
}
