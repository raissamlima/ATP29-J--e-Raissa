package ATP29.model;

public class Produto extends Base {
    public Categoria categoria = new Categoria();
    public String dvd;

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Produto){
            Produto outro = (Produto)obj;
            if (this.id.equals(outro.id) && this.dvd.equals(outro.dvd) && this.categoria.equals(outro.categoria)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "== Produto ==\n" +
                "| Dvd: " + dvd;
    }
}

