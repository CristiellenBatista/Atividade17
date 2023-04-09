import java.util.Scanner;

public class Aplicativo17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo em MB: ");
        double tamanhoArquivoMB = scanner.nextDouble();

        System.out.print("Digite a velocidade do link de Internet em Mbps: ");
        double velocidadeLinkMbps = scanner.nextDouble();

        double tamanhoArquivoMb = tamanhoArquivoMB * 8; // conversão de MB para Mb
        double tempoDownloadMin = tamanhoArquivoMb / (velocidadeLinkMbps * 60); // cálculo do tempo de download em minutos

        System.out.println("Tempo aproximado de download: " + tempoDownloadMin + " minutos");

        scanner.close();
    }
}

