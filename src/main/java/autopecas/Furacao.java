package autopecas;

public class Furacao {
    private Byte qtdeFuros;
    private Float distanciaEntreFuros;

    public Furacao(Byte qtdeFuros, Float distanciaEntreFuros) {
        this.qtdeFuros = qtdeFuros;
        this.distanciaEntreFuros = distanciaEntreFuros;
    }

    public Byte getQtdeFuros() {
        return qtdeFuros;
    }

    public void setQtdeFuros(Byte qtdeFuros) {
        this.qtdeFuros = qtdeFuros;
    }

    public Float getDistanciaEntreFuros() {
        return distanciaEntreFuros;
    }

    public void setDistanciaEntreFuros(Float distanciaEntreFuros) {
        this.distanciaEntreFuros = distanciaEntreFuros;
    }
}
