public abstract class BaseView {

    public void run() {
        System.out.println("======================================");
        System.out.println("====== "+getTitle()+" ======");
        System.out.println("======================================");
        initialize();
    }

    protected abstract void initialize();

    protected abstract String getTitle();

}
