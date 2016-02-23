package com.itfish.SortReview;

public class Mysort {
	public static void main(String[] args){
		int a[]={111,2223,453,22,0,21,12,12};
		for(int i:a){
			System.out.print(i+",");
		}
		System.out.println();
//		Mysort.BubbleSort(a);
//		Mysort.simpleSelectSort(a);
//		Mysort.straightInsertSort(a);
//		Mysort.shellSort(a);
//		Mysort.heapSort(a);
		Mysort.mergeSort(a, 0, a.length-1);
		for(int i:a){
			System.out.print(i+",");
		}
	}
	public static void BubbleSort(int[]a){
		boolean swap=true;
		for(int i=0;swap&&i<a.length;i++){
			swap=false;
			for(int k=a.length-1;k>i;k--){
				
				if(a[k]<a[k-1]){
					int temp=a[k];
					a[k]=a[k-1];
					a[k-1]=temp;
					swap=true;
				}
			}
			
		}
		
	}
	
	public static void simpleSelectSort(int[] a){
		for(int i=0;i<a.length;i++){
			int temp=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[temp]){
					temp=j;
				}
			}
			if(temp!=i){
				int temp1=a[i];
				a[i]=a[temp];
				a[temp]=temp1;
			}
		}
	}
	//注意让j=i-1保证不越界
	public static void straightInsertSort(int [] a){
		for(int i=2;i<a.length;i++){
			int j=0;
			if(a[i]<a[i-1]){
				a[0]=a[i];
				for(j=i-1;a[j]>a[0];j--){
					a[j+1]=a[j];
				}
				a[j+1]=a[0];
			}
		}
	}
	public static void shellSort(int a[]){
		int increment=a.length;
		do{
			increment=increment/3+1;
			for(int i=increment+1;i<a.length;i=i+increment){
				if(a[i]<a[i-increment]){
					int j=0;
					a[0]=a[i];
					for(j=i-increment;j>0&&a[j]>a[0];j=j-increment){
						a[j+increment]=a[j];
						
					}
					a[j+increment]=a[0];
				}
			}
			
			
		}while(increment>1);
	}
	public static void maxHeap(int a[],int s,int l){
		int temp=a[s];
		for(int i=s*2+1;i<l;i++){
			if(i<l-1&&a[i]<a[i+1]){
				i=i+1;
			}
			if(a[i]<temp)//注意是和最初的变量对比
				break;
			a[s]=a[i];
			s=i;
		}
		a[s]=temp;
		
	}
	public static void swap(int a[],int i,int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static void heapSort(int[]a){
		for(int i=a.length/2+1;i>-1;i--){
			maxHeap(a, i, a.length);
		}
		for(int i=a.length-1;i>-1;i--){
			swap(a,0,i);
			maxHeap(a, 0, i);
			
		}
	}
	public static void merge(int a[],int low,int mid,int high){
		int i=low;
		int j=mid+1;
		int k=0;
		int temp[]=new int[high-low+1];
		System.out.println("length="+(high-low+1));
		while(i<=mid&&j<=high){
			if(a[i]<a[j]){
				temp[k++]=a[i++];
				System.out.println("k="+k+"i="+i);
			}else{
				temp[k++]=a[j++];
				System.out.println("k="+k+"j="+j);
			}
		}
		while(i<=mid){
			temp[k++]=a[i++];
		}
		while(j<=high){
			temp[k++]=a[j++];
		}
		for(int t=0;t<temp.length;t++)
		{
			a[t+low]=temp[t];
		}
	}
	public static void mergeSort(int[] a,int low,int high){
		int mid=(high+low)/2;
		System.out.println("low="+low+"mid="+mid+"high="+high);
		if(low<high){
			mergeSort(a,low,mid);
			mergeSort(a,mid+1,high);
			merge(a,low,mid,high);
		}
		
	}

}
