package br.com.panacademy.bluebank.controle;

import br.com.panacademy.bluebank.dto.transacao.TransferirDTO;
import br.com.panacademy.bluebank.dto.transacao.DepositarDTO;
import br.com.panacademy.bluebank.dto.transacao.SacarDTO;
import br.com.panacademy.bluebank.servico.TransacaoServico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacoes")
public class TransacaoControle {

    private final TransacaoServico transacaoServico;

    public TransacaoControle(TransacaoServico transacaoServico) {
        this.transacaoServico = transacaoServico;
    }

    @PostMapping(value = "depositar/{contaId}")
    public ResponseEntity<DepositarDTO> depositar(@PathVariable("contaId") Long id, @RequestBody DepositarDTO dto){
        dto = transacaoServico.depositar(id, dto);
        return ResponseEntity.ok(dto);
    }

    @PostMapping(value = "sacar/{contaId}")
    public ResponseEntity<SacarDTO> sacar(@PathVariable("contaId") Long id, @RequestBody SacarDTO dto){
        dto = transacaoServico.sacar(id, dto);
        return ResponseEntity.ok(dto);
    }

    @PostMapping(value = "transferir/{contaIdOrigem}/{contaIdDestino}")
    public ResponseEntity<TransferirDTO> transferir(@PathVariable("contaIdOrigem") Long idOrigem,
                                                    @PathVariable("contaIdDestino") Long idDestino,
                                                    @RequestBody TransferirDTO dto){

        dto = transacaoServico.transferir(idOrigem, idDestino, dto);
        return ResponseEntity.ok(dto);

    }

}
