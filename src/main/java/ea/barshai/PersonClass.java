package ea.barshai;

public class PersonClass {

  private final String name;
  private final byte age;
  private final Mood mood;

  public String getName() {
    return name;
  }

  public byte getAge() {
    return age;
  }

  public Mood getMood() {
    return mood;
  }

  public PersonClass(String name, byte age, Mood mood) {
    this.name = name;
    this.age = age;
    this.mood = mood;
  }
}
