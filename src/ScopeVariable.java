 // 1.
 class ClassScope {
     int a = 10;  // memeber variable-that belong to class or object
     int b = 200;

     int add() {
         return a + b;
     }

   //2.
   void MethodScope() {
         int p = 80;
         int q = 90;
     }
/* int NextmethodScope(){
     return p+q; // red because p,q are of different method and it dont know what is p,q
// here declare again p,q if want to use
 } */

    //3.
    void blockScope() {
         int y = 10;
         System.out.println(a);
// can be not but not y and it is in block scope     {
         {
              y = 87;
             System.out.println(y); // can access as it is inside block
         }
         // System.out.println(y); // cant access
     }
 }


public class ScopeVariable {
    public static void main(String[] args){
        ClassScope obj=new ClassScope();
  System.out.println(obj.add());
   // Scope.add(); // when add is static only then write with class
        obj.blockScope();
    }
}
