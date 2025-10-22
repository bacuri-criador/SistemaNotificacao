package notificador;

public abstract class Notificador {
    protected String idTransacao;
    protected String status;

    public Notificador(String idTransacao) {
        this.idTransacao = idTransacao;
        this.status = "PENDENTE";
    }

    public abstract boolean enviar(String mensagem, String destinatario);

    protected void registrarLog(boolean sucesso) {
        this.status = sucesso ? "ENVIADO" : "FALHA";
        System.out.println("Log da transação: " + idTransacao + "Tentativa de envio finalizada" + this.status);
    }
}
