public class methodoverloading {
    int add(int a, int b)
{
int sum = a+b;
return sum;
}
//adding three integer numbers
int add(int a, int b, int c)
{
int sum = a+b+c;
return sum;
}
double add(double a, double b)
{
double sum = a+b;
return sum;
}
public static void main(String args[])
{
    methodoverloading obj = new methodoverloading();
System.out.println(obj.add(10, 20));
System.out.println(obj.add(10, 20, 30));
System.out.println(obj.add(10.4,20.3));
}
}

