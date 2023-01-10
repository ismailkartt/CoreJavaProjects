package SimpleGame;

public class Main {
    public static void main(String[] args) {

          Player1 player = new Player1("Abhay","sword",100);
//        System.out.println(player.getName());
//        System.out.println(player.getHealth());
//        System.out.println(player.getWeapon());

          player.damageByGun1();
          player.damageByGun1();
          player.heal();
          player.damageByGun2();
          Player2 player2 = new Player2("Abc","sword",100,true);
          player2.damageByGun1();
          player2.heal();
    }
}
