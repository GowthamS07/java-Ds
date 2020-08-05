 class A
 {
 public void methodA()
 {
 System.out.println("Base class method");
 }
 }

 class Single_In extends A
 {
 public void methodB()
 {
 System.out.println("Child class method");
 }
 public static void main(String args[])
 {
 Single_In obj = new Single_In();
 obj.methodA();
 obj.methodB();
 }
 }
