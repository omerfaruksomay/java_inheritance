public class Student {
    private String name;
    private String surname;
    private String Id;
    private String address;

    private int note;

    public Student(String name, String surname, String id, String address, int note) {
        this.name = name;
        this.surname = surname;
        Id = id;
        this.address = address;
        if (note < 0 || note > 100) {
            note = 0;
        }
        this.note = note;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNote() {

        return note;
    }

    public void setNote(int note) {
        if (note < 0 || note > 100) {
            note = 0;
        }
        this.note = note;
    }
}
