package jornadaMilhas.apiJ.controller;
import jornadaMilhas.apiJ.destino.DadosDestino;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/destinos")
public class DestinoController {

    @PostMapping
    public void armazenar(@RequestBody DadosDestino dados){

    }

}
