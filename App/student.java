public class student {
    private int id;
    private String name;

    public student(int id, String name){
        this.id=id;
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setId(int id){
        this.id=id;
    }

    

    
}
