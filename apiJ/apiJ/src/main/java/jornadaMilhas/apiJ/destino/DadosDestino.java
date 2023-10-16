package jornadaMilhas.apiJ.destino;

import org.springframework.web.multipart.MultipartFile;

public record DadosDestino(String nome,MultipartFile foto, String preco) {
}
