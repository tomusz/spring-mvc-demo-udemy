/*package pl.sda.poznan;

public class przywitanie {

    public static String greet(String... names){
        if(names == null){
            return "Hello, friend";
        }
        if(names.length == 1){
            String name = names[1];
            if(name.equals(name.toUpperCase())){
                return "HELLO, " + name;

            }
            return String.format("Hello, %s", names);
        }
        else{
            StringBuilder sb = new StringBuilder();
            sb.append("Hello, ");
            String capitalName = null;
            for(int i = 0; i < names.length-1; i++){
                if(names[i].equals(names[i].toUpperCase())){
                    capitalName = names[i];
                    continue;
                }
                sb.append(names[i]).append(", ");

            }
            sb.append(" and" ).append(names[names.length-1]);
            return String.format("Hello, %s and %s", names[0], names[1]); //nie jeste potrzebny String format "Hello, " + names;
        }
    }
}*/
