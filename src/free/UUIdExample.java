package free;

import java.util.UUID;

public class UUIdExample {

    public static void main(String[] args) {

        UUID uuid = UUID.randomUUID();
        int variant = uuid.variant();
        int version = uuid.version();
        int i = uuid.hashCode();
        System.out.println(uuid + " " + version + " " + i + " " + variant);
    }
}
