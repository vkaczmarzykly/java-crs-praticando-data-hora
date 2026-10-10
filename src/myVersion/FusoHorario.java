package myVersion;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FusoHorario {
    public static void main(String[] args) {
        ZonedDateTime dataHoraTokio =  ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Horário atual em Tóquio: " + formatter.format(dataHoraTokio));
    }
}
