package claudeVersion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class LembretePagamento {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2026, 9, 4);
        int antecedenciaDias = 5;

        LocalDate dataLembrete = calcularDataLembrete(dataVencimento, antecedenciaDias);

        System.out.println("Data do lembrete: " + dataLembrete.format(FORMATTER));
    }

    public static LocalDate calcularDataLembrete(LocalDate dataVencimento, int antecedenciaDias) {
        Objects.requireNonNull(dataVencimento, "dataVencimento não pode ser nula");
        if (antecedenciaDias < 0) {
            throw new IllegalArgumentException("antecedenciaDias não pode ser negativo");
        }
        return dataVencimento.minusDays(antecedenciaDias);
    }
}
