class Employee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
}
public class GettersSetters {
    public static void main(String[] args) {
        Employee vaibhav = new Employee();
        vaibhav.setName("Vaibhav Talkhande");
        vaibhav.setId(1);
        System.out.println(vaibhav.getName());
        System.out.println(vaibhav.getId());
    }
}
