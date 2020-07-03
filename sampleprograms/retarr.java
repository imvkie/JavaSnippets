package sample_programs;

public class retarr {
    public static int[] arr()
    {
    	int a[] = {1,2,3,4,5,6};
    	return a;
    }
	public static void main(String[] args) {
		int a1[] =arr();
		for(int i=0;i<=5;i++)
			System.out.println(a1[i]);
	}

}
