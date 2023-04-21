package es.uniovi.dlp.util;

import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {

    private int labels = 0;

    private PrintWriter out;

    public CodeGenerator(String inputPath, String outputPath) {
        try {
            this.out = new PrintWriter( outputPath );
            heading( outputPath );
        } catch (IOException e) {
            System.err.println("Error opening file: " + outputPath);
            System.exit( -1 );
        }
    }

    public int getLabels(int number) {
        labels += number;
        return labels;
    }

    public void heading(String source) {
        write( "#source \"" + source + "\"" );
        enter();
    }

    public void call(String id) {
        write("call "+ id);
        enter();
    }

    public void halt() {
        write("halt");
        enter();
    }

    public void label(String id) {
        write( id + ":" );
        enter();
    }

    public void enter(int size) {
        write("enter " + size);
        enter();
    }

    public void out(char suffix) {
        write( "out"+suffix );
        enter();
    }

    public void in(char suffix) {
        write( "in"+suffix );
        enter();
    }

    public void store(char suffix) {
        write( "store"+suffix );
    }

    public void debugLine(int line) {
        write("#line " + line);
        enter();
    }

    public void comment(String comment) {
        write( "' " + comment );
        enter();
    }

    private void enter() {
        write("\n");
        this.out.flush();
    }

    private void write(String code) {
        this.out.print(code);
    }

}
