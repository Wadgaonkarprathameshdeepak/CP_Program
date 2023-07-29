import java.util.Scanner;
 class Shoemaker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        int[] day=new int[test];
        int[] fine=new int[test];
        float[] ratio=new float[test];
        float[] index=new float[test];
        for(int i=0;i<test;i++){
            day[i]=sc.nextInt();
            fine[i]=sc.nextInt();
            ratio[i]=((float)day[i]/fine[i]);
            index[i]=i+1;
        }
        for(int i=0;i<test;i++){
            for(int j=0;j<test;j++){
                if(ratio[i] < ratio[j]){
                    swap(ratio,i,j);
                    swap(index,i,j);
                }
            }
        }
        for(int i=0;i<test;i++){
            System.out.println(index[i] + " ");
        }
    }
    private static void swap(float[] arr, int i, int j){
        float temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
