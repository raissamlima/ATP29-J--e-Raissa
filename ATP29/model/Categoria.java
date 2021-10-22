package ATP29.model;

public class Categoria {
    public String nome_filme;
    public String ator_principal;
    public String atriz_principal;
    public String duracao;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Categoria) {
            Categoria outro = (Categoria) obj;
            if (this.nome_filme.equals(outro.nome_filme) && this.ator_principal.equals(outro.ator_principal)
                    && this.atriz_principal.equals(outro.atriz_principal) && this.duracao.equals(outro.duracao)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String retorno = "=== Filme === \n" + this.nome_filme + "Ator principal: " + this.ator_principal + "Ator principal: " + this.atriz_principal + "Duração: "
                + this.duracao;
        return retorno;
    }
}
