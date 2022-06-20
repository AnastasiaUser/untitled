public class LongWord {
    public static void main(String[] args)  {

            String[] words_array = new String[]{"Strengths", "Different people", "Java"};
            int max_len_index = 0; 


            for (int i = 0; i < words_array.length; i++) {
                if (words_array[i].length() > words_array[max_len_index].length()) {
                    max_len_index = i;
                }
            }

            System.out.println(words_array[max_len_index]);
        }
    }


