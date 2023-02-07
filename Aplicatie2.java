import java.util.Scanner;

class Numar extends Numar_prim{
public void comentariu(){
System.out.println("A fost mostenita clasa \"Numar_prim\"");
}
}

public class Aplicatie2{

public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Introduceti numarul pe care doriti sa-l verificati daca este prim sau nu: ");
n=s.nextInt();
Numar v=new Numar();
v.setter(n);
v.comentariu();
if(v.rezultat()==1)
System.out.println("Nr este prim!");
else
System.out.println("Nr nu este prim!");
}
}




