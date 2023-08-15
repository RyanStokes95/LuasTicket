import java.util.*;
public class LuasTicketApp {

    public static void main(String[] args) {

        String person="";
        int zone=0;
        double price=0.0;

        Scanner keyboard=new Scanner(System.in);
        LuasTicket myLuasticket=new LuasTicket();

        System.out.println("Please enter if you are an adult or a child");
        person=keyboard.nextLine();
        myLuasticket.setPerson(person);

        System.out.println("Please enter how many zones you wish to travel");
        zone=keyboard.nextInt();
        myLuasticket.setZone(zone);

        myLuasticket.compute();

        price= myLuasticket.getPrice();
        System.out.println("Your fare is "+price);
    }

}
