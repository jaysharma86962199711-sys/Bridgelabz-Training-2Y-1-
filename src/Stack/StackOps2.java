package Stack;

public class StackOps2 {
        int arr[] = new int[5];
        int top = 0;

        public void push(int data){
            if(top==arr.length){
                System.out.println("Stack is full");
                return;
            }
            arr[top]=data;
            top++;

        }
        public void display(){
            for(int n : arr){
                System.out.println(n + " ");
            }
        }
        public int pop(){
            int data;
            top--;
            data=arr[top];
            arr[top]=0;
            return data;
        }
}

