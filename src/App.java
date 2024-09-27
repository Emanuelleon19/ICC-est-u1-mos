public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo de ordenamiento Seleccion");

        MetodosOrdenamiento mO = new MetodosOrdenamiento();

        int[] arreglo = {5,7,30,12,9};

        mO.sortBySeleccion(arreglo, true);
        mO.printArregloOrdenado(arreglo);
        System.out.println();
        mO.sortBySeleccion(arreglo, false);
        mO.printArregloOrdenado(arreglo);
    }

}
