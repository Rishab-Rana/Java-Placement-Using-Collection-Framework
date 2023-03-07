import java.util.ArrayList;
import java.util.Collections;

class HelloWorld {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<> ();
        // adding element into the list
        list.add(10);
        list.add(20);
        list.add(30);
        
        System.out.println(list);
        
        // getting element from the list
        
        int y = list.get(0);
        System.out.println(y);
        
        // removig list form the list
        list.remove(1);
        System.out.println(list);
        
        //  adding element in between of the list
        
        list.add(1,50);
        System.out.println(list);
        
        list.add(1,60);
        System.out.println(list);
        
        // setting the element
        
        list.set(1,20);
        System.out.println(list);
        
        System.out.println(list.size());
        
        
        // iterating the array list 
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        
        // sorting the array list
        
        Collections.sort(list);
        System.out.println(list);
    }
}