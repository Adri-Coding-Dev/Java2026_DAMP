package ecuaciones_segundo_grado;
import java.util.*;
public class Ecuacion_Segundo_Grado {
	public static void main(String[] args) {
		float a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Calculador de ecuaciones de segundo grado");
		System.out.println("FORMULA: ax²+bx+c=0");
		System.out.println("Introduce el valor de a:");
		a=s.nextFloat();
		System.out.println("Introduce el valor de b: ");
		b=s.nextFloat();
		System.out.println("Introduce el valor de c: ");
		c=s.nextFloat();
		
		ecuacion_grado2(a,b,c);
		s.close();
	}

	private static void ecuacion_grado2(float a, float b, float c) {
		double resultado_x_1=(((-1*b)+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a));
		double resultado_x_2=(((-1*b)-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a));
		System.out.println("Resultado positivo: "+resultado_x_1);
		System.out.println("Resultado negativo: "+resultado_x_2);
	}
}
