 private static void isAnagram() {
        char[] splitIt = "listen".toCharArray();
        char[] splitIt2 = "silent".toCharArray();

        Arrays.sort(splitIt);
        Arrays.sort(splitIt2);
        if (Arrays.equals(splitIt,splitIt2)) {
            System.out.println("is Anagram");
        }else{
            System.out.println("is not anagram");
        }

    }


     private static boolean isAnagram2() {

        String string1 = "listen";
        String string2 = "silent";

        String join1 = Arrays.stream(string1.split(""))
                .sorted()
                .collect(joining(""));
        String join2 = Arrays.stream(string2.split(""))
                .sorted()
                .collect(joining(""));
        return join1.equals(join2);

    }