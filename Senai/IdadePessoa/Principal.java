package IdadePessoa;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(
                null, "Qual Seu nome", "Sistema ", 3
        );
        String numeroString = JOptionPane.showInputDialog(
                null, "Qual seu ano de nascimento", "Sistema" ,3
        );

        int numeroInt = Integer.parseInt(numeroString);
        int dataNascimento = 2025 - numeroInt;

        String msg = String.format(
                "Seu nome é "+ name + " sua data de nascimento: " + dataNascimento
        );

        JOptionPane.showMessageDialog(null, msg, "Sistema", 2);

    }

}
