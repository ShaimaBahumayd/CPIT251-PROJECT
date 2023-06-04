
public class Tourist {
     String tNFame;
     String tNLame;
    private String email;
    private String phoneNum;
    int tID;
   

    public Tourist(String tNFame, String tNLame, String email, String phoneNum) {
        this.tNFame = tNFame;
        this.tNLame = tNLame;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String gettNFame() {
        return tNFame;
    }

    public void settNFame(String tNFame) {
        this.tNFame = tNFame;
    }

    public String gettNLame() {
        return tNLame;
    }

    public void settNLame(String tNLame) {
        this.tNLame = tNLame;
    }

    
  

    public String getEmail() {
        return email;
    }

    public Tourist() {
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    
}
