public class Perimetro {

    public static float distanciaCartesiana(int xa, int ya, int xb, int yb){
        float distancia;
        
        distancia = (float) Math.sqrt((xb-xa)*(xb-xa)+(yb-ya)*(yb-ya));
       

        return distancia;
    }
    public static float trianguloPerimetro(int x0, int y0, int x1, int y1, int x2, int y2){
        float perimetro;
        perimetro = distanciaCartesiana(x0,y0,x1,y1) + 
                    distanciaCartesiana(x1,y1,x2,y2) +
                    distanciaCartesiana(x2,y2,x0,y0);

        return perimetro;
    }




     public static void main(String[] args) {
        int x0=0;
        int y0=0;
        int x1=1;
        int y1=1;
        int x2=1;
        int y2=0;

        System.out.println(trianguloPerimetro(x0, y0, x1, y1, x2, y2));

       int xa=1;
       int xb=1;
       int ya=1;
       int yb=3;

        System.out.println(distanciaCartesiana(xa, ya, xb, yb));

        
    }
    
}
