public class Internacionaç extends Envio {
    public Internacionaç(Encomenda encomenda, String data, double precoBase) {
        super(encomenda, data, precoBase);
    }

    @Override
    public double calcularTotal() {
        return encomenda.precoBase * 2.5;
    }
}