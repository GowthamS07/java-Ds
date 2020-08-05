class X
 {
 public void methodX()
 {
 System.out.println("class X method");
 }
 }
 class Y extends X
 {
 public void methodY()
 {
 System.out.println("class Y method");
 }
 }
 class Multi extends Y
 {
 public void methodMain()
 {
 System.out.println("class Main method");
 }
 public static void main(String args[])
 {
 Multi obj = new Multi();
 obj.methodX();
 obj.methodY();
 obj.methodMain();
 }
 }
