package main.java;

/**
 * Created by Hanna_Zhahala on 12.02.2017.
 */
public class CountVowels {
    public static void main(String[] args) {
        int i = new CountVowels().countLetters();
        System.out.println(i);
    }
        public int countLetters() {

        String a = "dzuliano";

        int i = 0;

        String[] vowels = new String [6];
        vowels [0]= "a";
        vowels [1]= "e";
        vowels [2]= "i";
        vowels [3]= "o";
        vowels [4]= "u";
        vowels [5]= "y";

        for (int i1 = 0; i1 < a.length(); i1++ ){


            for (int i2 = 0; i2 < vowels.length; i2++){

                if (vowels [i2].equals(Character.toString(a.charAt(i1)))){i++;};
            }

        }

return i;

    }

    }

