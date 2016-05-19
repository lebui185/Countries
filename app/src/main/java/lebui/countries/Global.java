package lebui.countries;

public class Global {
    public static SimpleDataAccessor mSimpleDataAccessor;

    static {
        mSimpleDataAccessor = new SimpleDataAccessor();
        mSimpleDataAccessor.loadData();
    }
}
