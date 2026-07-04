import javax.swing.JOptionPane;

public class JogoExecutor {
    public void executor() {
        // Classe nomeObjeto = new Classe();
        // Instanciando (criar) um objeto da classe Jogo
        Jogo counterStrike2 = new Jogo();
        // Definido valor para o atributo nome
        counterStrike2.nome = "CS2";
        counterStrike2.preco = 0;
        counterStrike2.parcelamentoDisponivel = 0;
        counterStrike2.valorParcela = calcularValorParcela(counterStrike2);

        Jogo redDeadRedemption2 = new Jogo();
        redDeadRedemption2.nome = "Red Dead Redemption 2";
        redDeadRedemption2.preco = 220.90;
        redDeadRedemption2.parcelamentoDisponivel = 12;
        redDeadRedemption2.valorParcela = calcularValorParcela(redDeadRedemption2);

        Jogo theWitcher3 = new Jogo();
        theWitcher3.nome = "The Witcher 3";
        theWitcher3.preco = 40.00;
        theWitcher3.parcelamentoDisponivel = 2;
        theWitcher3.valorParcela = calcularValorParcela(theWitcher3);

    JOptionPane.showMessageDialog(null,
    "=== Jogo 1 ===\n" +
    "Nome: " + counterStrike2.nome + "\n" +
    "Preço: R$ " + counterStrike2.preco + "\n" +
    "Parcelamento: " + counterStrike2.parcelamentoDisponivel + "x\n" +
    "Valor da Parcela: R$ " + counterStrike2.valorParcela + "\n\n" +

    "=== Jogo 2 ===\n" +
    "Nome: " + redDeadRedemption2.nome + "\n" +
    "Preço: R$ " + redDeadRedemption2.preco + "\n" +
    "Parcelamento: " + redDeadRedemption2.parcelamentoDisponivel + "x\n" +
    "Valor da Parcela: R$ " + redDeadRedemption2.valorParcela + "\n\n" +

    "=== Jogo 3 ===\n" +
    "Nome: " + theWitcher3.nome + "\n" +
    "Preço: R$ " + theWitcher3.preco + "\n" +
    "Parcelamento: " + theWitcher3.parcelamentoDisponivel + "x\n" +
    "Valor da Parcela: R$ " + theWitcher3.valorParcela
);
    }

    private double calcularValorParcela(Jogo jogo) {
        double valorParcela = jogo.preco / jogo.parcelamentoDisponivel;
        return valorParcela;
    }
}
