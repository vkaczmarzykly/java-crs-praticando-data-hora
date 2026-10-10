package myVersion;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConverteFusoHorario {
    public static void main(String[] args) {
        ZonedDateTime horarioSistema = ZonedDateTime.now();
        ZonedDateTime horarioSydney = horarioSistema.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Horário atual do sistema: " + horarioSistema.format(formatter));
        System.out.println("Horário atual em Sydney: " + horarioSydney.format(formatter));
    }
}
