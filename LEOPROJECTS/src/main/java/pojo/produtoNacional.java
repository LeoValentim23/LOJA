package pojo;

import br.com.lojinha.enums.Tamanho.Tamanho;
import br.com.lojinha.enums.interfaces.Favorito;

public class produtoNacional extends produto implements Favorito{
    private double impostoNacional;
    public produtoNacional(String marcainicial, Tamanho tamanhoinicial) {
        super(marcainicial, tamanhoinicial);
    }

    public double getImpostoNacional(){
        return this.impostoNacional;
    }

    public void setImpostoNacional (double novoimpostonacional){
        this.impostoNacional=novoimpostonacional;
    }


    public String getdadosfavoritos() {
        return this. getNome()+"," + this.getMarca() +","+ this.getValor();
    }
}
