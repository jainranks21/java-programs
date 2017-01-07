public class swap{
public static void main (String args[]){
int a=5,b=9;
System.out.println("value of a before swap is : " + a);
System.out.println("value of b before swap is : " + b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("value of a after swap is : " + a);
System.out.println("value of b after swap is : " + b);
}

}
