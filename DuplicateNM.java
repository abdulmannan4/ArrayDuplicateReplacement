//as we are replacing duplicate value with 2
public class DuplicateNM
{
public static void main(String args[])
{
int[] x={10,20,10,30,20,10,2};
for(int i=0;i<x.length;i++)
{
int key=x[i];
for(int j=i+1;j<x.length;j++)
{
if(key == x[j])
{
x[j]=2;
}
}
}
for(int i=0;i<x.length;i++)
{
System.out.print(x[i] + " ");
}
}
}