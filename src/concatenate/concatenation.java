package concatenate;



public class concatenation{
    public static String strcat(String str1, String str2){
        //converting string into char array
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        int counter=charArray1.length+charArray2.length;

        //stores both char array   
        char[] charContainer=new char[counter];

        //for storing charArray1 into charContainer
        int i=0;
        for(; i<charArray1.length; i++) {
            charContainer[i]=charArray1[i];
        }
        //for storing charArray2 into charContainer
        for(int j=0; i<counter; j++,i++) {
            charContainer[i]=charArray2[j];
        }
        //converting charContainer char array into string
        return new String(charContainer);
    }
    public static void main(String args[]){
        String str1 = "Aakanksha ";
        String str2 = "loves Tea";
        String strContainer = strcat(str1,str2);
        System.out.println("String Container : " +strContainer);  
    }
}