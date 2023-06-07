import Karyawan.*;
public class Accounts {
    private String username;
    private String password;
    private Karyawan karyawan;

    public Accounts(String username, String password, Karyawan karyawan) {
        this.username = username;
        this.password = password;
        this.karyawan = karyawan;
    }
}
