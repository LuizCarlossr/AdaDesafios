package PasswordPolicy;

public class PasswordPolicy {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Digite a senha.");
            return;
        }

        String senha = args[0];

        if (senhaValida(senha)) {
            System.out.println("Sua senha foi cadastrada.");
        } else {
            System.out.println("Senha precisa ter entre 8 caracteres, " +
                    "pelo menos uma letra maiúscula, " +
                    "uma letra minúscula, um número e um caractere especial.");
        }
    }

    public static boolean senhaValida(String senha) {
        if (senha.length() < 8) {
            return false;
        }

        boolean possuirNumero = false;
        boolean possuirLetraMaiuscula = false;
        boolean possuirLetraMinuscula = false;
        boolean possuirCaracteresEspecial = false;

        for (char caractere : senha.toCharArray()) {
            if (Character.isDigit(caractere)) {
                possuirNumero = true;
            } else if (Character.isUpperCase(caractere)) {
                possuirLetraMaiuscula = true;
            } else if (Character.isLowerCase(caractere)) {
                possuirLetraMinuscula = true;
            } else if ("!@#$%^&*()-_=+[]{}|;:',.<>?/".indexOf(caractere) >= 0) {
                possuirCaracteresEspecial = true;
            }
        }
        return possuirNumero && possuirLetraMaiuscula &&
                possuirLetraMinuscula && possuirCaracteresEspecial;
    }
}