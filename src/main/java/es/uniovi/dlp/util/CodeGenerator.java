package es.uniovi.dlp.util;

import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {

    private int labels = 0;

    private PrintWriter out;

    public CodeGenerator(String inputPath, String outputPath) {
        try {
            this.out = new PrintWriter( outputPath );
            heading( inputPath );
        } catch (IOException e) {
            System.err.println("Error opening file: " + outputPath);
            System.exit( -1 );
        }
    }

    public int getLabels(int number) {
        int currentLabels = labels;
        labels += number;
        return currentLabels;
    }

    public void heading(String source) {
        write( "#source \"" + source + "\"" );
        enter();
    }

    public void call(String id) {
        write("call "+ id);
        enter();
    }

    public void ret(int rv, int lv, int arg) {
        write("ret " + rv + "," + lv + "," + arg);
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

    public void pushBp() {
        write("push bp");
        enter();
    }

    public void pusha(int offset) {
        write("pusha " + offset);
        enter();
    }

    public void pushi(int value) {
        write("pushi " + value);
        enter();
    }

    public void pushf(double value) {
        write("pushf " + value);
        enter();
    }

    public void pushb(int value) {
        write("pushb " + value);
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
        enter();
    }

    public void load(char suffix) {
        write("load"+suffix);
        enter();
    }

    public void cast(char from, char to) {
        write(from + "2" + to);
        enter();
    }

    public void add(char suffix) {
        write("add"+suffix);
        enter();
    }

    public void sub(char suffix) {
        write("sub" + suffix);
        enter();
    }

    public void mul(char suffix) {
        write("mul" + suffix);
        enter();
    }

    public void div(char suffix) {
        write("div" + suffix);
        enter();
    }

    public void mod(char suffix) {
        write("mod" + suffix);
        enter();
    }

    public void lt(char suffix) {
        write("lt"+suffix);
        enter();
    }

    public void le(char suffix) {
        write("le" + suffix);
        enter();
    }

    public void eq(char suffix) {
        write("eq" + suffix);
        enter();
    }

    public void ge(char suffix) {
        write("ge" + suffix);
        enter();
    }

    public void gt(char suffix) {
        write("gt" + suffix);
        enter();
    }

    public void ne(char suffix) {
        write("ne" + suffix);
        enter();
    }

    public void and() {
        write("gt");
        enter();
    }

    public void or() {
        write("or");
        enter();
    }

    public void not() {
        write("not");
        enter();
    }

    public void jump(String label) {
        write( "jmp " + label );
        enter();
    }

    public void jz(String label) {
        write( "jz " + label );
        enter();
    }

    public void comment(String comment) {
        write( "' " + comment );
        enter();
    }

    public void debugLine(int line) {
        write("#line " + line);
        enter();
    }

    public void close() {
        this.out.close();
    }

    private void enter() {
        write("\n");
        this.out.flush();
    }

    private void write(String code) {
        this.out.print(code);
    }

}
