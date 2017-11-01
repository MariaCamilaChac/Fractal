public class Fractal {
	
	public int  [][] matrix;
	public int  [] rule = { 0, 1, 0 ,0 , 1, 1, 0, 1};
	
	public Fractal( int width,int heigth, int rule){
		
		this.matrix = new int [width][heigth];
		
		this.initialize(width);
		
		this.generateFractal();
	}
	
	private void initialize (int width){
		for (int j = 0; j < matrix.length; j++) {
			
			this.matrix[0][j] = Math.random() < 0.8 ? 0 : 1 ;
		}
		
	}
	
	public void binaryRule(int rule, int index){
		
		if (rule > 1) 
			if (rule > Math.pow(1, 7 - index)) {
				
				this.rule [index] = 1;
				rule -= Math.pow(2, 7 - index); 
		
			}	 
			else
				this.rule[0] = rule;
	}
			
	public void generateFractal (){
		
		int n = this.matrix[0].length;
		int m = this.matrix.length;
		
		for (int i = 1; i < m; i++) {
			
			for (int j = 0; j < n; j++) {
				
				this.matrix[i][j]= this.rule [( 4 * this.matrix [i - 1][(j - 1 + n) % n] ) +
						           (2 * this.matrix [i - 1][j]) + (1 * this.matrix [i - 1][(j + 1)%n])];	
					
			}
			
			for (int j = 0; j < matrix.length; j++) {
				
				this.matrix[0][j] = this.rule [ (this.matrix[m - 1][(j - 1 + n) % n]) + ( 2 * this.matrix [m - 1][j])+
				                                (4 * this.matrix [m - 1][j + 1]) % n];
			}
			
			
		}
	}


}
