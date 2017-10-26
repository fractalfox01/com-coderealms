package sandbox;

public class Sandbox {

    String sampleString;

    public Sandbox(String example){

        this.sampleString = example;
    }

    public void setSampleString(String example){
        sampleString = example;
    }

    public void printExamples(){
        System.out.println("char charAt(int) : Returns the character at the specified position in the string.\n");
        System.out.println("int compareTo(String) : Compares this string to another sting, using alphabetical order.\n\t\t\t\t\t\t" +
        "Returns -1 if this string comes before the other string.\n\t\t\t\t\t\t0 if the strings are the same,\n\t\t\t\t\t\tand 1 if this string " +
        " comes after the other string.\n");
        System.out.println("");
    }
}
