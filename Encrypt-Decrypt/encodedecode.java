import java.util.*;

public class encodedecode {
    public static void main(String args[]){
        String orgi = "Ayush Anand";
        String encodestr = encode(orgi);
        String decodestr = decode(encodestr);
        
        System.out.println("Encoded string " + encodestr);
        System.out.println("Decoded string " + decodestr);
    }
    public static String encode(String str){
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encoded = encoder.encode(str.getBytes());
        return new String(encoded);
    }

    public static String decode(String str){
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decoded = decoder.decode(str);
        return new String(decoded);
    }

}
