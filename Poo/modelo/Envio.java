public abstract class Envio {
    private Encomenda encomenda;
    private String data;
    private double precoBase;

    public Envio(Encomenda encomenda, String data, double precoBase) {
        if ( encomenda == null ) { 
            throw new EnvioSemEncomendaException(
                "O envio não existe sem uma encomenda"
            )
        }

        if ( precoBase < 0 ) {
            throw new PrecoNegativoException(
                "O preco do Envio não pode ser negativo"
            )
        }
        
        this.encomenda = encomenda;
        this.data = data
        this.precoBase = precoBase
    }

    public abstract double calcularTotal();

    public double getPrecoBase() { return precoBase; }
}