import java.util.Scanner;

public class intercambiaValores {

    public static void main(String[] args) {

        int a,b,c,d,e,f;

        Scanner sc=new Scanner(System.in);

        System.out.println("Escribe el valor a,b y c");

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=a;
        e=b;
        f=c;

        b=d;
        a=f;
        c=e;

        System.out.println("a es: "+a+"\nb es: "+b+"\nc es: "+c);

    }

}
