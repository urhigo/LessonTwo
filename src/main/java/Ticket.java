import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ticket {

    private final short id;                                                             // Unique code ticket. You get id when create new ticket. Max value 9999.
    String concertHall;                                                                 // Name concert hall. Max length 10 symbols.
    short eventCode;                                                                    // Unique code event. You get it code when buy ticket.
    private final LocalDateTime timeCreateTicket = LocalDateTime.now();                 // Local time when you buy your ticket.
    private LocalDateTime dateEvent;                                                    // Date when will be event.
    char stadiumSector;                                                                 // Sector where you will be on event.
    boolean promo;                                                                      // This is the event kind of marketing promotion or not.
    private float maxBackpackWeight;                                                    // Max weight backpack on event according cod event.


    private static short count = 0;

    public Ticket() {
        ++count;
        this.id = count;
    }

    public Ticket(String concertHall, short eventCode, char stadiumSector, boolean promo) {
        ++count;
        if(new TicketService().controlTicketId(count) & new TicketService().controlEventCode(eventCode) & new TicketService().controlLengthNamePlace(concertHall) & new TicketService().controlInformationAboutSector(stadiumSector)) {
            this.id = count;
            this.concertHall = concertHall;
            this.eventCode = eventCode;
            this.stadiumSector = stadiumSector;
            this.promo = promo;
            this.maxBackpackWeight = new TicketService().maxWeightAccordingEventCode(eventCode);
            this.dateEvent = new TicketService().dateEvent(eventCode);
        } else {
            --count;
            throw new IllegalArgumentException("Invalid ticket information");
        }
    }


    public short getId() {
        return id;
    }

    public LocalDateTime getTimeCreateTicket() {
        return timeCreateTicket;
    }

    public float getMaxBackpackWeight() {
        return maxBackpackWeight;
    }

    public LocalDateTime getDateEvent() {
        return dateEvent;
    }
}
