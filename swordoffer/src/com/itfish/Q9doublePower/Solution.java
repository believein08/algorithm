package com.itfish.Q9doublePower;

/**
 * Created by zhangyu on 2016/8/17.
 */
public class Solution {
    public static void main(String[] args) {
        //test
        Solution s=new Solution();
//        s.print1TOMaxOfNDigits(3);
        s.bigIntegerMultiply("-12","-12");
    }
    public void print1TOMaxOfNDigits(int n){
        if(n<=0){
            return ;
        }
        int[] array=new int[n];
        printArray(array,0);
    }

    /**
     *
     * @param array
     * @param n  递归到第几位
     */
    public void printArray(int array[],int n){
        if(n!=array.length) {
            for (int i = 0; i < 10; i++) {
                array[n] = i;
                printArray(array, n + 1);
            }
        }else{
            boolean isFirstNo0=false;
            for(int j=0;j<array.length;j++){
                if(array[j]!=0){
                    System.out.print(array[j]);
                    isFirstNo0=true;
                }else{
                    if(isFirstNo0){
                        System.out.print(array[j]);
                    }
                }
            }
            System.out.println();
        }
    }
    public void  bigIntegerMultiply(String s1,String s2 ){
        char sign='+';
        String s1s=s1;
        String s2s=s2;
        if(s1.charAt(0)=='+'||s1.charAt(0)=='-'){
            sign=s1.charAt(0);
            s1s=s1.substring(1);
        }
        if(s2.charAt(0)=='+'||s2.charAt(0)=='-'){
            if(sign==s2.charAt(0)){
                sign='+';
            }
            else{
                sign='-';
            }
            s2s=s2.substring(1);
        }
        char[] ch1=new StringBuffer(s1s).reverse().toString().toCharArray();
        char[] ch2=new StringBuffer(s2s).reverse().toString().toCharArray();
        int[] result=new int [ch1.length+ch2.length];
        for(int i=0;i<ch1.length;i++){
            for(int j=0;j<ch2.length;j++){
                result[i+j]=(ch1[i]-'0')*(ch2[j]-'0');
            }
        }
        for(int i=0;i<result.length;i++){
            if(result[i]>9){
                result[i+1]=result[i+1]+result[i]/10;
                result[i]=result[i]%10;
            }
        }
        StringBuffer buffer=new StringBuffer();
        boolean flag=false;
        for(int j=result.length-1;j>-1;j--){
            if(result[j]!=0){
                buffer.append(result[j]);
                flag=true;
            }else{
                if(flag){
                    buffer.append(result[j]);
                }
            }
        }
        if(sign=='-'){
            buffer.insert(0,sign);
        }
        System.out.println(buffer.toString());
    }


}
