package pojo;

import br.com.lojinha.enums.Tamanho.Tamanho;

import java.util.List;

public class produto {
    private String nome;
    private String marca;
    protected double valor;
    private List<ItemIncluso> itensInclusos;
    private  Tamanho tamanho;

    public produto(String marcainicial, Tamanho tamanhoinicial){
       this.marca= marcainicial;
       this.tamanho=tamanhoinicial;


    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double novovalor) {
        if (novovalor > 0 ){
            this.valor = novovalor;
        } else {
            throw new IllegalArgumentException("valores devem ser maior que 0");

        }

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novomarca) {
        this.marca = novomarca;
    }

    public List<ItemIncluso> getItensInclusos() {
        return this.itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> novosItensInclusos) {
        this.itensInclusos = novosItensInclusos;
    }

    public Tamanho getTamanho() {
        return this.tamanho;

    }




    public void setTamanho(Tamanho novotamanho) {
        this.tamanho = novotamanho;

    }
}