public class Formulario {

    private Cliente cliente;
    private Financiación financiación;

    public Formulario(Cliente cliente) {
        this.cliente = cliente;
        financiación = new Financiación();
    }

    public Formulario(Cliente cliente, Financiación financiación) {
        this.cliente = cliente;
        this.financiación = financiación;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Financiación getFinanciación() {
        return financiación;
    }

    public void setFinanciación(Financiación financiación) {
        this.financiación = financiación;
    }

    public void pagarCuota(){
        financiación.setCuotasRestantes(financiación.getCuotasRestantes()-1);
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "cliente=" + cliente +
                ", financiación=" + financiación +
                '}';
    }
}
