package jornadaMilhas.apiJ.turista;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jornadaMilhas.apiJ.endereco.Endereco;


public record DadosComentarios(

        @NotBlank
        String nome,
        @NotBlank
        String comentario,
        @Valid Endereco endereco) {
}
