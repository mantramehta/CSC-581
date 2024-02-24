
	public class MathUtils {
	    public int add(int x, int y) {
	        return x + y;
	    }

	    public int subtract(int x, int y) {
	        return x - y;
	    }

	    public int multiply(int a, int b) {
	        return a * b;
	    }

	    public double divide(int a, int b) {
	        if (b == 0) {
	            return -1.0; // Handling division by zero
	        }
	        return (double) a / b;
	    }
	}