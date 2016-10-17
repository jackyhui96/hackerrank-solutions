//Write your code here

class Calculator {
    public Calculator() {
        
    }
    
    public int power(int n, int p) throws Exception {
        int result = 0;

        if(n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        else {
            result = (int)Math.pow((double)n, (double)p);
        }

        return result;
    }
}