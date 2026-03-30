package module2.lesson18;

public class Example4 {
}

@Person(live = 90, strength = 10, defense = 99)
class Elf {

}

@interface Person {
    String name() default "";
    int live();
    int strength();
    int magic() default 0;
    int attack() default 0;
    int defense();
}
