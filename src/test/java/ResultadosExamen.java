import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ResultadosExamen {

    public static void main(String[] args) {

        Map<Object, Object> calificacionesExamen1 = calificacionesExamenO();
        Map<Object, Object> calificacionesExamen2 = calificacionesExamenR();
        Map<Object, Object> calificacionesFinales = new HashMap<>();

        Iterator <Object> iterator = calificacionesExamen1.keySet().iterator();
        while(iterator.hasNext()) {
            String key = (String) iterator.next();

            if((int) calificacionesExamen1.get(key) > (int) calificacionesExamen2.get(key)) {
                calificacionesFinales.put(key, calificacionesExamen1.get(key));
            }
            else {
                calificacionesFinales.put(key, calificacionesExamen2.get(key));
            }
            System.out.println("Nombre: " + key + " Calificación Final: " + calificacionesFinales.get(key));
        }
    }

    public static Map<Object, Object> calificacionesExamenO () {

        Map<Object, Object> calExamen1 = new HashMap<>();

        calExamen1.put("Ana", 24);
        calExamen1.put("Daniel", 50);
        calExamen1.put("Alejandro", 79);
        calExamen1.put("Laura", 32);
        calExamen1.put("Kelly", 80);
        calExamen1.put("Ivan", 40);
        calExamen1.put("Maria", 59);
        calExamen1.put("Melanie", 55);
        calExamen1.put("Diego", 95);
        calExamen1.put("Miguel", 63);

        return calExamen1;
    }

    public static Map<Object, Object> calificacionesExamenR () {

        Map<Object, Object> calExamen2 = new HashMap<>();

        calExamen2.put("Ana", 97);
        calExamen2.put("Daniel", 89);
        calExamen2.put("Alejandro", 79);
        calExamen2.put("Laura", 82);
        calExamen2.put("Kelly", 76);
        calExamen2.put("Ivan", 98);
        calExamen2.put("Maria", 80);
        calExamen2.put("Melanie", 95);
        calExamen2.put("Diego", 90);
        calExamen2.put("Miguel", 62);

        return calExamen2;
    }
}