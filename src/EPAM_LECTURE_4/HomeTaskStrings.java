package EPAM_LECTURE_4;


public class HomeTaskStrings {


    public static void main(String[] args) {
        String string = "Hello World!!!";
        String string2 = "Hello WOrld!!!";
        char [] charArray = {'H','e'};
        System.out.println(string.charAt(8));                                               //1 Method
        System.out.println(string.codePointAt(2));                                     //2 Method
        System.out.println(string.codePointBefore(3));                                 //3 Method
        System.out.println(string.codePointCount(1,8));                                     //4 Method
        System.out.println(string.compareTo(string2));                                      //5 Method
        System.out.println(string.compareToIgnoreCase(string2));                            //6 Method
        System.out.println(string.concat(string2));                                         //7 Method
        System.out.println(string + string2);                                               //7 Method
        System.out.println(string.contains("el"));                                          //8 Method
        System.out.println(string.contentEquals("el"));                                  //9 Method
        System.out.println(string.contentEquals(new StringBuffer("Hello World!!!")));    //10 Method
        System.out.println(string.valueOf(charArray));                                      //11 Method
        System.out.println(string.endsWith(string.substring(10)));                          //12 Method
        System.out.println(string.equals(string2));                                         //13 Method
        System.out.println(string.equalsIgnoreCase(string2));                               //14 Method
        byte [] byteArray = string.getBytes();                                              //15 Method
        charArray = string.toCharArray();                                                   //16 Method
        System.out.println(string.hashCode());                                              //17 Method
        System.out.println(string.intern());                                                //18 Method
        System.out.println(string.length());                                                //19 Method
        System.out.println(string.regionMatches(8,string2,8,10));           //20 Method
        System.out.println(string.replace('d', 'f'));                                       //21 Method
        System.out.println(string.startsWith("Hell"));                                      //22 Method
        string2 = string.substring(2,6);
        System.out.println(string2);                                                        //23 Method
        charArray = string.toCharArray();
        System.out.println(charArray);                                                      //24 Method
        string = string.toLowerCase();
        System.out.println(string);                                                         //25 Method
        string = string.toUpperCase();
        System.out.println(string);                                                         //26 Method
        string.trim();
        System.out.println(string);                                                         //27 Method

    }
}
