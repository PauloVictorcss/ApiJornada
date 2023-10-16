package jornadaMilhas.apiJ.controller;

import jakarta.validation.Valid;
import jornadaMilhas.apiJ.turista.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/depoimentos")
public class TuristaController {
    @Autowired
    private TuristaRepository repository;

    @PostMapping
    @Transactional
    public void comentar(@RequestBody @Valid DadosComentarios dados){
        repository.save(new Turista(dados));

    }
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacao dados){
        var turista = repository.getReferenceById(dados.id());
        turista.atualizaInformacoes(dados);

    }
    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id){
        var turista = repository.getReferenceById(id);
        turista.inativa();
    }
    @GetMapping("/depoimentos-home")
    public Page<DadosListagemTuristas> listar(Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemTuristas::new);

    }
}
