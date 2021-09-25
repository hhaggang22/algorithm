package Practice_2;

public class Practice02_3 {
    public static void main(String[] args){
        int[] arr1 = {1, 3, 4};
        int[] arr2 = {2, 3, 1};

        int count = 0; 
        boolean isSame = false; 

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    isSame = true;     //break나 continue를 쓰지 않으면 굳이 flag를 쓸 필요가 없다..
                    count++;           //count를 두지 말고 break를 거는 것이 좋을 듯
                }
            }
        }

        if(count == arr1.length){
            System.out.println("같은 배열입니다.");
        }
        else{
            System.out.println("다른 배열입니다.");
        }
    }
}
