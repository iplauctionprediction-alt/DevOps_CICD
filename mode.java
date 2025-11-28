import java.util.*;

class main{
   public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++){
		arr[i] = sc.nextInt();
	}
	int maxcount = 0;
	int val = arr[0];
	for(int k=0;k<n;k++){
		int count = 0;
		for(int j=0;j<n;j++){
			if(arr[j]==arr[k]){
				count++;
			}
		}
		if(count > maxcount){
			maxcount=count;
			val = arr[k];
		}
		else if(maxcount == count){
			continue;
		}
	}
	System.out.println(val);
   }
}
