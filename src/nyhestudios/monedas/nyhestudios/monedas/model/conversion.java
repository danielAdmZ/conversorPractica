package nyhestudios.monedas.nyhestudios.monedas.model;

public record conversion(String base_code,
                         String target_code,
                         double conversion_rate,
                         double conversion_result)
{
}
