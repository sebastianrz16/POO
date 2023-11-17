
package cursos.parcialcorte2;
/**
 *
 * @author ruizs
 */
import static spark.Spark.*;
import com.google.gson.Gson;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        ArrayList<Vehiculo> coches = new ArrayList<>();
        ArrayList<Vehiculo> motocicletas = new ArrayList<>();

        Automovil auto1 = new Automovil(4, "Toyota", "Corolla", "ABC123", 5);
        coches.add(auto1);
        
        Automovil auto2 = new Automovil(2, "Ford", "Mustang", "DEF456", 4);
        coches.add(auto2);

        Motocicleta moto1 = new Motocicleta(600, "Yamaha", "YZFR6", "XYZ23", 2);
        motocicletas.add(moto1);
        
        Motocicleta moto2 = new Motocicleta(750, "Suzuki", "GSXR750", "GHI759", 3);
        motocicletas.add(moto2);
// Definimos una ruta para obtener la lista de automóviles en formato JSON
        get("/automoviles", (req, res) -> {
            res.type("application/json");
            return gson.toJson(coches);
        });

        get("/motos", (req, res) -> {
            res.type("application/json");
            return gson.toJson(motocicletas);
        });

        get("/agregarMoto/:marca/:modelo/:placa/:cilindrado", (req, res) -> {
            res.type("application/json");
            String marca = req.params(":marca");
            String modelo = req.params(":modelo");
            String placa = req.params(":placa");
            int numeroPuertas = Integer.parseInt(req.params(":cilindrado"));
            Motocicleta nuevaMoto = new Motocicleta(numeroPuertas, marca, modelo,placa, getCurrentHour());
            motocicletas.add(nuevaMoto);
            return gson.toJson(nuevaMoto);
        });

        get("/agregarAutomovil/:marca/:modelo/:placa/:numeroPuertas", (req, res) -> {
            res.type("application/json");
            String marca = req.params(":marca");
            String modelo = req.params(":modelo");
            String placa = req.params(":placa");
            int numeroPuertas = Integer.parseInt(req.params(":numeroPuertas"));
            Automovil nuevoAuto = new Automovil(numeroPuertas, marca, modelo,placa, getCurrentHour());
            coches.add(nuevoAuto);
            return gson.toJson(nuevoAuto);
        });
// Definimos una ruta para establecer la hora de salida de un vehículo
        get("/setHoraDeSalida/:tipoDeVehiculo/:placa/:horaDeSalida", (req, res) -> {
            res.type("application/json");
            String tipoDeVehiculo = req.params(":tipoDeVehiculo");
            String placa = req.params(":placa");
            int horaDeSalida = Integer.parseInt(req.params(":horaDeSalida"));
            if(horaDeSalida >= 0 && horaDeSalida <= 24){
                if(tipoDeVehiculo.equals("Automovil")){
                    Vehiculo vehiculo = obtenerVehiculoPorPlaca(coches, placa);
                    if(vehiculo != null){
                        vehiculo.setHoraSalida(horaDeSalida);
                        vehiculo.uptDineroGenerado();
                        vehiculo.setHoraEntrada(-1);
                    }
                    return gson.toJson(coches);
                }else if(tipoDeVehiculo.equals("Motocicleta")){
                    Vehiculo vehiculo = obtenerVehiculoPorPlaca(motocicletas, placa);
                    if(vehiculo != null){
                        vehiculo.setHoraSalida(horaDeSalida);
                        vehiculo.uptDineroGenerado();
                        vehiculo.setHoraEntrada(-1);
                    }
                    return gson.toJson(motocicletas);
                }
            }
            return null;
        });

        get("/motosActuales", (req, res) -> {
            res.type("application/json");
            ArrayList<Vehiculo> motosActuales = new ArrayList<>();
            for (Vehiculo item: motocicletas) {
                if(item.horaSalida == -1)
                    motosActuales.add(item);
            }
            return gson.toJson(motosActuales);
        });

        get("/AutomovilesActuales", (req, res) -> {
            res.type("application/json");
            ArrayList<Vehiculo> autosActuales = new ArrayList<>();
            for (Vehiculo item: coches) {
                if(item.horaSalida == -1)
                    autosActuales.add(item);
            }
            return gson.toJson(autosActuales);
        });

        get("/motosReporte", (req, res) -> {
            res.type("application/json");
            ArrayList<Vehiculo> ganancias = new ArrayList<>();
            for (Vehiculo item: motocicletas) {
                if(item.horaSalida != 0)
                    ganancias.add(item);
            }
            return gson.toJson(ganancias);
        });

        get("/AutomovilesReporte", (req, res) -> {
            res.type("application/json");
            ArrayList<Vehiculo> ganancias = new ArrayList<>();
            for (Vehiculo item: coches) {
                if(item.horaSalida != 0)
                    ganancias.add(item);
            }
            return gson.toJson(ganancias);
        });
        
        get("/gananciasAutos", (req, res) -> {
            res.type("application/json");
            int total = 0;
            for (Vehiculo item: coches) {
                if(item.horaSalida != 0)
                    total += item.ganancias;
            }
            return gson.toJson(total);
        });
        
        get("/gananciasMotos", (req, res) -> {
            res.type("application/json");
            int total = 0;
            for (Vehiculo item: motocicletas) {
                if(item.horaSalida != 0)
                    total += item.ganancias;
            }
            return gson.toJson(total);
        });

        get("/gananciasTotales", (req, res) -> {
            res.type("application/json");
            int totalAutos = 0;
            int totalMotos = 0;
            for (Vehiculo item: coches) {
                if(item.horaSalida != 0)
                    totalAutos += item.ganancias;
            }
            for (Vehiculo item: motocicletas) {
                if(item.horaSalida != 0)
                    totalMotos += item.ganancias;
            }
            return gson.toJson(totalAutos + totalMotos);
          });
        
    }
    public static int getCurrentHour() {
        LocalTime now = LocalTime.now();
        return now.getHour();
    }

    public static Vehiculo obtenerVehiculoPorPlaca(ArrayList<Vehiculo> vehiculos, String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }
        }
        return null;
    }
}