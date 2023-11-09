package Lab3;

public class Decanat {
    private String NameFaculty;
    private int Room;
    private int corps;
    private long Telephone;
    private String NameDean;
    public Decanat(String NameFaculty, int Room, int corps, long Telephone, String NameDean){
        this.NameFaculty = NameFaculty;
        this.Room = Room;
        this.corps = corps;
        this.Telephone = Telephone;
        this.NameDean = NameDean;
    }
    public void setNameFaculty(String nameFaculty) {
        NameFaculty = nameFaculty;
    }
    public String getNameFaculty() {
        return NameFaculty;
    }
    public void setRoom(int room) {
        Room = room;
    }
    public int getRoom() {
        return Room;
    }
    public void setCorps(int corps) {
        this.corps = corps;
    }
    public int getCorps() {
        return corps;
    }
    public void setTelephone(int telephone) {
        Telephone = telephone;
    }
    public long getTelephone() {
        return Telephone;
    }
    public void setNameDean(String nameDean) {
        NameDean = nameDean;
    }
    public String getNameDean() {
        return NameDean;
    }

    @Override
    public String toString() {
        return ("Факультет " + NameFaculty + " будет проводить встречу в " + Room + " аудитории, в " + corps + " корпусе.\n" + "Декан: " + NameDean + "\nКонтактный телефон: " + Telephone);
    }
}
