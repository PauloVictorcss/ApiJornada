package jornadaMilhas.apiJ.turista;
import jakarta.persistence.*;
import jornadaMilhas.apiJ.endereco.EnderecoEntidade;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "turistas")
@Entity(name = "Turista")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Turista {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String comentario;
    private boolean ativo;
    @Embedded
    private EnderecoEntidade endereco;

    public Turista(DadosComentarios dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.comentario = dados.comentario();
        this.endereco = new EnderecoEntidade(dados.endereco());
    }

    public void atualizaInformacoes(DadosAtualizacao dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.comentario() != null){
            this.comentario = dados.comentario();
        }
    }

    public void inativa() {
        this.ativo = false;
    }
}
