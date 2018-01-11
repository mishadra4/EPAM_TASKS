package EPAM_LECTURE_4;

public class ExtendedString {
    private String string;
    ExtendedString(String string){
        this.string = string;
    }
    String shortenSequence(){
        for (int i = 0; i < string.length() - 1; i++) {
            if(string.charAt(i) == string.charAt(i+1)){
                string= string.substring(0,i) + string.substring(i+1,string.length());
                i--;
            }
        }
        return string;
    }

    String formatToRightEdge(int lengthOfLine){
        lengthOfLine++;
        int stringQuantity = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == '\n'){
                String string2 = new String();
                for (int j = 0; j < lengthOfLine - i%11 - 1; j++) {
                    string2+=' ';
                }
                string = string.substring(0,stringQuantity*lengthOfLine) + string2
                        + string.substring(lengthOfLine*(stringQuantity++));
                i = stringQuantity*lengthOfLine;
            }
        }
        return string;
    }

    void barrouzWillerMethod(){
        String [] stringArray = new String[string.length()];
        stringArray[0] = string;
        for (int i = 1; i < string.length(); i++) {
            stringArray[i] = stringArray[i-1].substring(1,string.length()) + stringArray[i-1].charAt(0);
        }

        for (int i = 0; i < stringArray.length; i++) {
            String minString = stringArray[i];
            int minIndex = i;
            for (int k = i+1; k < stringArray.length; k++) {
                for (int j = 0; j < minString.length() || j < stringArray[i].length(); j++) {
                    if (stringArray[k].charAt(j) < minString.charAt(j)) {
                        minString = stringArray[k];
                        minIndex = k;
                        break;
                    }
                    if(stringArray[k].charAt(j) > minString.charAt(j)){
                        break;
                    }
                }
            }
            String temp = stringArray[i];
            stringArray[i] = minString;
            stringArray[minIndex] = temp;
        }
        for (String string:stringArray) {
            System.out.println(string);
        }
        for (String string:stringArray) {
            System.out.print(string.charAt(string.length() - 1));
        }
    }
}
