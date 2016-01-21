public class Main {
    
    private String file = "";
    
    public static void main(String[] args) {
        
        System.out.println("Starting program!");
        
        printHello();
        
    }
    
    private void printHello() {
        
        System.out.println(returnHello());
        
    }
    
    // other comments
    public String returnHello() {
        
        return "Hello World!";
        
    }
     
}