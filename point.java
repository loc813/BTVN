// import java.util.Scanner;
// import java.lang.Math;

// public class point {
//     double x;
//     double y;
//     public static void main(String[] args){
//         point p1 = new point();
//         point p2 = new point();
//         Scanner sc = new Scanner(System.in);
//         p1.x = sc.nextDouble();
//         p1.y = sc.nextDouble();
//         p2.x = sc.nextDouble();
//         p2.y = sc.nextDouble();
//         System.out.println("Khoang cach giua hai diem la: " + Math.sqrt((p2.x - p1.x)*(p2.x - p1.x) + (p2.y - p1.y)*(p2.y - p1.y)));
//     }
// 

import java.util.Scanner;
import java.lang.Math;

public class point{
    double x;
    double y;
    
   point(){}

    point(point p){
        this.x = p.x;
        this.y = p.y;
    }
    
    void show(){
        System.out.println("Toa do cua diem la : " + "(" + x  + ", " + y + ")");
    }
    double show(double x , double y , double x1 , double y1 ){
        return Math.sqrt((x1 - x) * (x1 - x) + (y1-y)*(y1-y));
    }

    boolean compare(point a ){
        if(this.x == a.x && this.y == a.y){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        point p1 = new point();
        point p2 = new point(p1);
        point p3 = new point();
        Scanner sc = new Scanner(System.in);
        p1.x = sc.nextDouble();
        p1.y = sc.nextDouble();
        p2.x = sc.nextDouble();
        p2.y = sc.nextDouble();
        p1.show();
        System.out.println("--------------------------");
        p2.show();
        System.out.println("--------------------------");
        if(p1.compare(p2) == true){
            System.out.println("Hai diem trung nhau");
        }else{
            System.out.println(p3.show(p1.x , p1.y , p2.x , p2.y));
        }
    }
}