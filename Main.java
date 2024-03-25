public class Main {
    public static void main(String[] args) {

        PontoCartesiano ponto1 = new PontoCartesiano(5, 10);
        PontoCartesiano ponto2 = new PontoCartesiano(10, 5);

        System.out.println(ponto1.calcularDistancia(ponto2));
    }
}
