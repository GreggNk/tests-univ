public enum AdministratorMenuItem {

    USER_LIST(1),

    EXIT(2);

    private int nr;

    AdministratorMenuItem(int nr) {
        this.nr = nr;
    }

    public static AdministratorMenuItem ofNr(int nr) {
        AdministratorMenuItem[] items = values();
        for (AdministratorMenuItem item: items) {
            if (item.nr == nr) {
                return item;
            }
        }
        return AdministratorMenuItem.EXIT;
    }

    public String getTranslated() {
        switch (this) {
            case USER_LIST:
                return "lista użytkowników";
            case EXIT:
                return "wyjście z programu";
        }
        throw new RuntimeException("Not supported");
    }

    public int getNr() {
        return nr;
    }

}
