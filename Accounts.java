import java.io.Serializable;

import Karyawan.*;
public class Accounts implements Serializable {
    private String username;
    private String password;
    private Karyawan karyawan;

    public Accounts(String username, String password, Karyawan karyawan) {
        this.username = username;
        this.password = password;
        this.karyawan = karyawan;
    }

    public Accounts() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Karyawan getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }
}
