import java.util.Stack;
    
    public class stackExample{
    	//created a class to handle the stack position, if the stack position is 1, it will return house
    	//else it will return yard
    	public static String farmPosition(int x){
    		String place= new String();
    		//assigns house to place if equal to 1
    		if (x == 1){
    			place="house";
    		}
    		//assigns place to yard for everything except 1
    		else {
    			place = "yard";
    		}
    		return place;
    	}
        
        public static void main (String[] args){
            
            //first I will have to create the stack
            Stack<String> aStack = new Stack<>();
            
            //adding elements to my stack
            aStack.push("Goat");
            aStack.push("Dog");
            aStack.push("Cow");
           
           //functions for popping and peeking at the stack
           String animalLost = aStack.pop();
           String whichAnimal = aStack.peek();
           
           //checking if the elements are in the stack, in order
           System.out.println("These are all the animals on my farm: "+ aStack);
           //checks the next element that will be popped, without popping it
           System.out.println("There is a high chance that I will lose a "+ whichAnimal+ "! I better be more careful.");
           //prints out the element of the list that will be popped, and pops it
           System.out.println("Oh no, I have lost a " + animalLost+".");
           //prints out the size of the stack after popping an element
           System.out.println("I am now left with "+ aStack.size() + " animals on my farm.");
           //Checks the contents of the stack
           System.out.println("Only left with "+aStack);
           //Checks if the stack is empty
           System.out.println("Is my farm empty? "+ aStack.empty());
           //finds the position of Dog in the stack
           System.out.println("Where is my dog? It is in the "+ farmPosition(aStack.search("Dog")) + ".");
           
        }
    }