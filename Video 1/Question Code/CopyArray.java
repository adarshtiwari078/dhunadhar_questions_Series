public class CopyArray {
    public static void main(String[] args) {
        //6.: Copy Elements of One Array to Another Array
        int[] source = {10, 20, 30, 40,344,34,34,2,3,45};
        int n = source.length;
        int[] copyArray= new int[n];
        for (int i = 0; i < n; i++) {
            copyArray[i] = source[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(copyArray[i]+" ");
        }

    }
}
