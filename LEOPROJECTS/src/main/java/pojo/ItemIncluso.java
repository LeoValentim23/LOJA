package pojo;

public class ItemIncluso {
    private String nome;
    private int quantidade;

    public ItemIncluso(String nomeinicial, int quantidadeinicial) {
        this.nome = nomeinicial;
        this.quantidade = quantidadeinicial;

    }

    public String getNome(){
        return this.nome;
    }

    public void setNome (String nome){
        this.nome= nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
