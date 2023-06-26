package JAVAOOP;
//estends ไม่สามารถใช้แม่สองอันได้ ต้อง implements
public class Ironman extends SuperHero implements SkillHero{
    public void skill(String skill){
        System.out.println("Skill : "+skill);
    }
    public void speed(String speed){

    }
    public void weapon(String weapon){

    }
    public void jumping(String jump){

    }
}
