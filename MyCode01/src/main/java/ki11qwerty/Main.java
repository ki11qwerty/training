package ki11qwerty;

public class Main {
    public static void main(String[] args){
        Main mn = new Main();
        int[] arr = {6,5,7,8,9,0,7,1,6,5,4,5,6,7,8,9};
        mn.arrayAfter4(arr);
    }


    public int[] arrayAfter4(int[] arr){
        int searching = -1;
        int[] arr2;
        for (int i = arr.length-1; i > 0; i--) {      //searching 1 in array & creating length
            if (arr[i] == 1 && searching==-1) {      //for second array
                searching = i +1;
                break;
            }
        }
        if (searching ==-1){
            throw new RuntimeException(">> Sorry, but array does not contain 1");
        }
        arr2 = new int[arr.length - searching];
        for(int i = 0; i<(arr.length - searching); i ++){
            arr2[i] = arr[i+searching];
            System.out.print(arr2[i]);
        }
        return arr2;
    }
}

//
