import javax.swing.JOptionPane;

public class CarroExecutor {
    public void executor() {
        Carro uno = new Carro();
        uno.aro = 15;
        uno.motor = 3.5;
        uno.marca = "Fiat";
        uno.isEletrico = false;
        uno.modelo = "Uno com escada";
        uno.cor = "Claro";

        // Carro foi modificado e preciso atualizar o modelo
        uno.modelo = "Uno com escada dupla";
        uno.motor = 7.0;
        uno.cor = "Relampago do marquinhos";

        //Criar objeto para perguntar para o usuário os dados
        Carro carro1 = new Carro();
        carro1.aro = Integer.parseInt(JOptionPane.showInputDialog("Digite o aro do carro"));
        carro1.motor = Double.parseDouble(JOptionPane.showInputDialog("Digite a potencia do carro"));
        carro1.marca = JOptionPane.showInputDialog("Digite o nome da marca");
        carro1.isEletrico = Boolean.parseBoolean(JOptionPane.showInputDialog("Carro elétrico: [true/false]"));
        carro1.modelo = JOptionPane.showInputDialog("Digite o nome do modelo");
        carro1.cor = JOptionPane.showInputDialog("Digite a cor");

        JOptionPane.showMessageDialog(null,
            "Dados do Uno" + "\n" + 
            "Aro: " + uno.aro + "\n" + 
            "Motor: " + uno.motor + "\n" +
            "Marca: " + uno.marca + "\n" + 
            "Elétrico?: " + uno.isEletrico + "\n" +
            "Modelo: " + uno.modelo + "\n" + 
            "Cor: " + uno.cor +
            "\n\n" +

            "Dados do Carro 1" + "\n" + 
            "Aro: " + carro1.aro + "\n" + 
            "Motor: " + carro1.motor + "\n" +
            "Marca: " + carro1.marca + "\n" + 
            "Elétrico?: " + carro1.isEletrico + "\n" +
            "Modelo: " + carro1.modelo + "\n" + 
            "Cor: " + carro1.cor

        );

    }
}
