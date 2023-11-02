package tp4;

public class GestorImpresoras {

    Impresora[] impsA = new Impresora[3];
    Impresora[] impsB = new Impresora[2];
    Impresora[] impsX = new Impresora[5];

    public GestorImpresoras() {
        for (int i = 0; i < impsA.length; i++) {
            impsA[i] = new Impresora('A');
            impsX[i] = impsA[i];
        }

        for (int i = 0; i < impsB.length; i++) {
            impsB[i] = new Impresora('B');
            impsX[impsA.length + i] = impsB[i];
        }
    }

    public void solicitarImpresion(char tipo) throws InterruptedException {
        switch (tipo) {
            case 'A':
                impresionA(tipo);
                break;
            case 'B':
                impresionB(tipo);
                break;
            case 'X':
                impresionX(tipo);
                break;
        }
    }

    private void impresionA(char tipo) throws InterruptedException {
        int i = 0;
        boolean exito = false;
        System.out.println("El cliente " + Thread.currentThread().getName() + " quiere imprimir un archivo tipo "+tipo);
        do {

            exito = impsA[i].usarImp(i);
            i = (i + 1) % impsA.length;

        } while (!exito);
    }

    private void impresionB(char tipo) throws InterruptedException {
        int i = 0;
        boolean exito = false;
        System.out.println("El cliente " + Thread.currentThread().getName() + " quiere imprimir un archivo tipo "+tipo);
        do {

            exito = impsB[i].usarImp(i);
            i = (i + 1) % impsB.length;

        } while (!exito);
    }

    private void impresionX(char tipo) throws InterruptedException {
        int i = 0;
        boolean exito = false;
        System.out.println("El cliente " + Thread.currentThread().getName() + " quiere imprimir un archivo tipo "+tipo);
        do {

            exito = impsX[i].usarImp(i);
            i = (i + 1) % impsX.length;

        } while (!exito);
    }
}

