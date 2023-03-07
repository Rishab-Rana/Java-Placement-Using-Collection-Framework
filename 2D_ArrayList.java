import java.util.ArrayList;
class HelloWorld {
    public static void main(String[] args) {
        ArrayList<String> bakeryList = new ArrayList<> ();
        bakeryList.add("Apple");
        bakeryList.add("mango");
        bakeryList.add("tomato");
        bakeryList.add("potato");
        
        ArrayList<String> drinksList = new ArrayList<> ();
        drinksList.add("coca-cola");
        drinksList.add("Fanta");
        drinksList.add("mazza");
        
         ArrayList<String> chipsList = new ArrayList<> ();
        chipsList.add("Lays");
        chipsList.add("kurkure");
        chipsList.add("popcorn");
        
        ArrayList<ArrayList<String>> tow_D_list = new ArrayList<> ();
        tow_D_list.add(bakeryList);
        tow_D_list.add(drinksList);
        tow_D_list.add(chipsList);
        
        System.out.println(tow_D_list);
        
        System.out.println("size of array is " + tow_D_list.size());
        System.out.println(tow_D_list.get(0).get(0));
    }
}