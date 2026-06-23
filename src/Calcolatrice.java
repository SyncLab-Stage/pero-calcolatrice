public class Calcolatrice {
    public double somma(double a, double b){

        return a + b;
    }

    public double sottrazione(double a, double b){

        return a - b;
    }

    public double moltiplicazione(double a, double b){

        return a * b;
    }

    public double divisione(double a, double b) throws DivisionePerZeroException {
        if (b == 0){
            throw new DivisionePerZeroException("Impossibile dividere per zero");
        }
        return a / b;
    }
}
