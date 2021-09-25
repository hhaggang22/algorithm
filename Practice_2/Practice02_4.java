package Practice_2;

import javax.swing.text.html.HTMLDocument.RunElement;

public class Practice02_4 {
    public static void main(String[] args){
        //idea : 만약 arr에 있는 값이 result에 없으면 result에 추가한다. 
        int[] arr = {5, 10, 9, 27, 2, 8, 10, 4, 27, 1};
        int[] result = new int[10];

        result[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
            
            for(int k = 0; k < result.length; k++){
                if(arr[i] == result[k]){
                    result[i] = 0;
                    break;                  
                }
            }
            result[i] = arr[i];
        }

        System.out.println("arr is");
        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j]+",");
        }
        System.out.println("\nresult is");
        for(int j = 0; j < result.length; j++){
            System.out.print(result[j]+",");
        }
    }
    
}
