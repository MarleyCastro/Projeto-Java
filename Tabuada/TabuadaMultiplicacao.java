public class TabuadaMultiplicacao implements Tabuada{
    int num;

    @Override
    public void mostrarTabuada() {

        int j = 0;
        int mult = 0;
        while (j <= 10) {
            mult = num * j;
            System.out.println(num +" X "+ j +" = " + mult);
            j++;
        }

    }
}
