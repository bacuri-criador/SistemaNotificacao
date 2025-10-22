package clientes;

import notificador.Notificador;

public class NotificadorEmail extends Notificador {

    private String assunto;

    public NotificadorEmail(String idTransacao, String assunto) {
        super(idTransacao);
        this.assunto = assunto;
    }

    @Override
    public boolean enviar(String mensagem, String destinatario) {
        System.out.println("Enviar e-mail para: " + destinatario);
        System.out.println("Assunto: " +this.assunto);
        System.out.println("Corpo: " + mensagem);

        boolean sucesso = true;
        System.out.println("E-mail enviado com sucesso");

        registrarLog(sucesso);
        
        return false;
    }
}
