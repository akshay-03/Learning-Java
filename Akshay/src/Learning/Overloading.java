package Learning;

public class Overloading {

	
		public int sum(int x, int y) {
			
			int a = x + y;
			return a;
		}
		
		
		public int sum(int x, int y, int z) {
			
			int b = sum(x,y);
			int c = b+z;
			return c;
			
		}
		
		public int sum(int w, int x, int y, int z) {
			
			int a = sum(w,x,y);
			int b = a+z;
			return b;
			
		}
		
		public int sum(int v, int w, int x, int y, int z) {
			
			int a = sum(v,w,x,y);
			int b = a+z;
			return b;
			
		}
		
		public int sum(int u, int v, int w, int x, int y, int z) {
			
			int a = sum(u,v,w,x,y);
			int b = a+z;
			return b;
			
		}
		
		
		
		public static void main(String[] args) {
			
			int a = 1;
			int b = 2;
			int c = 3;
			int d = 4;
			int e = 5;
			int f = 7;
			
			Overloading test = new Overloading();
			
			System.out.println(test.sum(a,b));
			System.out.println(test.sum(a,b,c));
			
			System.out.println(test.sum(a,b,c,d));
			System.out.println(test.sum(a,b,c,d,e));
			System.out.println(test.sum(a,b,c,d,e,f));
			
			
		}
		
}
