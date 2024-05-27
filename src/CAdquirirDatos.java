public class CAdquirirDatos extends Thread {
    private CBufer muestras; // objeto para almacenar los datos

    // constructor
    public CAdquirirDatos(CBufer muestrasx, String nombre) {
        setName(nombre);
        this.muestras = muestrasx;
    }

    public void run() {
        int i = 0;
        do {
            i = muestras.adquirirDato(getName()); // adquirir datos
        } while (muestras.index < muestras.longitud);
    }
}