class Numar_prim{
private int x;
private int verificare(int x)
{
int d;
if(x<2)
return 0;
else
for(d=2;d<=x/2;d++)
if(x%d==0)
return 0;
return 1;
}
public void setter(int n)
{this.x=n;
}
public int rezultat()
{return verificare(x);
}
}


