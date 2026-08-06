public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto("Juan Perez", "ABC123", 1500);
        Piloto piloto2 = new Piloto("Alejandro Lopez", "XYZ789");

        piloto2.setHorasVuelo(500, true); 

        System.out.println(piloto1);
        System.out.println(piloto2);

        Avión avión1 = new Avión("Boeing 7", 400, piloto1);
        Avión avión2 = new Avión("Airbus 3", 180);

        avión2.setPiloto(piloto2);
        
        Avión avion3 = new Avión("Cessna 1", 4, piloto1);
        Avión avion4 = new Avión("Cessna 1", 4, piloto1);
        
        System.out.println("Comparación de avión 3 y avión 4: ");
        System.out.println(avion3.equals(avion4));
    }
}