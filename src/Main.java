public class Main{
    //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
    public static void main(String[] args) {
        double nota1 = 6.3;
        double nota2 = 7.2;
    //Coloquei o casting para que a minha média esteja em numero inteiro.
        int media = (int) ((nota1 + nota2) / 2);

        System.out.println("Média: " + media);
    }
}