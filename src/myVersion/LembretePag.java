package myVersion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LembretePag {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2026, 9, 4);
        int periodo = 5;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate dataLembrete = dataVencimento.minusDays(periodo);
        String dataLembreteFormatada = dataLembrete.format(formatter);

        System.out.println("Data do lembrete: " + dataLembreteFormatada);
    }
}
