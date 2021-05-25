
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    public static void main(String[] args) throws IOException {
        String nombreEquipo="", nombre="";
        int puntoAnotado=0,numeroUniforme=0,opc=1,suma=0,resp=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Datos obj = new Datos();
         System.out.println("Nombre del equipo: ");
         nombreEquipo=br.readLine();
        while(opc!=2){
            suma = suma + 1;
            System.out.println("Numero de uniforme: ");
            numeroUniforme=Integer.parseInt(br.readLine());
            System.out.println("Nombre del jugador: ");
            nombre=br.readLine();
            obj.setNombre(nombre);
            System.out.println("puntos del jugador: ");
            puntoAnotado = Integer.parseInt(br.readLine());
            resp = obj.puntos(puntoAnotado);
            System.out.println("para continuar presione 1 y 2 para salir");
            opc=Integer.parseInt(br.readLine());
        }
        obj.setNombreEquipo(nombreEquipo);
        System.out.println("el nombre del equipo: "+obj.nombreEquipo());
        System.out.println("la cantidad de jugadores es:"+suma);
        System.out.println("la suma de los puntos es: "+resp);   
    
    }
    
}
