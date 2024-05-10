package insper.store.instituicao;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name = "store-instituicao")
public interface InstituicaoController {

    @PostMapping("/instituicao")
    public ResponseEntity<InstituicaoOut> create(
        @RequestBody(required = true) InstituicaoIn in,
        @RequestHeader(required = true, name = "role-user") String roleUser
    );

    @GetMapping("/instituicao/{id}")
    public ResponseEntity<InstituicaoOut> read(

        @PathVariable(required = true) String id
    );

    @GetMapping("/instituicao")
    public ResponseEntity<List<InstituicaoOut>> readAll();

    @GetMapping("/instituicao/nome")
    public ResponseEntity<InstituicaoOut> getByNome(
        @RequestBody(required = true) String nome
    );
    
}