package Ogenerics.service;

class Aluguel<T> {
    private T veiculo;

    public void alugar(T veiculo) {
        this.veiculo = veiculo;
        System.out.println("Veículo alugado: " + veiculo);
    }

    public T devolver() {
        System.out.println("Veículo devolvido: " + veiculo);
        return veiculo;
    }
}
