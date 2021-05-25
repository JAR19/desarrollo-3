public class Datos extends Jugadores {
    private String nombre;
    private int suma = 0;
    
    public int puntos(int puntosAnotados){
        suma = suma + puntosAnotados;
        return suma;
    }
    public String nombreJugador(){
        String nombre1="";
        nombre1 = nombre1 + nombre;
        return nombre1;
    }
    public String nombreEquipo(){
        String resp;
        resp = getNombreEquipo();
        return resp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
