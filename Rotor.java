public class Rotor {

    
    private String rotorValues;
    private char startChar;
    private int startCharidx;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;

        startCharidx = indexOf(startChar);

        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        rotorValues = charAt(rotorValues.length()-1) + rotorValues.substring(0, rotorValues.length()-1);
        if(charAt(startCharidx) == startChar) {
            return true;
        } else {
            return false;

        }
               
    }

    public int indexOf(char c){
        for(int i = 0; i < rotorValues.length(); i++){
            if(charAt(i) == c) {
                return i;
            }
        }
        return 0;
    }

    public char charAt(int idx){
        return rotorValues.charAt(idx);
    }
}
    
