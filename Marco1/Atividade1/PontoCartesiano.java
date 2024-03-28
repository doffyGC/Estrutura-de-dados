package Marco1.Atividade1;

public class PontoCartesiano {

   private double pontoX;
    private double pontoY;

    public PontoCartesiano(double pontoX, double pontoY){

        this.pontoX = pontoX;
        this.pontoY = pontoY;
    }


    public double getPontoX() {
        return pontoX;
    }

    public double getPontoY() {
        return pontoY;
    }

    public void setPontoX(double pontoX) {
        this.pontoX = pontoX;
    }

    public void setPontoY(double pontoY){this.pontoY = pontoY;}

    public double calcularDistancia(PontoCartesiano outroPonto){

        double distancia = Math.sqrt(Math.pow((outroPonto.pontoX - this.pontoX), 2) + Math.pow((outroPonto.pontoY- this.pontoY), 2));
        return distancia;
    }
}
