class A{
    public static void main(String[] args){
         
        int count=0; 
        int []arr = {1,3,1,1,1,1,2,2};
        int temp=arr[0]; int n=arr.length;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]== arr[j]){
                   count++; temp=arr[i];
                }
            }
            
        }
        if(count>=n){
            System.out.print("Majority element is "+temp);
          }
    }
}