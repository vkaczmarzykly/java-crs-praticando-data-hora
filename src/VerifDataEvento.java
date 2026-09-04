import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VerifDataEvento {
    public static void main(String[] args){
        LocalDate dataEvento = LocalDate.of(2026, 10, 4);
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String dataEventoFormatada = dataEvento.format(formatter);
        String dataAtualFormatada = dataAtual.format(formatter);

        System.out.println("Data do evento: " + dataEventoFormatada);
        System.out.println("Data atual: " + dataAtualFormatada);

        if(dataAtual.isAfter(dataEvento)){
            System.out.println("O evento já ocorreu");
        } else if(dataAtual.isBefore(dataEvento)) {
            System.out.println("O evento ainda está por vir");
        } else {
            System.out.println("O evento é hoje");
        }
    }
}
