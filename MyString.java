package h3;



public class MyString{
	 
    private final char [] chars;

    public MyString(char[] c){
           
            this.chars = c;
    }

    public char charAt(int index){//https://www.tutorialspoint.com/java/java_string_charat.htm
            return chars[index];
    }

    public int length(){
            return chars.length;
    }

    public MyString subString(int begin, int end){
                   
            char [] ch_array = new char[end - begin];//http://javatutorialhq.com/java/lang/stringbuffer-class-tutorial/substring-start-end-method-example/
           
            int n = 0;
           
            for(int m=begin; m< end ; m++){
            	ch_array[n] = this.chars[m];
                    n++;
            }
            n =0;
           
            MyString mysubStr = new MyString(ch_array);
   
            return mysubStr;
    }

    public MyString toLowerCase() {
        
        char[] lowerCase = new char[chars.length];//https://www.javatpoint.com/java-string-tolowercase

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                lowerCase[i] = (char)(chars[i] + 32);
            } else {
                lowerCase[i] = chars[i];
            }
        }

        return new MyString(lowerCase);

    }

    public MyString toUpperCase() {//https://stackoverflow.com/questions/1951856/how-do-i-convert-strings-between-uppercase-and-lowercase-in-java

        char[] temp = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <='z') {
                temp[i] = (char)(chars[i] - 32);
            } else {
                temp[i] = chars[i];
            }
        }

        return new MyString(temp);
    }

    public boolean compareTo(MyString s) {//http://javatutorialhq.com/java/lang/string-class-tutorial/compareto-method-example/
            for (int i=0; i<s.length(); i++) {
                    if (this.charAt(i) != s.charAt(i)) {
                            return false;
                    }
            }
            return true;
    }

    public MyString getMyString() {
            return new MyString(chars);
    }

    public String toString() {
            return new String(chars);
    }

    public static MyString valueOf(int i){ //http://javatutorialhq.com/java/lang/string-class-tutorial/valueof-char-method-example/
            
            if (i >= 10) {
                    System.out.println("Only  single digit Integer ");
                    throw new IndexOutOfBoundsException();
            }
           
            char digitChar = Integer.toString(i).charAt(0);

            

            char[] singleChar = new char[1];
           
            singleChar[0] = digitChar;
           
   
            MyString value = new MyString(singleChar);
           
            return value;
    }



}
