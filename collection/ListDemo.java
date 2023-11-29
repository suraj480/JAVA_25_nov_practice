package collection;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String args[]) {
    ArrayList<String> list=new ArrayList<String>();
    list.add("suraj");  
    list.add("raw");
    list.add("sam");
    list.add("max");
    list.add("pax");
    list.add("jon");
    System.out.println("list details"+list);
    //new for loop
    for(String name: list) {   
    System.out.println("name is: "+name);
    } //old for loop
    
    for(int i=0;i<list.size();i++) {
    System.out.println("NAME IS: "+list.get(1));
    }
    
   System.out.println("is empty : "+list.isEmpty()); System.out.println("is empty : "+list.size());    
}
}
