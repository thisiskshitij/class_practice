class Employee {
    String name;
    int age;
    String address;

    Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void showInfo() {
        System.out.println("Name: " + name + "\tAge: " + age + "\tAddress: " + address);
    }
    protected void finalize(){
        
    }
}