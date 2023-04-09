class Volkswagen extends Montadora {
    public Volkswagen(Veiculo veiculo) {
        super(veiculo);
    }

    @Override
    public void montar() {
        System.out.println("Montando um " + veiculo.getTipo() + " da marca Volkswagen.");
    }
}