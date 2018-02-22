package h3;

public class test {
	 
    public static void main(String[] args) {

            MyString string1 = new MyString(new char[]{'M', 'O', 'H', 'A','M','M','A','D'});
            MyString string2 = new MyString(new char[]{'H', 'A', 'Q', 'U','E'});
            MyString string3 = new MyString(new char[]{'C', 'O', 'm', 'u', 'T', 'E', 'r'});
            MyString string4 = new MyString(new char[]{'S', 'C', 'I', 'e', 'n', 'c', 'E'});
            MyString string5 = new MyString(new char[]{'A','B','C', 'I', 'S', 'C'});
                                           
            System.out.println(string1.toString());
            System.out.println(string2.getMyString());
            System.out.println(string3.toUpperCase());
            System.out.println(string4.toLowerCase());
            System.out.println(string5.subString(2, 6));
            System.out.println(string1.compareTo(string2));
            System.out.println(string1.charAt(7));
            System.out.println(string1.length());
            System.out.println(MyString.valueOf(3));
            
            
            
            
            
            
           
                    }

    }
