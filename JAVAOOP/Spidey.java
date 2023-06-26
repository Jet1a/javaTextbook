package JAVAOOP;

public class Spidey extends SuperHero implements SkillHero {

    public void skill(String skill){
        System.out.println("Skill : "+skill);
    }
    public void speed(String speed){
        System.out.println("Speed : "+speed);
    }
    public void weapon(String weapon){
        System.out.println("Weapon : "+weapon);
    }
    public void jumping(String jump){
        System.out.println("Jump : "+jump);
    }
}
