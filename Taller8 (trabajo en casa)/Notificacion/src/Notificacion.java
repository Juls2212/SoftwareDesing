public abstract class Notificacion {
    private String codigo;
    private String destinatario;
    private String mensaje;
    private String fechaEnvio;
    private Estado estado;

    public Notificacion() {
    }

    public Notificacion(String codigo, String destinatario, String mensaje, String fechaEnvio, Estado estado) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public abstract void enviar();

    @Override
    public String toString() {
        return "Notificacion{" +
                "codigo='" + codigo + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", fechaEnvio='" + fechaEnvio + '\'' +
                ", estado=" + estado +
                '}';
    }
}
