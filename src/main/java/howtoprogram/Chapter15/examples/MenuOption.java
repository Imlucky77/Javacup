package howtoprogram.Chapter15.examples;

/**
 * @author imlucky
 * @Created: 2019/03/14
 * @Examples: Fig. 15.7: MenuOption.java
 */
public enum MenuOption {
    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4),
    ;

    public final int value;

    private MenuOption(int value) {
        this.value = value;
    }
}
