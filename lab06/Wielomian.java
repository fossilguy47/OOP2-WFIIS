public class Wielomian{
    double a =0;
    double b = 0;
    double c = 0;
    public Wielomian(double _a, double _b, double _c){
        a =_a;
        b = _b;
        c = _c;
    }

    public Wielomian(double _a, double _b){
        a =_a;
        b = _b;
    }

    public Wielomian(double _a){
        a =_a;
    }

    public String toString(){
        String result="";
        if(a!=0){
            result += a + "x^2";
        }
        if(b!=0){
            result += " + " + b + "x";
        }
        if(c!=0){
            result +=" + " +  c;
        }
        return result;
    }

    public void setABC(double _a, double _b, double _c){
        a = _a;
        b = _b;
        c = _c;
    }

    public double getAtX(double x){
        double result;
        result = a*x*x + b*x + c;
        return result;
    }

    public double integral(double x1, double x2){
        double result;
        result = (a*x1*x1*x1/3 + b* x1*x1/2 + c*x1) - (a*x2*x2*x2/3 + b* x2*x2/2 + c*x2); 
        return result;
    }




}