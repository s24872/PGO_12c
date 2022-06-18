package interfaces;

public interface Fun {
    double f(double x);

    static double minimum(Fun func, double a, double b, double alpha) {
        if(a > b){
            throw new RuntimeException("Parametr 'a' nie może być większy od 'b'!");
        }

        double minimum = Double.MAX_VALUE;

        for (double i = a; i <= b; i += alpha){
            double value = func.f(i);

            if(value < minimum){
                minimum = value;
            }
        }

        return minimum;
    }
}
