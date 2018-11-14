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


//确定程序运行时间，模板设计模式，多态，抽象类
abstract class Demo {
    public final void getTime() {
        long start = System.currentTimeMillis();
        function();
        long stop = System.currentTimeMillis();
        System.out.println();
        System.out.println("共花费" + (stop - start));
    }

    public abstract void function();
}
class Test extends Demo {//重写，可以根据自己的需要更改function方法里面的内容

    public void function() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("aa");
        }
    }
}
public class TimeMillis {
    public static void main(String[] args) {
        Test t=new Test();
        t.getTime();
    }
}

