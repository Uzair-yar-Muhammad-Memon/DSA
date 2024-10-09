public class FirstSingleLetter {
    public static void count(String str){
        char ch=' ';
        int arr[]=new int[26];
        for(int j=0;j<arr.length;j++){
            arr[j]=0;
        }
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            arr[(int) ch-(int)('A')]++;
        }
        for(int k=0;k<str.length();k++){
            ch=str.charAt(k);
            if(arr[(int)ch-(int)('A')]==1){
                System.out.println("The First Single character is : "+ch);
                break;
            }
            if(k==str.length()-1){
                System.out.println("No any element occurs once in string");
            }
        }
    }
    public static void main(String args[]){
        String str="ADOADOB";
        count(str);
    }
}
