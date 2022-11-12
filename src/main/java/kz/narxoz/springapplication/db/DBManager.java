package kz.narxoz.springapplication.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Items>items =new ArrayList<>();
    static{
        items.add(new Items(1L,"first",400));
    }
     public static ArrayList<Items> getItems(){
        return items;
     }




}
