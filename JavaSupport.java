public class JavaSupport {
    /*
         求最小值

     */

    public int min(int[]arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    /*
           排序方法
     */

    public void replace(int[] arr,int a,int b){
        if(arr[a]>arr[b]){
            int t=arr[a];
            arr[a]=arr[b];
            arr[b]=t;
        }
    }
    /*
            冒泡排序
     */
    public void maoSort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                replace(arr,j,j+1);
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }
    }

/*
         选择排序
*/


    public void xuanzeSort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                replace(arr,i,j);
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }
    }
}

