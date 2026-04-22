public class Main {
    public static void main(String[] args) {
        Notificacion notificacion1 = new NotificacionEmail(
                "Publicacion de calificaciones",
                "universidad@campus.edu",
                "N001",
                "ana@correo.com",
                "Sus calificaciones ya fueron publicadas en el sistema.",
                "2026-04-21",
                Estado.PENDIENTE
        );

        Notificacion notificacion2 = new NotificacionSMS(
                "3001234567",
                "N002",
                "Carlos Perez",
                "Recuerde realizar el pago de su matricula antes de la fecha limite.",
                "2026-04-21",
                Estado.PENDIENTE
        );

        Notificacion notificacion3 = new NotificacionApp(
                "Campus Movil",
                "APP-98765",
                "N003",
                "Laura Gomez",
                "La clase de Programacion Orientada a Objetos ha sido cancelada.",
                "2026-04-21",
                Estado.PENDIENTE
        );

        System.out.println("=== ANTES DEL ENVIO ===");
        System.out.println(notificacion1);
        System.out.println(notificacion2);
        System.out.println(notificacion3);

        System.out.println("\n=== ENVIO DE NOTIFICACIONES ===");
        notificacion1.enviar();
        System.out.println();

        notificacion2.enviar();
        System.out.println();

        notificacion3.enviar();
        System.out.println();

        System.out.println("=== DESPUES DEL ENVIO ===");
        System.out.println(notificacion1);
        System.out.println(notificacion2);
        System.out.println(notificacion3);
    }
}
