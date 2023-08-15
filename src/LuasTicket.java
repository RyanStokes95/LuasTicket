public class LuasTicket {

    private String person;
    private int zone;
    private double price;

    public LuasTicket(){
        person="";
        zone=0;
        price=0.0;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public void compute(){
        if (person.equals("adult")){
            if (zone==1){
                price=1.50;
            }
            else if (zone==2) {
                price=2.30;
            }
            else {
                price=2.90;
            }
        }
        else{
            if (zone==1){
                price=1.00;
            }
            else if (zone==2) {
                price=1.00;
            }
            else {
                price=1.20;
            }
        }
    }

    public double getPrice() {
        return price;
    }
}
