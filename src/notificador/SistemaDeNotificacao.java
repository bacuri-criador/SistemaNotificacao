package notificador;

public class SistemaDeNotificacao {
    public void dispararNotificacao(Notificador notificador, String mensagem, String destinatario) {
        System.out.println("Iniciando o processo de notificação");

        boolean resultado = notificador.enviar(mensagem, destinatario);

        if(resultado) {
            System.out.println("Processo finalizado com sucesso");
        } else {
            System.out.println("Processo finalizado com falha");
        }
    }
}
