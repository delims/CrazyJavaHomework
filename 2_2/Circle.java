public class Circle
{
	public static void main(String[] args)
	{
		if (args.length == 0) {
			System.out.println("请输入参数");
		} else {
			int r = Integer.parseInt(args[0]);
			System.out.println("你输入的半径是 " + r);
			if (r < 0) {
				System.out.println("请输入正数");
			} else {
                int wordLength = 2;
				for ( int i = 0 ; i <= 2*r; i ++) {
                    int row = i ;
                    if (row > r) {
                        row = r - (i - r);
                    }
                    int d = (int)(Math.sqrt(r * r - (r-i) * (r-i)) + 0.5);
                    
                    for (int j = 0; j < (r-d) * wordLength; j ++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int j = 0; j < 2 * d * wordLength; j ++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");

                    System.out.print("\n");
				}	
			}	
		}
	}
}
