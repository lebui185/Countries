package lebui.countries;

public class Country {
    private int mImageResourceId;
    private int mFlagResourceId;
    private String mName;
    private int mPopulation;
    private double mArea;
    private String[] mLanguage;
    private String mOverview;

    // constructor and getters setters...

    public Country(int imageResourceId,
                   int flagResourceId,
                   String name,
                   int population,
                   double area,
                   String[] language,
                   String overview)
    {
        mArea = area;
        mOverview = overview;
        mFlagResourceId = flagResourceId;
        mLanguage = language;
        mName = name;
        mPopulation = population;
        mImageResourceId = imageResourceId;
    }

    public double getArea() {
        return mArea;
    }

    public void setArea(double area) {
        mArea = area;
    }

    public String getOverview() {
        return mOverview;
    }

    public void setOverview(String overview) {
        mOverview = overview;
    }

    public int getFlagResourceId() {
        return mFlagResourceId;
    }

    public void setFlagResourceId(int flagResourceId) {
        mFlagResourceId = flagResourceId;
    }

    public String[] getLanguage() {
        return mLanguage;
    }

    public void setLanguage(String[] language) {
        mLanguage = language;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getPopulation() {
        return mPopulation;
    }

    public void setPopulation(int population) {
        mPopulation = population;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        mImageResourceId = imageResourceId;
    }
}
