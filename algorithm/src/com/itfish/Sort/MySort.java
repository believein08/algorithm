package com.itfish.Sort;

public class MySort {

	public static void main(String args[]){
		int[]a={11,23,23,43,56,21,12,9,0};
//		MySort.shellSort(a);
		MySort.heapSort(a);
		for(int i:a){
			System.out.print(i+",");
		}
	}
	public static void bubbleSort(int[] a){
		boolean isSwap=true;
		for(int i=0;i<a.length&&isSwap;i++){
			isSwap=false;
			for(int j=a.length-1;j>i;j--){
				if(a[j]<a[j-1]){
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					isSwap=true;
				}
			}
		}
	}
	public static void simpleSelectSort(int[]a){
		int min=0;;
		for(int i=0;i<a.length;i++){
			min=i;
			for(int j=i+1;j<a.length;j++){
				
				if(a[j]<a[min]){
					min=j;
				}
			}
			if(min!=i){
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
	}
	public static void straightInsertSort(int []a){
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
	public static void shellSort(int[]a){
		int increment=a.length;
		do{
			increment=increment/3+1;
			int j=0;
			for(int i=increment+1;i<a.length;i++){
				if(a[i]<a[i-increment]){
					a[0]=a[i];
					for(j=i-increment;j>0&&a[j]>a[0];j-=increment){
						a[j+increment]=a[j];
					}
					a[j+increment]=a[0];
				}
			}
		}while(increment>1);
	}
//	public static void heapSort(int a[]){
//		for(int i=a.length/2;i>-1;i--){
//			HeapAdjust(a, i, a.length);
//		}
//		for(int i=a.length-1;i>-1;i--){
//			swap(a,0,i);
//			HeapAdjust(a, 0, i);
//		}
//	}
//	public static void HeapAdjust(int a[],int s,int l){
//		int temp=a[s];
//		for(int i=2*s+1;i<l;i=i*2+1){
//			if(a[i]<a[i+1]&&i<l-1){
//				i++;
//			}
//			if(temp>a[i]){
//				break;
//			}
//			a[s]=a[i];
//			s=i;
//		}
//		a[s]=temp;
//		
//	}
//	public static void swap(int a[],int i,int j){
//		int temp=a[i];
//		a[i]=a[j];
//		a[j]=temp;
//	}
	public static void heapMax(int a[],int s,int l){
		int temp=a[s];
		for(int i=s*2+1;i<l;i=i*2+1){
			if(i<l-1&&a[i]<a[i+1]){
				i++;
			}
			if(temp>a[i]){
				break;
			}
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
	public static void heapSort(int a[]){
		for(int i=a.length/2;i>-1;i--){
			heapMax(a, i, a.length);
		}
		for(int i=a.length-1;i>0;i--){
			swap(a, 0, i);
			heapMax(a, 0, i);
		}
	}

}
