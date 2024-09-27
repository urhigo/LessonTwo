public class Main {

    public static void main(String[] args) {
        Ticket ticket1 = new Ticket();
        Ticket ticket3 = new Ticket("Prime Hall", (short) 234, 'A');
        Ticket ticket2 = new Ticket();

        System.out.println(ticket1.getId());
        System.out.println(ticket1.getTimeCreateTicket());
        System.out.println(ticket1.getMaxBackpackWeight());
        System.out.println(ticket1.getDateEvent());

        System.out.println(ticket3.getId());
        System.out.println(ticket3.getTimeCreateTicket());
        System.out.println(ticket3.getMaxBackpackWeight());
        System.out.println(ticket3.getDateEvent());

        System.out.println(ticket2.getId());
        System.out.println(ticket2.getTimeCreateTicket());
        System.out.println(ticket2.getMaxBackpackWeight());
        System.out.println(ticket2.getDateEvent());

    }
}
