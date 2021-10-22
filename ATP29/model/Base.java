package ATP29.model;

public class Base {
    public String id = "abc123";

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Base) {
            Base outro = (Base) obj;
            if (this.id.equals(outro.id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String retorno = this.id;
        return retorno;
    }
}
