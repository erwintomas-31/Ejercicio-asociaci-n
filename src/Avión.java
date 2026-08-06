public class Avión {
    private String modelo;
    private int capacidad;
    private Piloto piloto;

    public Avión(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.piloto = null;
    }

    public Avión(String modelo, int capacidad, Piloto piloto) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.piloto = piloto;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setCapacidad(int capacidad, boolean vueloCarga){
        if(vueloCarga){
            this.capacidad=(int)(capacidad*0.85);
        } else {
            this.capacidad=capacidad;       
        }
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public String getModelo() {
        return modelo;
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    @Override
    public String toString() {
        return "Avión {" + "Modelo " + modelo + ", Capacidad " + capacidad + ", Piloto " + piloto + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Avión avión = (Avión) obj;
        return capacidad == avión.capacidad && modelo.equals(avión.modelo) && piloto.equals(avión.piloto);
    }
    

}
