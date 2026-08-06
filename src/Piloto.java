public class Piloto {
    private String nombre;
    private String Licencia;
    private double horasVuelo;
  
    public Piloto(String nombre, String Licencia, double horasVuelo){
        this.nombre = nombre;
        this.Licencia = Licencia;
        this.horasVuelo = horasVuelo;
    }

    public Piloto(String nombre, String Licencia){
        this.nombre = nombre;
        this.Licencia = Licencia;
        this.horasVuelo = 0; 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLicencia(String Licencia) {
        this.Licencia = Licencia;
    }

    public void setHorasVuelo(double horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    public void setHorasVuelo(double horasVuelo, boolean acumular){
        if(acumular){
            this.horasVuelo+=horasVuelo;
        } else {
            this.horasVuelo=horasVuelo;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return Licencia;
    }

    public double getHorasVuelo() {
        return horasVuelo;  
    }

    @Override
    public String toString() {
        return "Piloto {" + "Nombre " + nombre + ", Licencia " + Licencia + ", Horas de vuelo " + horasVuelo + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Piloto piloto = (Piloto) obj;
        return Double.compare(piloto.horasVuelo, horasVuelo) == 0 && nombre.equals(piloto.nombre) && Licencia.equals(piloto.Licencia);
    }
}
