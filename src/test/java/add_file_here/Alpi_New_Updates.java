package add_file_here;

public class Alpi_New_Updates {

    public static void main(String[] args) {

        String Wrongname = "AAllppaassllaann";
        String name="";
        for (int i = 0; i<Wrongname.length()-1; i++) {

            if(Wrongname.charAt(i)==Wrongname.charAt(i+1)){
                name+=Wrongname.charAt(i);
            }
        }

        System.out.println(name);
        System.out.println("new lines");
    }

}
