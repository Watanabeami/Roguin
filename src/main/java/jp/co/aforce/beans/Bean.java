package jp.co.aforce.beans;

public class Bean implements java.io.Serializable{
    private int id;
    private String password;
    
    public int getId() {
    	return id;
    }
    
    public String getPassword() {
    	return password;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public void setPassword(String password) {
    	this.password = password;
    }

	public void setId(String string) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
