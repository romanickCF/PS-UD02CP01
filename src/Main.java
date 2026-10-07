//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int repeticiones = 20;

   HiloCaracter h1 = new HiloCaracter('A', repeticiones);
    HiloCaracter  h2 = new HiloCaracter('B', repeticiones);
    HiloCaracter h3 = new HiloCaracter('C', repeticiones);


    h1.start();
    h2.start();
    h3.start();

    try {
        h1.join();
        h2.join();
        h3.join();
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }


    System.out.println();
    System.out.println("Fin del programa.");

        //Justificacion de resultado

    /*Si se mezclan las letras, cuantas mas repeticiones hay mas probabilidad de que
    * se mezclen */
}
