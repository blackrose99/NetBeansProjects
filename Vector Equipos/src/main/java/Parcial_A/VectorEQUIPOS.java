package Parcial_A;

import java.util.Random;

public class VectorEQUIPOS {
    EQUIPOS v[];
    EQUIPOS guardar[];

    public VectorEQUIPOS(int n){
        v = new EQUIPOS[n];
        
    }

    public String toString() {
        String s = "\n";
        s += " CODIGO \tNOMBRE \t\t\tCIUDAD \t\tCAMPEONATOS GANADOS \n";
        for (int i = 0; i < v.length; i++) {
            s += " " + v[i].getCodigo()+ "\t\t" + v[i].getNombre() + "\t\t" + v[i].getCiudad()+ "\t\t\t" + v[i].getCampeonatos_Ganados()+ "\n";
        }
        return s;
    }

    public void generar() {
        Random generadorAleatorios = new Random();
        
        String CodigoAleatorio[]= new String[v.length];
        String CodigoPart1[]= {"A1","A2","A3","A4","A5","A6","A7","A8","A9","A10"};
        String CodigoPart2[]= {"B1","B2","B3","B4","B5","B6","B7","B8","B9","B10"};
        String CodigoPart3[]= {"C1","C2","C3","C4","C5","C6","C7","C8","C9","C10"};
        
        String nombresAleatorios[] = new String[v.length];
        String nombres[] = {"Junior", "Atle. Bucaramanga", "Medellin", "Nacional", "Dep. Cali",
            "Cortuluá", "Once Caldas", "Envigado", "Aguilas Doradas", "Jaguares Cordoba", "Union Magdalena", "Itague Leones", "Deportivo Quindio", "Trigres Futbol", "Real Cartagena", "Boca Juniors"};
        
        String ciudadAleatoria[] = new String[v.length];
        String ciudad[] = {"Leticia", "Medellin", "RioNegro", "Apartado", "Turbo",
            "Ciudad de Arauca", "Barranquilla", "Bogota D.C", "Bucaramanga", "Manizales", "Florencia", "Yopal", "Miranda", "Valledupar", "Quibdo", "santa Marta"
                ,"Barrancabermeja", "Malaga", "San gil", "Cartago", "Palmira"};
        
        for (int i = 0; i < v.length; i++) {
            
            CodigoAleatorio[i]=CodigoPart1[(int) (Math.floor(Math.random() * ((CodigoPart1.length - 1) - 0 + 1) + 0))]
                    +""+CodigoPart2[(int) (Math.floor(Math.random() * ((CodigoPart2.length - 1) - 0 + 1) + 0))]
                    +""+CodigoPart3[(int) (Math.floor(Math.random() * ((CodigoPart3.length - 1) - 0 + 1) + 0))];
            
            nombresAleatorios[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))];
            ciudadAleatoria[i] = ciudad[(int) (Math.floor(Math.random() * ((ciudad.length - 1) - 0 + 1) + 0))];
            int generadorCamp_Gan = 0 + generadorAleatorios.nextInt(20);

            v[i] = new EQUIPOS(CodigoAleatorio[i],nombresAleatorios[i],ciudadAleatoria[i],generadorCamp_Gan);
      
        }

    }

    public void ordenacionQuicksort(EQUIPOS array[], int izq, int der) {
        int i = izq;
        int j = der;
        int pivote = array[(i + j) / 2].Campeonatos_Ganados; //determinamos el pivote
        do {
            while (array[i].Campeonatos_Ganados < pivote) {
                i++;
            }
            while (array[j].Campeonatos_Ganados > pivote) {
                j--;
            }
            if (i <= j) {
                //intercambio

                EQUIPOS aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        //llamada de funciones (recursivo)
        if (izq < j) {
            ordenacionQuicksort(array, izq, j);
        }
        if (i < der) {
            ordenacionQuicksort(array, i, der);
        }
        this.v = array;
    }

}

      