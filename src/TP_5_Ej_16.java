//Hacer un programa que devuelva la posición de inicio y fin
// de la secuencia de números distintos de ceros cuya suma del contenido sea mayor.
import java.util.Random;
public class TP_5_Ej_16 {
    public static int MAX=20, MINVALOR=1, MAXVALOR=9;
    public static double probabilidad_numero=0.4;
    public static void main (String []args){
        int []arrint = new int [MAX];
        cargar_arreglo_aleatorio_secuencias_int(arrint);
        imprimir_arreglo_secuencias_int(arrint);
        obtener_inicio_fin_mayor_suma(arrint);
    }
    public static void obtener_inicio_fin_mayor_suma(int []arr){
        int inicio=0, fin=0, suma=0;

            inicio=obtener_inicio_sec(arr);
            fin=obtener_fin_sec(arr, inicio);
            for(int j=inicio; j<fin; j++){
                suma+=arr[j];
            }
            inicio++;
        }
    public static int obtener_inicio_sec(int []arr){
        int i=0;
        while((i<MAX) && (arr[i]==0)){
            i++;
        }
        System.out.println("El inicio de la secuencia es: "+i);
        return i;
    }
    public static int obtener_fin_sec(int [] arr, int inicio){
        while((inicio<MAX) && (arr[inicio]!=0)){
            inicio++;
        }
        System.out.println("El fin de la secuecia es: "+(inicio-1));
        return inicio-1;
    }

    public static void cargar_arreglo_aleatorio_secuencias_int(int [] arr){
        Random r = new Random();
        arr[0] = 0;
        arr[MAX-1] = 0;
        for (int pos = 1; pos < MAX-1; pos++){
            if (r.nextDouble()>probabilidad_numero){
                arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
            }
            else{
                arr[pos]=0;
            }
        }
    }
    public static void imprimir_arreglo_secuencias_int(int [] arr){
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++){
            System.out.print(arr[pos]+"|");
        }
        System.out.print("\n");
    }
}
