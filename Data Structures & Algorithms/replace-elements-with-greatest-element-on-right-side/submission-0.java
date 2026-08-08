class Solution {
    public int[] replaceElements(int[] arr) {
        int maxr=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            if(i==arr.length-1){ arr[i]=-1;}
            else{
                int cur=arr[i];
                arr[i]=maxr;
                maxr=Math.max(maxr,cur);}
        }
        return arr;
    }
}