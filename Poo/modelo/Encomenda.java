public class Encomenda{
    private String descricao;
    private double peso;
    private Rememetente remetente;

    public Encomenda(String descricao, double peso, Remetente remetente) {
        if (peso < 0) {
            throw new PesoNegativoInvalido (
                "O Peso da encomenda não pode ser negativo"
            )
        }
        this.descricao = descricao;
        this.peso = peso;
        this.remetente = remetente;
    }

    public double getPeso() { return peso; }

    public Remetente getRemetente() { return remetente;}
}