package PasswordPolicyRegex;

public class PasswordPolicyRegex {
    public static void main(String[] args) {
        String senha = args.length > 0 ? args[0] : "";

        boolean possuiNumero = senha.matches(".*\\d.*");
        boolean possuirLetraMaiuscula = senha.matches(".*[A-Z].*");
        boolean possuirLetraMinuscula = senha.matches(".*[a-z].*");
        boolean possuirCaracteresEspecial = senha.matches(".*[!@#$%^&*()\\-_=+\\[\\]{}|;:',.<>?/].*");

        boolean senhaValida = possuiNumero &&
                              possuirLetraMaiuscula &&
                              possuirLetraMinuscula &&
                              possuirCaracteresEspecial;

        if (senhaValida) {
            System.out.println("Sua senha foi cadastrada.");
        } else {
            System.out.println("Senha precisa ter entre 8 caracteres, " +
                    "pelo menos uma letra maiúscula, " +
                    "uma letra minúscula, um número e um caracteres especial.");
        }
    }
}
