package bus_tickets;
interface bus_depart {
// interface methods (does not have a body)

public void ticket();
public void ticket_booking();
}
class bus implements ticket_booking {
public void ticket(){
// The body of ticket() is provided here
System.out.println(" cost of ticket is displayed");
}

public void ticket_booking() {
// The body of sleep() is provided here
System.out.println("show the no:of seats available");
}
}
public class about_interface {
public static void main(String[] args) {
bus obj = new bus();
obj.ticket();
obj.ticket_booking();
}