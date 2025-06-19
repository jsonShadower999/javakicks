 private static void stringsStartsWithNumber() {
        String [] words= {"rohit","foo","nemo","target1","12Target","2robot"};

        System.out.println("original Strings " + Arrays.toString(words));

        List<String> stringStartNumber = Arrays.stream(words)
                 .filter(word -> Character.isDigit(word.charAt(0)))
                 .toList();
        System.out.println("strings started with a number " + stringStartNumber);
    }