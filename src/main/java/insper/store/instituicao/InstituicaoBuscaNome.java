package insper.store.instituicao;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record InstituicaoBuscaNome(
    String nome) 
{
    
}
