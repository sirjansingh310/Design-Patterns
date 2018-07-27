package assignment.Composite;

public class Song extends SongComponent {
    String name;
    Song(String name){
        this.name = name;
    }
    public String getSongName() {
        return name;
    }

    @Override
    public void displayInfo() {
        System.out.println(getSongName());
    }
}
