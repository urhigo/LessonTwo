import java.time.LocalDateTime;

public class TicketService {

    public boolean controlTicketId(short id) {
        if (id > 9999) {
            System.out.println("We don't have tickets");
            return false;
        }
        return true;
    }

    public boolean controlEventCode(short eventCode) {
        if (eventCode > 999 || eventCode < 1) {
            System.out.println("We don't have event with this code");
            return false;
        }
        return true;
    }

    public boolean controlInformationAboutSector(char sector){
        if(sector != 'A' & sector != 'B' & sector != 'C'){
            System.out.println("We don't have this sector");
            return false;
        }
        return true;
    }

    public boolean controlLengthNamePlace(String namePlace){
        if (namePlace.length() > 10){
            System.out.println("Name place have more 10 symbols");
            return false;
        }
        return true;
    }

    public float maxWeightAccordingEventCode(short codeEvent){

        if (codeEvent == 0){
            return  0.000f;
        }
        if (codeEvent < 333) {
            return 3.500f;
        } else if (codeEvent <= 665) {
           return  4.200f;
        } else {
           return  5.300f;
        }
    }

    public LocalDateTime dateEvent(short codeEvent){
        if (codeEvent == 0){
            return LocalDateTime.now();
        }
        if (codeEvent < 333) {
            return LocalDateTime.of(2024, 3, 15, 18, 20);
        } else if (codeEvent <= 665) {
            return LocalDateTime.of(2024, 9, 27, 16, 30);
        } else {
            return LocalDateTime.of(2024, 12, 5, 20, 30);
        }
    }
}
