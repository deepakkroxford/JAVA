public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("aman");
        System.out.println(sc);

        // char at index 0
        System.out.println(sc.charAt(0));

        // set char at index
        sc.setCharAt(0, 'p');
        System.out.println(sc);

        // insert
        sc.insert(0, 'a');
        System.out.println(sc);

        // delete at any index
        sc.delete(1, 2);
        System.out.println(sc);

        // append mean add at end
        sc.append("h");
        sc.append("e"); // str = str + "e";
        sc.append("l"); // str = str + "l";
        sc.append("1");
        sc.append("o");
        System.out.println(sc);

    }

}
