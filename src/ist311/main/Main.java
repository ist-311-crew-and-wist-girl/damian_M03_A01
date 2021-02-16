package ist311.main;

import ist311.usecases.AddComment;
import ist311.usecases.CheckBusiness;
import java.util.Scanner;

/**
 * using the main method to make the use cases check business page (for business owner)
 * and to leave a comment (for business owner)
 */

public class Main {
    public static void main(String[] args){
        CheckBusiness governorsPub = new CheckBusiness("Governors' Pub", "211 W High St, Bellefonte, PA 16823",
                "(814) 353-1008", "11:00AM", "9:00PM", "A place for good times and good fries. Welcoming of the whole family!",
                "All customers must wear masks inside the restaurant. Only seating 50% capacity.");
        System.out.println(governorsPub);


        Scanner scnr = new Scanner(System.in);
        System.out.println("Leave a comment on the business' page: ");
        String userComment = scnr.nextLine();
        System.out.println("New User Comment on " + governorsPub.getBusinessName() + "'s Page: " + userComment);
    }
    
}
