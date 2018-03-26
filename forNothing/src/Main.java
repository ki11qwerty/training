public class Main {

    public static void main(String[] args) {
        int[] arr1 = new int[100];
        int[] arr2;
        int lenght = arr1.length - 95;
        arr2 = new int[lenght];
        System.out.println(arr1.length+","+lenght+" ,"+arr2.length+"");
    }
}
//    public int[] array14(int[] arr) {
//        boolean searching = false;
//        int[] arr2;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1 && searching==false ||
//                    arr[i] == 4 && searching==false) {
//                searching = true;
//                arr2 = new int[arr.length - i];