public class fibonacci {
public static void main (String args[]){
int a=0, b=1;
int c=0;
System.out.println("fibonacci series is : "+a);
for(int i=0;i<15;i++){
c=a+b;
a=b;
b=c;
System.out.println("fibonacci series is :" +c);
}

}
}
