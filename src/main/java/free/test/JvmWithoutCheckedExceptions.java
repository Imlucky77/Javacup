package free.test;

import java.sql.SQLException;

public class JvmWithoutCheckedExceptions {
    // No throws clause here
    public static void main(String[] args) {
        doThrow(new SQLException());
    }

    static void doThrow(Exception e) {
        JvmWithoutCheckedExceptions.<RuntimeException>doThrow0(e);
    }

    @SuppressWarnings("unchecked")
    static <E extends Exception>
    void doThrow0(Exception e) throws E {
        throw (E) e;
    }
}
