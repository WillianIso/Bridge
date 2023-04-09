class Ford extends Montadora {
    public Ford(Veiculo veiculo) {
        super(veiculo);
    }

    @Override
    public void montar() {
        System.out.println("Montando um " + veiculo.getTipo() + " da marca Ford.");
    }
}