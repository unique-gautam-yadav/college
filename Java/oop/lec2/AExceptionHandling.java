package oop.lec2;

public class AExceptionHandling {
    public static void main(String[] args) {
        try {
            func(16);
        } catch (AppError e) {
            System.err.println(e.toString());
        }
    }

    static public boolean func(int ageFilter) throws AppError {

        if (ageFilter < 18) {
            throw new AppError("null");
        }

        return true;
    }

}

class AppError extends Exception {
    String message;

    public AppError(String str) {
        super(str);
        this.message = str;
    }

    @Override
    public String toString() {
        return this.message;
    }
}