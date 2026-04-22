import java.util.Date;
public class NotificacionEmail extends Notificacion {
    private String asunto;
    private String correoRemitente;

    public NotificacionEmail() {
    }

    public NotificacionEmail(String asunto, String correoRemitente, String codigo, String destinatario, String mensaje, Date fechaEnvio, Estado estado) {
        super(codigo, destinatario, mensaje, fechaEnvio, estado);
        this.asunto = asunto;
        this.correoRemitente = correoRemitente;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCorreoRemitente() {
        return correoRemitente;
    }

    public void setCorreoRemitente(String correoRemitente) {
        this.correoRemitente = correoRemitente;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo electronico...");
        System.out.println("Remitente: " + correoRemitente);
        System.out.println("Asunto: " + asunto);
        System.out.println("Destinatario: " + getDestinatario());
        System.out.println("Mensaje: " + getMensaje());
        setEstado(Estado.ENVIADA);
    }

    @Override
    public String toString() {
        return "NotificacionEmail{" +
                "asunto='" + asunto + '\'' +
                ", correoRemitente='" + correoRemitente + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", destinatario='" + getDestinatario() + '\'' +
                ", mensaje='" + getMensaje() + '\'' +
                ", fechaEnvio='" + getFechaEnvio() + '\'' +
                ", estado=" + getEstado() +
                '}';
    }
}
