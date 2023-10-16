package jornadaMilhas.apiJ.turista;

import lombok.ToString;

public record DadosListagemTuristas(String nome, String comentario) {

    public DadosListagemTuristas(Turista turista){
        this(turista.getNome(), turista.getComentario());
    }



}
