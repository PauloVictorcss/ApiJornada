package jornadaMilhas.apiJ.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;


public record Endereco(

        @NotBlank
        String rua,
        @NotBlank
        @Pattern(regexp = "\\d{9}")
        String cep) {

}
