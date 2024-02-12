import java.util.*;
class XYZ
{public int bins(int arr[],int f,int l,int x)
 {if(f<=l&&f<=arr.length-1)
  {int mid=(f+l)/2;
  if(arr[mid]<x)
  return bins(arr,mid+1,l,x);
  if(arr[mid]==x)
  return mid;
  if(arr[mid]>x)
  return bins(arr,f,mid-1,x);
  }
  return -1;
 }
}
class binary
{public static void main(String args[])
 {XYZ ob=new XYZ();
  int n,i,j;
  int arr[]=new int[100];
  System.out.println("Enter the number of elements");
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  System.out.println("Enter the array elements");
  for(i=0;i<n;i++)
  arr[i]=sc.nextInt();
  for(i=0;i<n-1;i++)
  {for(j=0;j<n-i-1;j++)
   {if(arr[j]>arr[j+1])
    {int temp=arr[j];
     arr[j]=arr[j+1];
     arr[j+1]=temp;
    }
   }
  }
  System.out.println("Array after sorting:");
  for(i=0;i<n;i++)
  System.out.println(arr[i]+" ");
  System.out.println("Enter the element to be searched");
  int x=sc.nextInt();
  int r=ob.bins(arr,0,n-1,x);
  if(r==-1)
  System.out.println("Element not found");
  else
  System.out.println("Element found at position"+(r+1));
 }
}
  