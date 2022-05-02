
/**
 * Write a description of class BinaryTesting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinaryTesting
{
    public String arrayPacking(int[] a) {

        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i < a.length; i++){
            String temp = Integer.toBinaryString(a[i]);
            while(temp.length() < 32){
                temp = '0' + temp;
            }

            sb.append(temp);

        }

        return sb.toString();
    }

    public String toBinary(int a){
        StringBuilder sb = new StringBuilder("");

        String temp = Integer.toBinaryString(a);
        while(temp.length() < 32){
            temp = '0' + temp;
        }

        sb.append(temp);
        return sb.toString();
    }
    
    public int addBinaryDigits(int a){
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        String temp = Integer.toBinaryString(a);
       
        for(char c: temp.toCharArray()){
            i+= c-'0';
        }

        return i;
        
    }

    
}

