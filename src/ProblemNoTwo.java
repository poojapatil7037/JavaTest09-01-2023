public class ProblemNoTwo {
    public static void main(String[] args) {
        String sentence="Hi all, how are you? Would you like to have some icecream?";
        System.out.println(sentence);

        for (int i=0; i<=sentence.length();i++){

            if(sentence.startsWith("a")||sentence.startsWith("i")){
                System.out.println(sentence);
            }
        }



    }
}
