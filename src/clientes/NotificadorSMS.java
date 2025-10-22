package clientes;

import notificador.Notificador;

public class NotificadorSMS extends Notificador {
    private String shortCode;

    public NotificadorSMS(String idTransacao, String shortCode) {
        super(idTransacao);
        this.shortCode = shortCode;
    }

    @Override
    public boolean enviar(String mensagem, String destinatario) {
        System.out.println("------------------------------------");
        // Usando o atributo específico da classe.
        System.out.println("Enviando SMS do remetente [" + this.shortCode + "] para o número: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
        
        boolean sucesso = true;
        System.out.println("-> SMS enviado com sucesso! 📱");

        registrarLog(sucesso);
        System.out.println("------------------------------------");
        return sucesso;
    }
}