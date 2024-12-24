class Calculator{
String brand="Casio";
int price=1000;
int add()
{
int a=10,b=20;
int c=a+b;
return c;
}
int sub()
{
int a=100,b=20;
int c=a-b;
return c;
}
int mul()
{
int a=10,b=20;
int c=a*b;
return c;
}
int div()
{
int a=100,b=20;
int c=a/b;
return c;
}
int mod()
{
int a=10,b=20;
int c=a%b;
return c;
}
public static void main(String [] args){
Calculator c=new Calculator();
System.out.println("brand:"+c.brand);
System.out.println("price:"+c.price);
System.out.println("add:"+c.add());
System.out.println("sub:"+c.sub());
System.out.println("mul:"+c.mul());
System.out.println("div:"+c.div());
System.out.println("mod:"+c.mod());
}
}