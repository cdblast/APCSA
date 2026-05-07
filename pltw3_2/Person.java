public class Person {
    private int age;
    private String name;
    private boolean living;

    public Person() {
        age = 0;
        name = "No Name";
        living = false;
}
    public Person(int ageInput, String nameInput, boolean livingInput){
        age = ageInput;
        name = nameInput;
        living = livingInput;
    }

    public String getName(){
        return name;
    }
}
