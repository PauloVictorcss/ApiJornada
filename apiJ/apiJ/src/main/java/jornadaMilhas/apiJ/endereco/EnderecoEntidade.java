package jornadaMilhas.apiJ.endereco;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class EnderecoEntidade {

    String rua;
    String cep;

    public EnderecoEntidade(Endereco endereco) {
        this.rua = endereco.rua();
        this.cep = endereco.cep();
    }
}
