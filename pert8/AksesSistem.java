public interface AksesSistem {
    // METHOD ABSTRAK
    void login(String pin); // [cite: 31]
    void logout(); // [cite: 31]

    // DEFAULT METHOD
    default String getRoleAkses() {
        return "Staff Biasa"; // [cite: 31]
    }
}