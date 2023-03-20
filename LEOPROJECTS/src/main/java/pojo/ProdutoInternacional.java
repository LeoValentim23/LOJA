package pojo;

import br.com.lojinha.enums.Tamanho.Tamanho;
import br.com.lojinha.enums.interfaces.Favorito;

public class ProdutoInternacional extends produto implements Favorito {

    private double taxadeimportaçao;
    public ProdutoInternacional(String marcainicial, Tamanho tamanhoinicial) {
        super(marcainicial, tamanhoinicial);
    }

    public double getTaxadeimportaçao() {
        return taxadeimportaçao;
    }

    public void setTaxadeimportaçao(double taxadeimportaçao) {
        this.taxadeimportaçao = taxadeimportaçao;
    }

    public void setValor(double novovalor) {
        if (novovalor > -100) {
            this.valor = novovalor;
        } else {
            throw new IllegalArgumentException("valores devem ser maior que -100");

        }

    }

    public String getdadosfavoritos() {
        return this.getNome() + "," + this.getMarca() + "," + this.getValor();
    }
}
