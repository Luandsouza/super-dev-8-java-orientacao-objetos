import javax.swing.JOptionPane;


public class FabricanteExecutor {
    public void executor() {
        Fabricante weg = new Fabricante();
        weg.nome = "WEG";
        weg.cnpj = "84.429.695/0001-11";
        weg.faturamento = 300;
        weg.porcentagem = 10;
        weg.lucro = calcularLucro(weg);
        
        Fabricante tramontina = new Fabricante();
        tramontina.nome = "Tramontina";
        tramontina.cnpj = "90.050.238/0001-14";
        tramontina.faturamento = 500;
        tramontina.porcentagem = 20;
        tramontina.lucro = calcularLucro(tramontina);

      JOptionPane.showMessageDialog(null,
        "SC" + "\n" +
        "Nome: " + weg.nome + "\n" +
        "CNPJ: " + weg.cnpj + "\n" + 
        "Faturamento: " + weg.faturamento + "\n"+ 
        "Porcentagem de lucro: " + weg.porcentagem + "%" + "\n" +
        "Lucro: R$" + weg.lucro + 
        "\n\n" + 

        "RS" + "\n" +
        "Nome: " + tramontina.nome + "\n" +
        "CNPJ: " + tramontina.cnpj + "\n" + 
        "Faturamento: " + tramontina.faturamento + "\n"+ 
        "Porcentagem de lucro: " + tramontina.porcentagem + "%" + "\n" + 
        "Lucro: R$" + tramontina.lucro
      );
    }

    private double calcularLucro(Fabricante fabricante) {
        double formula = fabricante.porcentagem / 100;
        double lucro = fabricante.faturamento * formula;
        return lucro;
    }
    
}
