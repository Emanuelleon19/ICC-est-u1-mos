public class MetodosOrdenamiento {

    public int[] sortBySeleccion(int[] arreglo){
        int tamanio = arreglo.length;

        //Recorrer el arreglo 
        for (int i = 0; i < tamanio; i++) {
            
            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {
                if(arreglo[j] > arreglo[indice]){
                    indice = j;
                }
            }
            ///Intercambio del indice encontrado por el primero
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }

    public int[] sortBySeleccion(int[] arreglo, boolean ascendente){
        int n = arreglo.length;

        for(int i = 0; i < n - 1; i++){
            int indicemayor = i;
            for (int j = i + 1; j < n; j++) {
                if(ascendente){
                    if(arreglo[j] < arreglo[indicemayor]){
                        indicemayor = j;
                    }
                }else{
                    if(arreglo[j] > arreglo[indicemayor]){
                        indicemayor = j;
                    }
                }
            }
            ///Intercambio del indice encontrado por el primero
            int aux = arreglo[indicemayor];
            arreglo[indicemayor] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }
    public void printArregloOrdenado(int[] arreglo){
        for (int elemento : arreglo){
            System.out.print(elemento + "-");
        }
    }
}
