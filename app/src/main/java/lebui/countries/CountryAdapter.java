package lebui.countries;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {
    private Context mContext;
    private List<Country> mCountryList;
    private CountryClickListener mCountryClickListener;

    public interface CountryClickListener {
        void onCountryClick(View view, int position);
    }

    public CountryAdapter(List<Country> movies, Context context) {
        this.mCountryList = movies;
        this.mContext = context;
    }

    public void setCountryClickListener(CountryClickListener CountryClickListener) {
        mCountryClickListener = CountryClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_country, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Country Country = mCountryList.get(position);
        holder.mCountryImage.setImageResource(Country.getImageResourceId());
        holder.mCountryName.setText(Country.getName());

        Bitmap photo = BitmapFactory.decodeResource(mContext.getResources(), Country.getImageResourceId());

        Palette.generateAsync(photo, new Palette.PaletteAsyncListener() {
            public void onGenerated(Palette palette) {
                int bgColor = palette.getMutedColor(0x000000);
                holder.mCountryInfoContainer.setBackgroundColor(bgColor);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mCountryList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ViewGroup mCountryInfoContainer;
        public ImageView mCountryImage;
        public TextView mCountryName;

        public ViewHolder(View view) {
            super(view);
            mCountryImage = (ImageView)view.findViewById(R.id.country_image);
            mCountryName = (TextView)view.findViewById(R.id.country_name);
            mCountryInfoContainer = (ViewGroup)view.findViewById(R.id.country_info_container);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mCountryClickListener.onCountryClick(view, getAdapterPosition());
                }
            });
        }
    }
}