import java.util.*;
class Min_Swap_Array{
		public static void main(String [] args){
		
		int [] arr = {1,4,3,2};
		boolean [] isVisited=new boolean[arr.length+1];
		HashMap<Integer,Integer> hsh = new HashMap<>();
		for(int i=1;i<isVisited.length;i++)
		{
			hsh.put(i,arr[i-1]);
		}
		System.out.println(hsh);
		
		
		int countSwap=0;
		for(int k=1;k<=hsh.size();k++)
		{
			int nextNode;
			if(isVisited[k]==false){
			if(k==hsh.get(k))
			{
				continue;
			}else{
				int c=hsh.get(k);
				while(!isVisited[c])
				{
					isVisited[c]=true;
					nextNode=hsh.get(c);
					c=nextNode;
					++countSwap;
				}
			
			}
		}}
		System.out.println(countSwap);
		System.out.println(hsh);
		System.out.println(Arrays.toString(isVisited));
		}
}