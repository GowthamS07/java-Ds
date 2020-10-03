import java.util.Scanner;
class Stack
{
	int top;
	int maxsize;
	int[] arr;

	Stack()
	{
		top = -1;
		maxsize = 10;
		arr = new int[maxsize];
	}
	
	void push (Scanner sc)
	{
		if(top == maxsize-1)
		{
			System.out.println("Overflow !!");
		}
		else
		{
			System.out.println("Enter Value");
			int val = sc.nextInt();
			top++;
			arr[top]=val;
			System.out.println("Item pushed");
		}
	}

	void pop ()
	{
		if (top == -1)
		{
			System.out.println("Underflow !!");
		}
		else
		{
			System.out.println("Item popped is "+arr[top]);
			top --;
		}
	}

	void display ()
	{
		System.out.println("Printing stack elements .....");
		if(top==-1){
			System.out.println("No elemets in the stack");
		}
		for(int i = top; i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}

public class Stack_Operations {

	public static void main(String[] args) {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		System.out.println("\n*********Stack operations using array*********");
		System.out.println("\n------------------------------------------------\n");
		while(choice != 4)
		{
			System.out.println("\nChoose one from the below options...");
			System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");
			System.out.print("\nEnter your choice \t");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:	s.push(sc); 
						break;
				case 2: s.pop();
						break;
				case 3:	s.display(); 
						break;
				case 4: System.out.println("Exiting....");
						System.exit(0);
						break;
				default: System.out.println("Please Enter valid choice ");
			}
		}
	}
}
