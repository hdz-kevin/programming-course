package clases;

public class Email {
    public String emisor;
    public String remitente;
    public String mensaje;

    /**
     * Constructor: Es un método especial que se ejecuta justo al momento 
     * de instanciar una clase (crear un objeto).
     */
    public Email(String emisor, String remitente, String mensaje) {
     // atributo = parametro
        this.emisor = emisor;
        this.remitente = remitente;
        this.mensaje = mensaje;
    }

    /**
     * Imprimir email formateado
     */
    public void print() {
        System.out.println(
            "De: " + this.emisor +
            "\nPara: " + this.remitente +
            "\nMensaje: " + this.mensaje
        );
    }
}
