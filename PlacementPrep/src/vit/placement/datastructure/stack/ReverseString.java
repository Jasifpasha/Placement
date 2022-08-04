package vit.placement.datastructure.stack;

public class ReverseString {

    public static void main(String[] args){

        String reversedString = reverseString("akheel");
        System.out.println(reversedString);
    }

    private static String reverseString(String name) {

        char[] nameArray = name.toCharArray();
        CharStack reverseStack = new CharStack(name.length());

//        For each
        for (char c : nameArray) {
            reverseStack.push(c);
        }

        //For Loop
//        for(int i=0; i < name.length(); i++){
//            reverseStack.push(nameArray[i]);
//        }

        for(int i = 0; i < name.length(); i++){
            nameArray[i] = reverseStack.pop();
        }

        return String.valueOf(nameArray);
    }

}
