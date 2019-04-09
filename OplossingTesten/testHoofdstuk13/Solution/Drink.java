package Solution;

public abstract class Drink implements Orderable {
        String name;

        public Drink(){

        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drink(String name) {
        this.name = name;
    }
}
