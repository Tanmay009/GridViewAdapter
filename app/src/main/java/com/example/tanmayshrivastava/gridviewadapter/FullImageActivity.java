package com.example.tanmayshrivastava.gridviewadapter;



        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.ImageView;

        import com.squareup.picasso.Picasso;

public class FullImageActivity extends Activity {
    ImageView ivImageFromUrl;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fullimage);

        // get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);

        ivImageFromUrl = (ImageView)findViewById(R.id.imageview2);

        Picasso.with(getApplicationContext()).load("http://image.tmdb.org/t/p/w185//nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg ").into(ivImageFromUrl);

    }

}