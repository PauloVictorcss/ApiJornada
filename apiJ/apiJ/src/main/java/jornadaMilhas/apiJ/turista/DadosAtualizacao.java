package jornadaMilhas.apiJ.turista;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacao(
        @NotNull
        Long id,
        String nome,
        String comentario) {
}
