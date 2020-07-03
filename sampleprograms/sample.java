package sample_programs;

public class sample {


		public static void main(String[] args) {
		    
		    int [][]a ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}} ;
		    System.out.println("Row "+a.length);
		    for(int i=0;i<a.length;i++){
		        System.out.println("Column "+i+"th "+a[i].length);
		    }
		    for(int i=0;i<a.length;i++){
		        for(int j=0;j<a[i].length;j++){
		            System.out.print(a[i][j]+" ");
		        }
		    }
		    System.out.println();
		    for(int i=0;i<a.length+1;i++){
		        if(i%2==0){
		        for(int j=0;j<a.length;j++){
		            System.out.print(a[j][i]+" ");
		        }
		    }
		    else{
		        for(int j=a.length-1;j>=0;j--){
		            System.out.print(a[j][i]+" ");

		        }
		    }
		}
		    }
}

