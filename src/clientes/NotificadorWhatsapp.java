package clientes;

import notificador.Notificador;

public class NotificadorWhatsapp extends Notificador {

    private String shortCode;
    
    public NotificadorWhatsapp(String idTransacao, String shortCode) {
        super(idTransacao);
        this.shortCode = shortCode;
    }

    @Override
    public boolean enviar(String mensagem, String destinatario) {
        System.out.println("------------------------");
        System.out.println("Enviando mensagem via WhatsApp Business do número: " + this.shortCode + " para " + destinatario);
        System.out.println("Texto: " + mensagem);

        boolean sucesso = true;
        System.out.println("Mensagem via whats enviada com sucesso");

        registrarLog(sucesso);
        System.out.println("------------------------");

        return sucesso;
    }

    
}
