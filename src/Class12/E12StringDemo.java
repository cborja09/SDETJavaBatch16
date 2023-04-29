package Class12;

public class E12StringDemo {
    public static void main(String[] args) {

        String sentence="yup we have another class";
        // subString is used to get a part of the sentence in a String
        System.out.println(sentence.substring(4));
        System.out.println(sentence.substring(4,11));
        System.out.println(sentence.substring(12,19));

        int startIndex= sentence.length()-4;
        System.out.println(sentence.substring(startIndex));
    }
}
