package pojo;

import br.com.lojinha.enums.Tamanho.Tamanho;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args) {
        produto meuproduto = new produto("Nestle", Tamanho.MEDIO);

        meuproduto.setNome("ps4");
        meuproduto.setValor(89.99);

        List<ItemIncluso> itensInclusos= new ArrayList<>();

        ItemIncluso primeiroitemadicional=new ItemIncluso("controle", 2);
        itensInclusos.add (primeiroitemadicional); //0

        ItemIncluso segundoitemadicional=new ItemIncluso("jogos", 3);
        itensInclusos.add (segundoitemadicional); //1

        ItemIncluso terceiroitemadicional=new ItemIncluso("Cabo de Força", 2);
        itensInclusos.add (terceiroitemadicional); //2

        meuproduto.setItensInclusos(itensInclusos);


        System.out.println(meuproduto.getValor());
        System.out.println(meuproduto.getMarca());
        System.out.println(meuproduto.getItensInclusos().get(1));
        System.out.println(meuproduto.getTamanho());


        System.out.println("Começando a apresentar os itens");

        for (ItemIncluso ItemAtual : meuproduto.getItensInclusos()) {
            System.out.println(ItemAtual.getNome());
            System.out.println(ItemAtual.getQuantidade());
        }

        System.out.println("Acabou os itens");

        produtoNacional meuprodutoNacional = new produtoNacional("Sony", Tamanho.MEDIO);
        meuprodutoNacional.setImpostoNacional(0.55);
        System.out.println(meuprodutoNacional.getImpostoNacional());

        ProdutoInternacional meuprodutointernacional= new ProdutoInternacional("sony",Tamanho.MEDIO);
        meuprodutointernacional.setValor(-99.99);
    }
}
