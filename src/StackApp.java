 import java.util.Scanner;
 class StackX {
     private int maxSize; //size of stack array
     private double[] stackArray;
     private int top; //top of the stack

     public StackX(int s){
         maxSize = s;  //set array size
         stackArray = new double[maxSize];
         top = -1; //no items
     }

     public void push(double j){
       // top++;
       if (isFull()){
         System.out.println("Stack is full");
       }
       else
         stackArray[++top] = j;
     
     }

     public double pop(){
         if(isEmpty()){
           return -99;
         }
         else
             return stackArray[top--];
     }

     public double peek(){
         if(isEmpty()){
           return -99;
         }
         else
             return stackArray[top];

     }

     public boolean isEmpty(){
         if(top == -1)
             return true;
         else
             return false;
     }

     public boolean isFull(){
         return (top == maxSize - 1);
     }
 }


 public class StackApp{
     public static void main(String[] args){
         StackX st = new StackX(7); //ans i

         st.push(20); //ans ii
         st.push(43); //ans ii
         st.push(12); //ans ii
         st.push(37); //ans ii
         
         for(int i = 0; i<7 ; i++) {
        	 System.out.print(st.pop() + " ");
         }
    
         Scanner input = new Scanner(System.in);
         System.out.println("Enter integer: ");
         double num = input.nextDouble();

         boolean found = false;
         StackX tempStack = new StackX(7);

         while(!st.isEmpty()){
             double value = st.pop();
             if(value == num){
                 found = true;
             }
             tempStack.push(value);
         }

//         if(!tempStack.isEmpty()){
//             st.push(tempStack.pop());
//         }

         if(found){
             System.out.println("Number " + num + "exists in the stack. ");
         }else{
             System.out.println("Number " + num + "does not exists in the stack. ");
         }
         
         for(int i = 0; i<7 ; i++) {
        	 System.out.println("jk " + i + " " +tempStack.pop());
         }
     }
 } 

