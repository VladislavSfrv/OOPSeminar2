package sample1;

public class Animal {
    private String name;

    public void voice(){
        System.out.println("Животное подает голос");
    }

    public void jump(){
        System.out.println("Животное подпрыгнуло");
    }

    public String getName() {
        return name;
    }
    public Animal(String name){
        this.name = name;
    }

    public Animal(){

    }

    public void setName(String name){
        this.name = name;
    }


}
