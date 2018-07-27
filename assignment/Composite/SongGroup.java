package assignment.Composite;

import java.util.ArrayList;

public class SongGroup extends SongComponent {
    private String groupName;
    SongGroup(String groupName){
        this.groupName = groupName;
    }
    public String getGroupName(){
        return groupName;
    }
    ArrayList<SongComponent> group = new ArrayList<>();
    @Override
    public void add(SongComponent newSongComponent) {
        group.add(newSongComponent);
    }

    @Override
    public void remove(SongComponent songComponent) {
        int index = group.indexOf(songComponent);
        group.remove(index);
    }

    @Override
    public SongComponent getSongComponent(int index) {
     return group.get(index);
    }

    @Override
    public void displayInfo() {
        System.out.println("Group name :"+getGroupName()+"\n"+"Here is the list of songs/groups in this group\n");
        for(int i=0;i<group.size();i++){
            group.get(i).displayInfo();
        }

    }
}
