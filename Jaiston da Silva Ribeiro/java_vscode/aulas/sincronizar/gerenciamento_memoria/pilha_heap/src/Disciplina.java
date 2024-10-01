public class Disciplina {

    private String nome;
    private Departamento departamento;

    
    public Disciplina(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }
    public void imprimirDetalhes(){
        System.out.println("Disciplina: "+nome);

        // Culpado de stackOver
       // departamento.imprimirDetalhes();
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Disciplina other = (Disciplina) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
    
}