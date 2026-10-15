package Variables;

public class CharDataTypes {
    public static void main(String[] args){

        char S = '%'; // it only contains Single char,
                                 // Multiple Chars are contained by String
        System.out.println(S);

        // ASCII Values : a-97,A-65,0-48
        char Su = '*';
        System.out.println(Su);

        //char to int

        char y = 'u';
        System.out.println(y*1);

        // Int to Char

        int x = 65;
        char n = (char)x;
        System.out.println(n);

        //TypeCasting Trick - 1

        char s = 'D';
        System.out.println(s+0);

        //TypeCasting Trick - 2

        char u = '*';
        System.out.println(u*1);




    }
}
