1.Dispay Message
public class displaymsg {

	public static void main(String[] args) {
			System.out.println("Hola everyone");
		}

}
Output:
Hola everyone

2.Display default value of primitive datatype
public class DefaultValues {
	static boolean b;
	static float f;
	static double d;
	static int i;
	static long l;
	static String s;

	public static void main(String[] args) {
		System.out.println("Boolean value is: " + b);
		System.out.println("Float value is: " + f);
		System.out.println("double value is: " + d);
		System.out.println("int value is: " + i);
		System.out.println("long value is: " + l);
		System.out.println("String value is: " + s);

	}

}
Output:
Boolean value is: false
Float value is: 0.0
double value is: 0.0
int value is: 0
long value is: 0
String value is: null

3.check String
public class CheckString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1: "); //taking input from user
		String str1 = sc.nextLine();
		System.out.println("Enter the string 2: "); //taking input from user
		String str2 = sc.nextLine();
		
		//comparing string
		if(str1.equals(str2)) {
			System.out.println("Str1 is equal to str2");
		}
		else {
			System.out.println("str1 is not equal to str2");
		}
	}
}
Output:
Enter the string 1: 
akshu
Enter the string 2: 
akshu
Str1 is equal to str2

4.Increment and Decrement Operator
public class Increment {

	public static void main(String[] args) {
		int x = 21;
		int y = ++x;
		System.out.println("x: " + x + "y: " + y);

		int a = 21;
		int b = a++;
		System.out.println("a: " + a + " " + "b: " + b);

		int p = 5;
		int q = 4;
		int s = --p;
		int t = q--;
		System.out.println("p:" + p);
		System.out.println("q:" + q);
		System.out.println("s:" + s);
		System.out.println("t:" + t);

	}

}
Output:
x: 22y: 22
a: 22 b: 21
p:4
q:3
s:4
t:4

5.Bitwise Operator
a) public class bitwiseand   
{   
public static void main(String[] args)   
{   
int x = 5, y = 4;   
// bitwise and   
// 1001 & 1000 = 1000 = 8  
System.out.println("x & y = " + (x & y));   
}  
}
Output:
x & y = 4

b)public class BitwiseCompliment  
{   
public static void main(String[] args)   
{   
int x = 5;   

System.out.println("~x = " + (~x));   
}  
}
Output:
~x = -6

c)public class BitwiseInclusiveOr 
{   
public static void main(String[] args)   
{   
int x = 4, y = 7;   
 
System.out.println("x | y = " + (x | y));   
}  
}
Output:
x | y = 7

d)public class BitwiseXor  
{   
public static void main(String[] args)   
{   
int x = 7, y = 6;   
 
System.out.println("x ^ y = " + (x ^ y));   
}  
}
Output:
x ^ y = 1

6.Arithmatic Operators
a)Addition Operators
public class Add {
	public static void main (String[] args) {
		int num1 =10;
		int num2 = 20;
		int sum;
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		sum = num1 + num2;
		System.out.println("Sum is: "+sum);
		
	}
}
Output:
num1: 10
num2: 20
Sum is: 30

b)Subtraction Operator
public class Sub {
	public static void main(String args[]) {
		int num1 = 20;
		int num2 = 10;
		int sub;
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		sub = num1 - num2;
		System.out.println("Subtraction: "+sub);
	}
}
Output:
num1: 20
num2: 10
Subtraction: 10

c)Multiplication Operator
public class mutl {
	public static void main(String args[]) {
		int num1 = 20;
		int num2 = 5;
		int mult;
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		mult = num1 * num2;
		System.out.println("Multipication: "+mult);
	}
}
Output:
num1: 20
num2: 5
Multipication: 100

d)Division Operator
public class Div {
	public static void main(String args[]) {
		int num1 = 150;
		int num2 = 5;
		int div;
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		div = num1 / num2;
		System.out.println("division:"+div);
	}
	
}
Output:
num1: 150
num2: 5
division:30

e)Modulus Operator
public class Mod {
	public static void main(String args[]) {
		int num1 = 5;
		int num2 = 3;
		int mod;
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		mod = num1 % num2;
		System.out.println("Remainder: "+mod);
	}
}
Output:
num1: 5
num2: 3
Remainder: 2

7.Relational Operator
a)Equal to
public class Equalto {
	public static void main(String[] args)
    {
        int var1 = 5, var2 = 10, var3 = 5;
 
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        System.out.println("var1 == var2: "
                           + (var1 == var2));
 
        System.out.println("var1 == var3: "
                           + (var1 == var3));
    }

}
Output:
Var1 = 5
Var2 = 10
Var3 = 5
var1 == var2: false
var1 == var3: true

b)Not Equal To
public class NotEqualTo {
	public static void main(String[] args)
    {
        int var1 = 5, var2 = 10, var3 = 5;
 
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        System.out.println("var1 == var2: "
                           + (var1 != var2));
 
        System.out.println("var1 == var3: "
                           + (var1 != var3));
    }
}
Output:
Var1 = 5
Var2 = 10
Var3 = 5
var1 == var2: true
var1 == var3: false

c)Greater than
public class GreaterThan {
	public static void main(String[] args)
    {
        int var1 = 30, var2 = 20, var3 = 5;
 
        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        System.out.println("var1 > var2: " + (var1 > var2));
 
        System.out.println("var3 > var1: "
                           + (var3 >= var1));
    }
}
Output:
Var1 = 30
Var2 = 20
Var3 = 5
var1 > var2: true
var3 > var1: false


