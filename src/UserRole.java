public enum UserRole {

    STUDENT,
    TEACHER,
    ADMINISTRATOR;

    public String getTranslated() {
        switch (this) {
            case STUDENT:
                return "Student";
            case TEACHER:
                return "Nauczyciel";
            case ADMINISTRATOR:
                return "Administrator";
        }
        throw new RuntimeException("Not supported");
    }

}
