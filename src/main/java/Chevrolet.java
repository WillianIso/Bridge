class Chevrolet extends Montadora {
    public Chevrolet(Veiculo veiculo) {
        super(veiculo);
    }

    @Override
    public void montar() {
        System.out.println("Montando um " + veiculo.getTipo() + " da marca Chevrolet.");
    }
}