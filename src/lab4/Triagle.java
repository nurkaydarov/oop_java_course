package lab4;

public class Triagle {
    private double a, b,c,p;

    public Triagle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean existsTriagle(){
        return ((this.a + this.b < this.c) || (this.b + this.c > this.a) || (this.c + this.a > this.b));
    }

    public void toShowInfo(){
        System.out.println("1-я сторона " + this.a);
        System.out.println("2-я сторона " + this.b);
        System.out.println("3-я сторона " + this.c);
    }

    public double getPerimetr(){

        return this.p = this.a + this.b + this.c;
    }

    public void showDegree(){
        double A = Math.acos(Math.pow(this.b, 2) + Math.pow(this.c, 2) - Math.pow(this.a, 2)) / (2 * this.b * this.c);
        double B = Math.acos(Math.pow(this.a, 2) + Math.pow(this.c, 2) - Math.pow(this.b, 2)) / (2 * this.a * this.c);
        double C = Math.acos(Math.pow(this.b, 2) + Math.pow(this.a, 2) - Math.pow(this.c, 2)) / (2 * this.b * this.a);
        System.out.println("Угол В "+ B);
        System.out.println("Угол A "+ A);
        System.out.println("Угол C "+ C);
    }



}
