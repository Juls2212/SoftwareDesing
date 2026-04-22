import java.util.Date;
public class NotificacionSMS extends Notificacion {
    private String numeroTelefono;

    public NotificacionSMS() {
    }

    public NotificacionSMS(String numeroTelefono, String codigo, String destinatario, String mensaje, Date fechaEnvio, Estado estado) {
        super(codigo, destinatario, mensaje, fechaEnvio, estado);
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando mensaje de texto...");
        System.out.println("Numero telefonico: " + numeroTelefono);
        System.out.println("Destinatario: " + getDestinatario());
        System.out.println("Mensaje: " + getMensaje());
        setEstado(Estado.ENVIADA);
    }

    @Override
    public String toString() {
        return "NotificacionSMS{" +
                "numeroTelefono='" + numeroTelefono + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", destinatario='" + getDestinatario() + '\'' +
                ", mensaje='" + getMensaje() + '\'' +
                ", fechaEnvio='" + getFechaEnvio() + '\'' +
                ", estado=" + getEstado() +
                '}';
    }
}