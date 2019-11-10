public class BinaryChar
{
public static void main(String[] args)
{
char array[]={'a','b','c','d','e''};
int srch= 'd';
int li=0; // least index
int hi =a.length-1; // high index
int mi=(li+hi)/2;
while(li<=hi)
{
if (a[mi]==srch)
{
System.out.println("Element is at "+mi+" index position");
}
else if (a[mi]<srch)
{
li=mi+1;
}
else{
hi=mi-1;
}
mi=(li+hi)/2;
}
if(li>hi)
{
System.out.println("Element not found");
}
}
