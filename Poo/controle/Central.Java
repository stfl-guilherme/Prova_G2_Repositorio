public class Central {
    private ArrayList<Envio> envios;

    public Central() { this.envios = new ArrayList<>() }

    public void adicionarEnvio(Envio envio) { envios.add(envio); }

    public ArrayList getEnvios() { return envios; }
}