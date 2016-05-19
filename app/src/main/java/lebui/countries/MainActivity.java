package lebui.countries;

import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity implements CountryAdapter.CountryClickListener {

    private List<Country> mCountries;
    private RecyclerView mCountriesRecyclerView;
    private Toolbar mToolbar;

    public static final String EXTRA_COUNTRY_POSITION = "EXTRA_COUNTRY_POSITION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= 21) {
            Transition transition = TransitionInflater.from(this)
                    .inflateTransition(R.transition.transition_country_image);
            getWindow().setSharedElementExitTransition(transition);
        }

        setContentView(R.layout.activity_main);

        setupWidget();
        setupToolbar();
        setupCountriesList();
    }

    private void setupWidget() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mCountriesRecyclerView = (RecyclerView) findViewById(R.id.countries_recycler_view);
    }

    private void setupToolbar() {
        setSupportActionBar(mToolbar);
    }

    private void setupCountriesList() {
        mCountries = Global.mSimpleDataAccessor.getCountries();
        CountryAdapter adapter = new CountryAdapter(mCountries, this);
        adapter.setCountryClickListener(this);
        mCountriesRecyclerView.setAdapter(adapter);
        mCountriesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onCountryClick(View view, int position) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(EXTRA_COUNTRY_POSITION, position);

        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(getString(R.string.country_image_tname));
            ActivityOptionsCompat activityOptionsCompat =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(this, view, view.getTransitionName());
            startActivity(intent, activityOptionsCompat.toBundle());
        }
        else {
            startActivity(intent);
        }
    }
}