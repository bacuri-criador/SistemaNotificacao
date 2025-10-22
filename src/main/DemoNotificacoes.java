package main;

import clientes.NotificadorEmail;
import clientes.NotificadorSMS;
import clientes.NotificadorWhatsapp;
import notificador.SistemaDeNotificacao;
import notificador.Notificador;

public class DemoNotificacoes {

    public static void main(String[] args) {
        SistemaDeNotificacao sistema = new SistemaDeNotificacao();

        // Cenário 1: Notificação por E-mail com assunto (sem alteração)
        Notificador email = new NotificadorEmail("TX12345", "Confirmação de Pedido");
        sistema.dispararNotificacao(email, "Olá! Seu pedido #9876 foi recebido com sucesso.", "cliente@email.com");
        
        System.out.println("\n");

        // Cenário 2: Notificação por SMS com short code (sem alteração)
        Notificador sms = new NotificadorSMS("TX12346", "28599");
        sistema.dispararNotificacao(sms, "Sua entrega está a caminho. Rastreio: BR123XYZ", "+5511987654321");

        System.out.println("\n");
        
        // Cenário 3: Notificação por WhatsApp com número da conta Business (MODIFICADO)
        // Antes passávamos uma URL, agora passamos um identificador de conta/número.
        Notificador whatsapp = new NotificadorWhatsapp("TX12347", "+15550108899");
        sistema.dispararNotificacao(
            whatsapp, 
            "Olá! Bem-vindo ao nosso canal de atendimento via WhatsApp.", 
            "+5521911223344"
        );
    }
}