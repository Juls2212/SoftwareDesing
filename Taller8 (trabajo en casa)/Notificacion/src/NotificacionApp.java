import java.util.Date;

public class NotificacionApp extends Notificacion {
    private String nombreAplicacion;
    private String idDispositivo;

    public NotificacionApp() {
    }

    public NotificacionApp(String nombreAplicacion, String idDispositivo, String codigo, String destinatario, String mensaje, Date fechaEnvio, Estado estado) {
        super(codigo, destinatario, mensaje, fechaEnvio, estado);
        this.nombreAplicacion = nombreAplicacion;
        this.idDispositivo = idDispositivo;
    }

    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    public void setNombreAplicacion(String nombreAplicacion) {
        this.nombreAplicacion = nombreAplicacion;
    }

    public String getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificacion por aplicacion movil...");
        System.out.println("Aplicacion: " + nombreAplicacion);
        System.out.println("ID del dispositivo: " + idDispositivo);
        System.out.println("Destinatario: " + getDestinatario());
        System.out.println("Mensaje: " + getMensaje());
        setEstado(Estado.ENVIADA);
    }

    @Override
    public String toString() {
        return "NotificacionApp{" +
                "nombreAplicacion='" + nombreAplicacion + '\'' +
                ", idDispositivo='" + idDispositivo + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", destinatario='" + getDestinatario() + '\'' +
                ", mensaje='" + getMensaje() + '\'' +
                ", fechaEnvio='" + getFechaEnvio() + '\'' +
                ", estado=" + getEstado() +
                '}';
    }
}
