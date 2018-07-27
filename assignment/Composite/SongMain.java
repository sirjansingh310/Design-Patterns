package assignment.Composite;
public class SongMain {
    public static void main(String args[]){
     SongComponent allSongs = new SongGroup("all Songs List");
     SongComponent currentTrending = new SongGroup("Currently Trending");
     allSongs.add(currentTrending);
     currentTrending.add(new Song("In My feelings"));
     currentTrending.add(new Song("One Kiss"));
     currentTrending.add(new Song("Girls like you"));
     SongComponent indiaTrending = new SongGroup("Currently Trending in India");
     indiaTrending.add(new Song("Tarefaan"));
     indiaTrending.add(new Song("Bom Diggy "));
     currentTrending.add(indiaTrending);
     allSongs.displayInfo();
    }
}