d)Less Than
public class LessThan {
	public static void main(String[] args)
    {
        int var1 = 10, var2 = 20, var3 = 5;
 
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        System.out.println("var1 < var2: " + (var1 < var2));
 
        System.out.println("var2 < var3: " + (var2 < var3));
    }
}
Output:
Var1 = 10
Var2 = 20
Var3 = 5
var1 < var2: true
var2 < var3: false

d)Greater than Equal to
public class greaterEqual {
	public static void main(String[] args)
    {
        int var1 = 20, var2 = 20, var3 = 10;
 
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        System.out.println("var1 >= var2: "
                           + (var1 >= var2));
 
        System.out.println("var2 >= var3: "
                           + (var3 >= var1));
    }
}
Output:
Var1 = 20
Var2 = 20
Var3 = 10
var1 >= var2: true
var2 >= var3: false

e)Less than Equal to
public class LessEqual {
	public static void main(String[] args)
    {
        int var1 = 10, var2 = 10, var3 = 9;
 
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        System.out.println("var1 <= var2: "
                           + (var1 <= var2));
 
        System.out.println("var2 <= var3: "
                           + (var2 <= var3));
    }
}
Output:
Var1 = 10
Var2 = 10
Var3 = 9
var1 <= var2: true
var2 <= var3: false

8.Conditional Operator
public class ConditionalOperator 
{  
public static void main(String args[])   
{  
int x=6, y=3, z=9;  
System.out.println(x>y && x>z || y<z);  
System.out.println((x<z || y>z) && x<y);  
}  
}

Output:
true
false

9.If Statement
public class IfelseIfLadder {

	public static void main(String[] args) {
		int a = 53;
		
		if(a>80) {
			System.out.println("A grade");
		}
		else if(a>70) {
			System.out.println("B grade");
		}
		else if(a>60) {
			System.out.println("C grade");
		}
		else if(a>50) {
			System.out.println("D grade");
		}
		else {
			System.out.println("F");
		}

	}

}

Output:
D grade

10.Switch Statement
public class IfelseorSwitch {

	public static void main(String[] args) {
		
		//Switch statement
		char letter = 'I';
		
		switch(letter)
		{
		case 'A':
		case 'E':
			System.out.println("this is an Vowel");
			break;
		case 'B':
		case 'C':
		case 'D':
			System.out.println("this is an alphabet");
			break;
		case '@':
		case '#':
			System.out.println("this is an special charater");
			break;
		default:
			System.out.println("this is just an alphabet");
		}

	}

}

Output:
this is just an alphabet

11.for Loop
public class ForLoop {

	public static void main(String[] args) {
		
		int input = 40;
		for(int i = input; (i == input || ((i-1)%10!=0)); i++)
		{
			System.out.println(i);
		}

	}

}

Output:
40

12.while loop
public class While {

	public static void main(String[] args) {
		int x = 5;
		while(x >=0)
		{
			System.out.println("x = "+ x);
			--x;
		}

	}

}

Output:
x = 5
x = 4
x = 3
x = 2
x = 1
x = 0

13.Do Statement
public class DoWhileDemo {

	public static void main(String[] args) {
		int x = 6;
		do
		{
			System.out.println("The x value is: "+ x);
			--x;
		}while(x >=0);

	}

}

Output:
The x value is: 6
The x value is: 5
The x value is: 4
The x value is: 3
The x value is: 2
The x value is: 1
The x value is: 0

14.find the length of array
public class ArrayLength {
	public static void main(String[] args) {
		int[] array = new int[4];

		System.out.println("the lenght of array is: " + array.length);
	}
}

Output:
the lenght of array is: 4

15.One Dimensional Array
public class OneDimentionalArray {

	public static void main(String[] args) {
		int[] number;

		number = new int[5];

		number[0] = 0;
		number[1] = 1;
		number[2] = 2;
		number[3] = 3;
		number[4] = 4;

		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}

}

Output:
0
1
2
3
4

16.Two Dimensional Array
public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] a = { { 10, 20 }, { 30, 40 }, { 50, 60 } };

		System.out.println("Two Dimensional Array is: ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(a[i][j]);
			}
		}

	}

}

Output:
Two Dimensional Array is: 
10
20
30
40
50
60

17.Multi Dimensional Arrat
public class MuliDimensionalArray {
	public static void main(String[] args) {

		int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				for (int z = 0; z < 2; z++)
					System.out.println("arr[" + i + "][" + j + "][" + z + "] = " + arr[i][j][z]);
	}
}

output:
arr[0][0][0] = 1
arr[0][0][1] = 2
arr[0][1][0] = 3
arr[0][1][1] = 4
arr[1][0][0] = 5
arr[1][0][1] = 6
arr[1][1][0] = 7
arr[1][1][1] = 8

18.Sum of command line argument
public class CommandLineSum {

	public static void main(String a[]) {
		int sum = 0;
		int invalid = 0;

		for (int i = 0; i < a.length; i++) {
			try {
				sum += Integer.parseInt(a[i]);
			} catch (NumberFormatException e) {
				invalid++;
			}
		}
		System.out.println("Total no.: " + a.length);
		System.out.println("Invalid Integer: " + invalid);
		System.out.println("Sum: " + sum);

	}

}

Output:
Total no.: 0
Invalid Integer: 0
Sum: 0

19.public class CommandLine {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

	}

}

Output:
akshu