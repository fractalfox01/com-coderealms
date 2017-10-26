package help;

public class HelpMain {
    private String find;
    private String returnString;
    private String myOutput = "";


    public HelpMain(String find){
        this.find = find;
        if (this.find.equals("string")){
            returnString = "string";
        }
        if (this.find.equalsIgnoreCase("help")){
            returnString = "help";
        }
    }

    @Override
    public String toString() {
        if (returnString.equals("string")){
            HelpStrings output = new HelpStrings();
            this.myOutput = output.toString();
        }
        if (returnString.equals("help")){
            this.myOutput = "Dynamic Shit!! Ohh, yeah!!";
        }
        else{
            this.myOutput = this.getClass().getName();
        }
        return this.myOutput;
    }
}
