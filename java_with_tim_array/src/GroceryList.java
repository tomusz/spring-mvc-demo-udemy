import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItme(String item) {

        groceryList.add(item);

    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {

        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }

    }

    public void modifyGroceryItem(String current,String newItem){

    int position = findItem(current);
    if(position >=0){
        modifyGroceryItem(position,newItem);
    }

    }

    private void modifyGroceryItem(int position, String newItem) {

        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");

    }

    public void removeGroceryItem(String name){

        int position = findItem(name);
        if(position >=0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    private int findItem(String searchItem){
            return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchFile){
        int position = findItem(searchFile);
        if(position >=0){return true; }else {
            return false;
        }
    }
}
