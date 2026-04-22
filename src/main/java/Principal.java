
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        //Variáveis
        int n = 0;
        int[] numeros = new int[100];
        int opcao = -1;

        //q
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU:\n"
                    + "1 - Leitura do vetor\n"
                    + "2 - Verificar existência de valor\n"
                    + "3 - Mostrar posição de valor\n"
                    + "4 - Contar ocorrências de valor\n"
                    + "5 - Menor valor e posição\n"
                    + "6 - Maior valor e posição\n"
                    + "7 - Valor central\n"
                    + "8 - Produto dos valores\n"
                    + "9 - Soma dos positivos\n"
                    + "10- Soma dos negativos\n"
                    + "11- Soma dos pares\n"
                    + "12- Soma dos ímpares\n"
                    + "13- Soma total\n"
                    + "14- Média\n"
                    + "15- Valores maiores que a média\n"
                    + "16- Vetor inverso\n"
                    + "17- Ordenar vetor\n"
                    + "99 - Sair"
            ));

            switch (opcao) {

                case 1: {
                    n = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor (máx 100):"));

                    if (n <= 0 || n > 100) {
                        System.out.println("Tamanho inválido!");
                    } else {
                        // Leitura do vetor
                        for (int i = 0; i < n; i++) {
                            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para A[" + i + "]:"));
                        }
                    }
                    break;
                }

                case 2: { //a)
                    int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
                    boolean existe = false;

                    for (int i = 0; i < n; i++) {
                        if (numeros[i] == valor) {
                            System.out.println("O valor " + valor + " existe no vetor.");
                        }
                    }
                    break;
                }

                case 3: { //b
                    int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
                    for (int i = 0; i < n; i++) {
                        if (numeros[i] == valor) {
                            System.out.println("O valor " + valor + " foi encontrado na posição: " + i);
                        }
                    }
                    break;
                }

                case 4: { //c
                    int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
                    int cont = 0;

                    for (int i = 0; i < n; i++) {
                        if (numeros[i] == valor) {
                            cont++;
                        }
                    }
                    System.out.println("O valor " + valor + " possui " + cont + " ocorrências");
                    break;
                }

                case 5: { //d
                    int menor = 0;
                    for (int i = 1; i < n; i++) {
                        if (numeros[i] < numeros[menor]) {
                            menor = i;
                        }
                    }
                    System.out.println("O menor valor é " + numeros[menor] + " na posição " + menor);
                    break;
                }

                case 6: { //e
                    int maior = 0;

                    for (int i = 1; i < n; i++) {
                        if (numeros[i] > numeros[maior]) {
                            maior = i;
                        }
                    }

                    System.out.println("O maior valor é " + numeros[maior] + " na posição " + maior);
                    break;
                }

                case 7: { //f
                    int meio = -1;
                    if ((n % 2 == 0)) {
                        meio = (n / 2 - 1);
                    } else {
                        meio = (n / 2);
                    }
                    System.out.println("Valor central e: " + numeros[meio] + " ná posição " + meio);
                    break;
                }

                case 8: { //g
                    long produto = 1;
                    for (int i = 0; i < n; i++) {
                        produto *= numeros[i];
                    }
                    System.out.println("Produto do vetor é : " + produto);
                    break;
                }

                case 9: {//h
                    int soma = 0;
                    for (int i = 0; i < n; i++) {
                        if (numeros[i] > 0) {
                            soma += numeros[i];
                        }
                    }
                    System.out.println("Soma dos valores positivos do vetor: " + soma);
                    break;
                }

                case 10: { //i
                    int soma = 0;
                    for (int i = 0; i < n; i++) {
                        if (numeros[i] < 0) {
                            soma += numeros[i];
                        }
                    }
                    System.out.println("A soma dos valores negativos do vetor: " + soma);
                    break;
                }

                case 11: { //j
                    int soma = 0;
                    for (int i = 0; i < n; i++) {
                        if (numeros[i] % 2 == 0) {
                            soma += numeros[i];
                        }
                    }
                    System.out.println("A soma dos valores pares do vetor: " + soma);
                    break;
                }

                case 12: { //k
                    int soma = 0;
                    for (int i = 0; i < n; i++) {
                        if (numeros[i] % 2 != 0) {
                            soma += numeros[i];
                        }
                    }
                    System.out.println("A soma dos valores ímpares do vetor: " + soma);
                    break;
                }

                case 13: { //l
                    int soma = 0;
                    for (int i = 0; i < n; i++) {
                        soma += numeros[i];
                    }
                    System.out.println("A soma total dos valores do vetor: " + soma);
                    break;
                }

                case 14: { //m
                    double soma = 0;
                    for (int i = 0; i < n; i++) {
                        soma += numeros[i];
                    }
                    double media = soma / n;
                    System.out.println("A média aritimética dos valores do vetor: " + media);
                    break;
                }

                case 15: { //n
                    double soma = 0;
                    for (int i = 0; i < n; i++) {
                        soma += numeros[i];
                    }
                    double media = soma / n;

                    System.out.println("Valores do vetor maiores que a média:");
                    for (int i = 0; i < n; i++) {
                        if (numeros[i] > media) {
                            System.out.println(numeros[i]);
                        }
                    }
                    break;
                }

                case 16: { //o
                    System.out.println("Vetor inverso:");
                    for (int i = n - 1; i >= 0; i--) {
                        System.out.println(numeros[i]);
                    }
                    break;
                }

                case 17: { //p
                    //Ordena o vetor
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            int aux = numeros[i];
                            numeros[i] = numeros[j];
                            numeros[j] = aux;
                        }
                    }

                    System.out.println("Vetor ordenado:");
                    for (int i = 0; i < n; i++) {
                        System.out.println(numeros[i]);
                    }
                    break;
                }

                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        } while (opcao != 99);

        System.out.println("Programa encerrado.");
    }
}
