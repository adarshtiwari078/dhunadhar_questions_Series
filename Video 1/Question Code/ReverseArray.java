public class ReverseArray {
    public static void main(String[] args) {
        //5. Reverse this array
        int[] arr = {1, 2, 3, 4, 5};
        int x=0,y=arr.length-1;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<(arr.length/2)+1;i++){
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            x++;
            y--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
