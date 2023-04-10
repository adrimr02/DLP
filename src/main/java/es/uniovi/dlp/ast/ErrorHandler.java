package es.uniovi.dlp.ast;

import es.uniovi.dlp.ast.types.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

    private static ErrorHandler instance;

    public static ErrorHandler getInstance() {
        if (instance == null) {
            instance = new ErrorHandler();
        }
        return instance;
    }

    private List<ErrorType> errors;

    private ErrorHandler() {
        errors = new ArrayList<>();
    }

    public boolean anyError() {
        return !errors.isEmpty();
    }

    public void showErrors(PrintStream printStream) {
        for (var error : errors)
            printStream.println(error);
    }

    public void addError(ErrorType error) {
        this.errors.add( error );
    }

}
