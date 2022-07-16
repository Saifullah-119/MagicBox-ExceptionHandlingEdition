class MagicBox
{
	public static void main(String arg[])
	{
		int size=Integer.parseInt(arg[0]);
		int[][] arr= new int[size][size];
		int lim=size-1;
		int half=lim/2;
		int row=0;
		int col=half;
		int n=1;
		arr[row][col]=n;
		n++;
		row--;
		col++;
		try
			{for(;n!=(size*size);n++,row--,col++)
		{
			
			if(row<0)
				row=lim;
			if(col>lim)
				col=0;
			if(row==6&&col==-1)
			{
				row=1;
				col=4;
			}
			if(row<0&&col>lim)
			{
				row=1;
				col=lim;
			}
			if(arr[row][col]!=0)
			{
				row+=2;
				col--;
				arr[row][col]=n;
				continue;
			}
			
				arr[row][col]=n;
			
		}}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("row: "+row+"col: "+col+"n: "+n);
			}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]+"\t");
			System.out.println();
		}
	}
}