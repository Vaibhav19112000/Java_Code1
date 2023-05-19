import java.util.Scanner;
public class Array2d 
{
	private int arr[][];
	private int arr1[];
	
	public Array2d()
	{
		
		Scanner sc = new Scanner(System.in);
		arr=new int[3][3];
		int row=arr.length;
		int col=arr.length;
		System.out.println("Enter 9 array element :: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				
			{
				arr[i][j]=sc.nextInt();
			}
		}
	}
	public void addCol()
	{
		int sumCol;
	    for(int i = 0; i <arr.length; i++){  
        sumCol = 0;  
        for(int j = 0; j < arr.length; j++){  
          sumCol = sumCol + arr[j][i];  
        }  
        System.out.println("Sum of " + (i+1) +" column: " + sumCol);  
    }
	}
	public void addRow()
	{
		int sumRow;
		for(int i = 0; i < arr.length; i++){  
            sumRow = 0;  
            for(int j = 0; j < arr.length; j++){  
              sumRow = sumRow + arr[i][j];  
            }  
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);  
        }  
	}

}
