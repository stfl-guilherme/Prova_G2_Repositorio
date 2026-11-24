public class FechamentoDoDia implements DestinoEncomenda {
    private DestinoEncomenda conteudo;
    private ArrayList envios;


//boa parte deste arquivo apresenta erros, não lembro como fazia essa parte. mas tentei

    public FechamentoDoDia(
        this.envios = central.envios; //ta errado
    )

    public String fecharDia() {
        double faturamentoTotal = 0;
        Envio maisCaro = Null;
        for (Envio envio : envios) {
            faturamentoTotal += envio.getPrecoBase();

        }
        //deu

        return conteudo;
    }
}