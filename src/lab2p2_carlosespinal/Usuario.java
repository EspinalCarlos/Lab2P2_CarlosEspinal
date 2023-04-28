
package lab2p2_carlosespinal;


public class Usuario {
    private String username;
    private String password;
    private boolean adminVer;

    public Usuario(String username, String password, boolean adminVer) {
        this.username = username;
        this.password = password;
        this.adminVer = adminVer;
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

    public boolean isAdminVer() {
        return adminVer;
    }

    public void setAdminVer(boolean adminVer) {
        this.adminVer = adminVer;
    }
    
    
    
    
    
}
