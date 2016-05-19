package lebui.countries;

import android.content.Intent;
import android.os.Build;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class DetailActivity extends AppCompatActivity {

    private Country mCountry;
    private Toolbar mToolbar;
    private CollapsingToolbarLayout mCollapsingToolbarLayout;
    private ImageView mCountryImage;
    private ImageView mCountryFlag;
    private TextView mPopulationTextView;
    private TextView mAreaTextView;
    private TextView mLanguageTextView;
    private TextView mOverviewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= 21) {
            Transition transition = TransitionInflater.from(this)
                    .inflateTransition(R.transition.transition_country_image);
            getWindow().setSharedElementEnterTransition(transition);
        }

        setContentView(R.layout.activity_detail);

        setupWidget();
        setupToolbar();

        Intent intent = getIntent();
        if (intent != null) {
            int position = intent.getIntExtra(MainActivity.EXTRA_COUNTRY_POSITION, -1);
            if (position != -1) {
                mCountry = Global.mSimpleDataAccessor.getCountries().get(position);
                DisplayCountry(mCountry);
            }
        }
    }


    private void setupWidget() {
        mCollapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        mCountryImage = (ImageView) findViewById(R.id.country_image);
        mCountryFlag = (ImageView) findViewById(R.id.country_flag);
        mPopulationTextView = (TextView) findViewById(R.id.population_textview);
        mAreaTextView = (TextView) findViewById(R.id.area_textview);
        mLanguageTextView = (TextView) findViewById(R.id.language_textview);
        mOverviewTextView = (TextView) findViewById(R.id.overview_textview);
    }

    private void setupToolbar() {
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void DisplayCountry(Country country) {
        String population = NumberFormat.getNumberInstance(Locale.US).format(country.getPopulation());

        String area = NumberFormat.getNumberInstance(Locale.US).format(country.getArea()) + " km\u00b2";

        String[] languages = country.getLanguage();
        String language = languages[0];
        for (int i = 1; i < languages.length; i++) {
            language += ", " + languages[i];
        }

        mCountryFlag.setImageResource(country.getFlagResourceId());
        mCountryImage.setImageResource(country.getImageResourceId());
        mCollapsingToolbarLayout.setTitle(country.getName());
        mPopulationTextView.setText(population);
        mAreaTextView.setText(area);
        mLanguageTextView.setText(language);
        mOverviewTextView.setText(country.getOverview());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
