package parcial2b;

public class Lista {

    Nodo inicio;

    public Lista() {
        inicio = null;
    }

    public Lista insertarTerminoExponente(Polinomio poli) {
        Nodo nuevo;
        nuevo = new Nodo(poli);
        nuevo.enlace = inicio;
        inicio = nuevo;
        return this;
    }

    public void VaciarListaSimple() {
        if (inicio != null) {
            while (inicio != null) {
                inicio = inicio.enlace;
                inicio = null;
            }
        } else {
            System.out.println(" La lista esta vacia. ");
        }
    }

    public void vizualizarPolinomio() {

        Nodo n;
        n = inicio;
        while (n != null) {

            System.out.print("+ ");

            if (n.poli.getExponente() == 0) {
                System.out.print("(" + n.poli.getTermino() + n.poli.getExponente() + ") ");
                 System.out.print("+ ");
                n=n.enlace;
            }
            System.out.print("(" + n.poli.getTermino() + "X^" + n.poli.getExponente() + ") ");

            n = n.enlace;
        }
        System.out.println();
    }

    public void calculo() {
        System.out.println("Cuando x es igual 0.0 : ");
        double total = 0;
        Nodo nodo = inicio;
        while (nodo != null) {

            double calculo = Math.pow((0), nodo.poli.getExponente()) * nodo.poli.getTermino();
            nodo = nodo.enlace;
            total = total + calculo;

        }
        System.out.println(total);
        
        
            
        System.out.println("Cuando x es igual 0.5 : ");

        Nodo nodo2 = inicio;
        double total2 = 0;
        while (nodo2 != null) {

            double calculo2 = (nodo2.poli.getTermino() * Math.pow((0.5), nodo2.poli.getExponente()));
            nodo2 = nodo2.enlace;
            total2 = total2 + calculo2;

        }
        System.out.println(total2);

        System.out.println("Cuando x es igual 1.0 : ");

        Nodo nodo3 = inicio;
        double total3 = 0;
        while (nodo3 != null) {

            double calculo3 = (nodo3.poli.getTermino() * Math.pow((1.0), nodo3.poli.getExponente()));
            nodo3 = nodo3.enlace;
            total3 = total3 + calculo3;

        }
        System.out.println(total3);

        System.out.println("Cuando x es igual 1.5 : ");

        Nodo nodo4 = inicio;
        double total4 = 0;
        while (nodo4 != null) {

            double calculo4 = (nodo4.poli.getTermino() * Math.pow((1.5), nodo4.poli.getExponente()));
            nodo4 = nodo4.enlace;
            total4 = total4 + calculo4;

        }
        System.out.println(total4);

        System.out.println("Cuando x es igual 2.0 : ");

        Nodo nodo5 = inicio;
        double total5 = 0;
        while (nodo5 != null) {

            double calculo5 = (nodo5.poli.getTermino() * Math.pow((2.0), nodo5.poli.getExponente()));
            nodo5 = nodo5.enlace;
            total5 = total5 + calculo5;

        }
        System.out.println(total5);

        System.out.println("Cuando x es igual 2.5 : ");

        Nodo nodo6 = inicio;
        double total6 = 0;
        while (nodo6 != null) {

            double calculo6 = (nodo6.poli.getTermino() * Math.pow((2.5), nodo6.poli.getExponente()));
            nodo6 = nodo6.enlace;
            total6 = total6 + calculo6;

        }
        System.out.println(total6);

        System.out.println("Cuando x es igual 3.0 : ");
        Nodo nodo7 = inicio;
        double total7 = 0;
        while (nodo7 != null) {

            double calculo7 = (nodo7.poli.getTermino() * Math.pow((3.0), nodo7.poli.getExponente()));
            nodo7 = nodo7.enlace;
            total7 = total7 + calculo7;

        }
        System.out.println(total7);

        System.out.println("Cuando x es igual 3.5 : ");

        Nodo nodo8 = inicio;
        double total8 = 0;
        while (nodo8 != null) {

            double calculo8 = (nodo8.poli.getTermino() * Math.pow((3.5), nodo8.poli.getExponente()));
            nodo8 = nodo8.enlace;
            total8 = total8 + calculo8;

        }
        System.out.println(total8);
        System.out.println("Cuando x es igual 4.0 : ");

        Nodo nodo9 = inicio;
        double total9 = 0;
        while (nodo9 != null) {

            double calculo9 = (nodo9.poli.getTermino() * Math.pow((4.0), nodo9.poli.getExponente()));
            nodo9 = nodo9.enlace;
            total9 = total9 + calculo9;

        }
        System.out.println(total9);

        System.out.println("Cuando x es igual 4.5 : ");

        Nodo nodo10 = inicio;
        double total10 = 0;
        while (nodo10 != null) {

            double calculo10 = (nodo10.poli.getTermino() * Math.pow((4.5), nodo10.poli.getExponente()));
            nodo10 = nodo10.enlace;
            total10 = total10 + calculo10;

        }
        System.out.println(total10);

        System.out.println("Cuando x es igual 5.0 : ");

        Nodo nodo11 = inicio;
        double total11 = 0;
        while (nodo11 != null) {

            double calculo11 = (nodo11.poli.getTermino() * Math.pow((5.0), nodo11.poli.getExponente()));
            nodo11 = nodo11.enlace;
            total11 = total11 + calculo11;

        }
        System.out.println(total11);
    }

}
