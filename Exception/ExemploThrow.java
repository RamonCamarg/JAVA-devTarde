package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {

    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null, "Welcome to SENAI");
            String login = JOptionPane.showInputDialog("Informe seu Login");
            String dataNascimento = JOptionPane.showInputDialog("Informe sua data de nascimento [dd/mm/aaaa]");
            dataNascimento = dataNascimento.replace("/", "");
            System.out.println(dataNascimento);
            String senha = JOptionPane.showInputDialog("Informe sua senha de 6 digitos");

            if (senha.length() != 6) {
                throw new Exception("Senha deve ter 6 digitos");
            }
            if (senha.equals(login)) {
                throw new Exception("Senha = login");
            }
            
            // Verifica se a senha contém pelo menos uma letra maiúscula e uma letra minúscula
            boolean contemMaiuscula = false;
            boolean contemMinuscula = false;
            for (char c : senha.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    contemMaiuscula = true;
                }
                if (Character.isLowerCase(c)) {
                    contemMinuscula = true;
                }
            }
            
            if (!contemMaiuscula || !contemMinuscula) {
                throw new Exception("Senha deve conter pelo menos uma letra maiúscula e uma letra minúscula");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Senha", JOptionPane.ERROR_MESSAGE);
        }
    }
}
