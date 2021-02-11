    public class ogrenci {
    private int id;
    private String name;
    private String surname;
    private int TCKN;
    private int password;
    
    
    
    public ogrenci(int id, String name, String surname, int password, int TCKN) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password=password;  
        this.TCKN=TCKN;
    }

    public int getId() {
        return id;
    }

    public int getTCKN() {
        return TCKN;
    }

    public void setTCKN(int tckn) {
        this.TCKN = TCKN;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

     public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
   
    
            
}
