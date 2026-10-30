class Binearysearch{
    public static void main(String[]args){
        int [] arr={2,3,5,9,14,16,18};
        //int []arr={99,87,65,35,2,1,-9,-67};
       int target=15;
       int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int []arr,int target){
       int start=0;
       int end=arr.length-1;
       boolean isAsc=arr[start]<arr[end];
      int mid=start+(end-start)/2;
        while(start<=end){
              mid=start+(end-start)/2;
             if(arr[mid]==target){
                return arr[mid];
                }
                if(isAsc){
                 if(target>arr[mid]){
                    start=mid+1;
                    }else{
                    end=mid-1;
                    }
                }else{
                    if(target<arr[mid]){
                     start=mid+1;
                    }else{
                         end=mid-1;
                    }
                }
            }
        //     if(isAsc){
        //             if(target<arr[mid]){
        //         return arr[mid];
        //     }else{
        //         return arr[mid+1];
        //     }
        //     }else{
        //         if(target>arr[mid]){
        //         return arr[mid-1];
        //     }else{
        //         return arr[mid];
        //     }
        // }
       return start;
       
    }
}