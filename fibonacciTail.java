class FibonacciTail{
	public static long fib(int n)
	{
		int index1 = 0;
		int index2 = 1;
		fib(n, index1, index2);
	}

	private static long fib(int n, int r1, int r2)
	{
		if(n == 0)
		{
			return r1;
		}

		if(n == 1){
			return r2;
		}

		return fib(n-1, r2, r1+r2);
	}

	public static void main(String[] args){
		int x = 3;
		System.out.println(fib(x));
	}
}