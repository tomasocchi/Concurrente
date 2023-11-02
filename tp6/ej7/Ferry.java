package tp6.ej7;

public class Ferry {

    private boolean viajeTerminado = false;
    private int espacios;
    private int espaciosActuales;
    private int cantidadAP;
    private int espaciosDesocupados;

    public Ferry(int cantEspacios, int cantPas, int cantAu) {
        espacios = cantEspacios;
        cantidadAP = cantPas + cantAu;
    }

    //Metodos usados por los pasajeros y autos
    public synchronized void ingresar() {
        try {
            while (espacios == espaciosActuales) {
                this.wait();
            }
        } catch (InterruptedException e) {
        }

        cantidadAP--;
        espaciosActuales++;
        System.out.println("El " + Thread.currentThread().getName() + " se acaba de subir al Ferry, cantidad de espacios ocupados: " + espaciosActuales);

        if (cantidadAP == 0 && espaciosActuales > 0) {
            espaciosActuales = espacios;
        }
        this.notifyAll();
    }

    public synchronized void bajarse() {
        try {
            while (!viajeTerminado) {
                this.wait();
            }
        } catch (InterruptedException e) {
        }

        System.out.println("El " + Thread.currentThread().getName() + " se acaba de bajar del Ferry");
        espaciosDesocupados++;
        this.notifyAll();
    }

    //Metodos utilizados por el hilo control
    public synchronized void empezarViaje() {
        try {
            while (espaciosActuales < espacios) {

                this.wait();
            }
        } catch (InterruptedException e) {
        }

        System.out.println("-----ACABA DE COMENZAR EL VIAJE-----");
    }

    public synchronized void terminarViaje() {
        System.out.println("----EL VIAJE EN FERRY ACABA DE TERMINAR----");
        viajeTerminado = true;
        this.notifyAll();
    }

    public synchronized void permitirAcceso() {
        try {
            while (espaciosDesocupados < espacios) {
                this.wait();
            }
        } catch (InterruptedException e) {
        }
        System.out.println("-----SE PERMITE NUEVAMENTE EL INGRESO AL FERRY-----");
        espaciosDesocupados = 0;
        viajeTerminado = false;
        espaciosActuales = 0;
        this.notifyAll();
    }
}
