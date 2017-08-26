package reverse;

public class Stack {
	private int maxSize;
	private char [] stackArray;
	private int top;
	
	
	public Stack(int size){
		this.maxSize = size;
		this.stackArray = new char [maxSize];
		this.top = -1;
	}
	
	public void push(char j){
		if(!isFull()){
			top++;
			stackArray[top] = j;
		}
		else{
			System.out.println("Stack is Full");
		}
	}
	
	public char pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return '0';
		}
		else {
		int new_top = top;
		top--;
		return stackArray[new_top];
		}
		
	}
	//return char, because i am returning the char in the stackArray located where top is pointing 
	public char peak(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return(top == -1);
	}
	
	public boolean isFull(){
		return(maxSize-1 == top);
	}
	
	
}
