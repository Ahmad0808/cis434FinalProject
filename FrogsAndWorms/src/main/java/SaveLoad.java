import java.io.*;

public class SaveLoad {

    Player player;

    SaveLoad(Player p)
    {
        player = p;
    }

    public void Save()
    {
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("save.dat")));

            Save save = new Save();
            save.locationID = player.locationID;
            save.enemiesDefeated = player.enemiesDefeated;
            save.intelligence = player.intelligence;
            save.level = player.level;
            save.luck = player.luck;
            save.skillPoints = player.skillPoints;
            save.strength = player.strength;
            save.swordRepair = player.swordRepair;

            oos.writeObject(save);
        } catch (Exception e){
            System.out.println("File error");
        }
    }

    public void Load(){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("save.dat")));
            Save save = (Save)ois.readObject();

            player.locationID = save.locationID;
            player.enemiesDefeated = save.enemiesDefeated;
            player.intelligence = save.intelligence;
            player.level = save.level;
            player.luck = save.luck;
            player.skillPoints = save.skillPoints;
            player.strength = save.strength;
            player.swordRepair = save.swordRepair;
        } catch (Exception e){
            System.out.println("File error");
        }
    }
}
