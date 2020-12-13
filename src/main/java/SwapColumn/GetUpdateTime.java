package SwapColumn;

public class GetUpdateTime {
    public static void main(String[] args) {
        String str = "id,name,family,update time,code";

        boolean update_time = str.matches("update time");
        System.out.println(update_time);
    }
}
