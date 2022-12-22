public class Main {
    private String name;

    public String getter(){
        return name;
    }
    public void setter(String value){
        this.name = value;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.setter("yourName");
        System.out.println("name: "+obj.getter());
    }
}