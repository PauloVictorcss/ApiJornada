import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class ProdutorLocal {
    private String nome;
    private String localizacao;
    private List<String> produtos;

    public ProdutorLocal(String nome, String localizacao, List<String> produtos) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.produtos = produtos;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public List<String> getProdutos() {
        return produtos;
    }
}

class AplicativoProdutoresLocais {
    private Map<String, ProdutorLocal> produtoresLocais = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void adicionarProdutorLocal(String nome, String localizacao, List<String> produtos) {
        ProdutorLocal produtorLocal = new ProdutorLocal(nome, localizacao, produtos);
        produtoresLocais.put(nome, produtorLocal);
    }

    public void buscarProdutoresPorLocalizacao(String localizacao) {
        List<ProdutorLocal> produtoresEncontrados = new ArrayList<>();

        for (ProdutorLocal produtor : produtoresLocais.values()) {
            if (produtor.getLocalizacao().equalsIgnoreCase(localizacao)) {
                produtoresEncontrados.add(produtor);
            }
        }

        if (produtoresEncontrados.isEmpty()) {
            System.out.println("Nenhum produtor local encontrado na localização desejada.");
        } else {
            System.out.println("Produtores locais na localização '" + localizacao + "':");
            for (ProdutorLocal produtor : produtoresEncontrados) {
                System.out.println("Nome: " + produtor.getNome());
                System.out.println("Produtos: " + produtor.getProdutos());
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        AplicativoProdutoresLocais aplicativo = new AplicativoProdutoresLocais();

        // Exemplo: Adicionando alguns produtores locais
        aplicativo.adicionarProdutorLocal("Produtor A", "Localização A", List.of("Produto X", "Produto Y"));
        aplicativo.adicionarProdutorLocal("Produtor B", "Localização B", List.of("Produto Z"));

        // Exemplo: Busca de produtores por localização
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a localização desejada: ");
        String localizacaoDesejada = scanner.nextLine();
        aplicativo.buscarProdutoresPorLocalizacao(localizacaoDesejada);
    }
}


