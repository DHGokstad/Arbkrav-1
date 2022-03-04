class Person{
    private final int id;
    private final String name;
    private final int yearOfBirth;

    Person(int id, String name, int yearOfBirth){
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    @Override
    public String toString(){
        String output =
                "Person" + System.lineSeparator() +
                "    id: " + id + System.lineSeparator() +
                "    Name: " + name + System.lineSeparator() +
                "    Year of birth: " + yearOfBirth;

        return output;
    }
}
