public class Stringmethod {
    public static void main(String[] args) {
            String name="Kevin";
            System.out.println(name.length());
            System.out.println(name.toLowerCase());
            System.out.println(name.toUpperCase());
            String name2="     Kevin    ";
            System.out.println(name2.trim());
            System.out.println(name.substring(2));
            System.out.println(name.replace('e','l' ));
            //Case sensitive
            System.out.println(name.startsWith("ke"));
            System.out.println(name.startsWith("Ke"));
            System.out.println(name.charAt(3));
            System.out.println(name.indexOf("i"));
            String name3="kkeevviinn";
            System.out.println(name3.lastIndexOf('e'));
            System.out.println(name3.lastIndexOf('e',2));
            //Case sensitive
            System.out.println(name.equals("Kevin"));
            System.out.println(name.equalsIgnoreCase("kEvIn"));
            String name4="kevin \n oza";
            System.out.println(name4);
            String name5="kevin \t oza";
            System.out.println(name5);
            String name6="kevin \" oza";
            System.out.println(name6);
            String name7="kevin \\ oza";
            System.out.println(name7);
            String name8="Shunham Danecha";
            //System.out.println(name8.replace("", "_"));
            name8=name8.replace(" ", "_");
            System.out.println(name8);

            
}

};
