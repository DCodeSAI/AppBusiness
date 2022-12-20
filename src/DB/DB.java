package DB;

import java.util.ArrayList;

public class DB {

    private ArrayList<String> restaurantRegistry = new ArrayList<String>();


    public DB() {

    }

   public void addIntoArraylist (String nameOfBusiness, Long PhoneNumber, String ubication, String horarios){
         this.restaurantRegistry.add(nameOfBusiness);
         this.restaurantRegistry.add(String.valueOf(PhoneNumber));
         this.restaurantRegistry.add(horarios);
         this.restaurantRegistry.add(ubication);

   }

   public void showBussines (){

       for (int i = 0; i < restaurantRegistry.size(); i++) {
           System.out.println(restaurantRegistry);


       }

   }



}
