public class Principal {
    public static void main(String[] args) {
        //remetentes
        Remetente r1 = new Remetente("Jairo","55-34985349");
        Remetente r2 = new Remetente("Ana","54-239042483");
        //encomendas
        Encomenda e1 = new Encomenda("Sabonete",10.0,r1);
        Encomenda e2 = new Encomenda("Bola da Fifa", 14, r2);
        Encomenda e3 = new Encomenda("Gato de Vrido", 11, r1);
        //central
        Central central = new Central();
        //envios
        Expresso r1 = new Expresso(e1, "10/10/2010", 65.0);
        Internacional i1 = new Internacional(e2, "20/10/2011", 7.99);
        Economico eco1 = new Economico(e3, "01/01/2013", 34.49);
        //registrando envios na central
        central.adicionarEnvio(r1);
        central.adicionarEnvio(i1);
        central.adicionarEnvio(eco1);

        try (
            Encomenda e4 = new Encomenda("Monster sabor Café", -21, r2);
        ) catch : PesoNegativoException(
            "ERRO TRATADO", msg;
        )

        FechamentoDoDia.fecharDia()
        DestinoEncomenda.enviar(ConsoleDestino);
        ConsoleDestino();
        }
}