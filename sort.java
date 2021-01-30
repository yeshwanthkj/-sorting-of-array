import java.io.*;
public class sort
{
 static void srt(int arr[])
 {
	 int n=arr.length;
	 for(int i=0;i<n;i++)
	 {
		 for(int j=0;j<n;j++)
		 {
			 if(arr[i]<arr[j])
			 {
				 int temp=arr[j];
				 arr[j]=arr[i];
				 arr[i]=temp;
				 
			 }
		 }
	 }
 }
  public static void main (String args[])
  {
	  int arr[]=new int[]{6,8,1,21,13,3,9};
	  srt(arr);
	  for(int i=0;i<arr.length;i++)
		  System.out.print(arr[i]+"\t");
  }
}
