class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String [] arr=s.split(" +");
        int first=0;
        int last= arr.length-1;
        while(first<last){
            String temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            str.append(arr[i]);
            if(i<arr.length-1){
                str.append(" ");
            }
        }
        s=str.toString();
       // System.out.println(s);
       return s;
    }
}