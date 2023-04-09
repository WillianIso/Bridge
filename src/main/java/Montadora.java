abstract class Montadora {
    protected Veiculo veiculo;

    public Montadora(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public abstract void montar();
}