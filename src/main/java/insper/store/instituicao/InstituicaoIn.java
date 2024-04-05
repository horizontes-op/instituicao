package insper.store.instituicao;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record InstituicaoIn (
    // dados gerais
    String nome,
    String area_atuacao,
    String cnpj,
    String site,
    String modalidade,

    // endereço
    String cep,
    String numero_endereco,

    // redes sociais
    String perfil_instagram,
    String perfil_facebook,
    String perfil_linkedin,
    String perfil_twitter,

    // contato
    String email,
    String telefone,

    // sobre a instituição
    String descricao,
    String misssao,
    String visao,
    String valores
) {
    
}
