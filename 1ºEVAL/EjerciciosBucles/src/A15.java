import java.util.Scanner;

public class A15 {

    public static void main(String[] args) {

        double a,b,c,d,e,f,x,y;

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce a");
        a=sc.nextDouble();

        System.out.println("introduce b");
        b=sc.nextDouble();

        System.out.println("Introduce c");
        c=sc.nextDouble();

        System.out.println("introdice d");
        d=sc.nextDouble();

        System.out.println("introduce e");
        e=sc.nextDouble();

        System.out.println("Introduce f");
        f= sc.nextDouble();

        x=((c*e)-(b*f))/((a*e)-(b*d));

        y=((a*f)-(c*d))/((a*e)-(b*d));

        System.out.println("x= "+x+"\ny= "+y);

    }

}
