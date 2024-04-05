package insper.store.instituicao;

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
        @RequestBody(required = true) InstituicaoIn in
    );

    @GetMapping("/instituicao/{id}")
    public ResponseEntity<InstituicaoOut> read(
        @PathVariable(required = true) String id
    );

    @GetMapping("/instituicao")
    public ResponseEntity<InstituicaoOut[]> readAll(
        @RequestHeader(required = false, name = "Authorization") String token
    );
}