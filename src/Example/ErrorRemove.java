package Example;

import java.util.ArrayList;
import java.util.List;

public class ErrorRemove {
public static void main(String args[])
{
	int a = 10;
	int b=20;
	System.out.println("values of a ::- "+a+" values of B ::- "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("New values replace a to( --> ) b "+a);
	System.out.println("New Values replace b to (-->) a "+b);
}

}
