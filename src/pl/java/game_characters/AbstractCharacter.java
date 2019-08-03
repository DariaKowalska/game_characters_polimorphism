package pl.java.game_characters;

public abstract class AbstractCharacter implements Fight {

    String name;
    String age;
    int lenght;
    int power;
    int protect;
    int kindOfPower;

    @Override
    public String toString() {
        return "AbstractCharacter{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", lenght=" + lenght +
                ", power=" + power +
                ", protect=" + protect +
                ", kind of power=" + kindOfPower +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }

    public int getKindOfPower() {
        return kindOfPower;
    }

    public void setKindOfPower(int moc) {
        this.kindOfPower = kindOfPower;
    }
}

