public class Expresso extends Envio {
    public Expresso(Encomenda encomenda, String data, double precoBase) {
        super(encomenda, data, precoBase);
    }

    @Override
    public double calcularTotal() {
        if ( encomenda.getPeso > 10 ) {
            double pesoExtra = encomenda.getPeso;
            pesoExtra -= 10
            pesoExtra * 15
            return encomenda.getPeso + pesoExtra;
        }
        return encomenda.getPrecoBase;
    }
}