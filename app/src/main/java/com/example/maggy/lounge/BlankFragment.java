package com.example.maggy.lounge;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    ImageView image, iv2, iv3, iv4;

    ViewPager viewPager;
    int[] photo = {R.drawable.viewpager, R.drawable.viewpager, R.drawable.viewpager};
    TextView textVp;
    TextView tittleVp;


    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate( R.layout.fragment_blank, container, false );

        viewPager = view.findViewById( R.id.view_pager );
        textVp = view.findViewById( R.id.text_vp );
        tittleVp = view.findViewById( R.id.title_vp );

        image = view.findViewById( R.id.image );
        iv2 = view.findViewById( R.id.iv_2 );
        iv3 = view.findViewById( R.id.iv_3 );
        iv4 = view.findViewById( R.id.iv_4 );

        image.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getContext(), Activity2.class );
                startActivity( intent );
            }
        } );
        iv2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getContext(), Activity2.class );
                startActivity( intent );
            }
        } );

        iv3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getContext(), Activity2.class );
                startActivity( intent );
            }
        } );
        iv4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getContext(), Activity2.class );
                startActivity( intent );
            }
        } );


        Adapt adapt = new Adapt( getActivity() );
        viewPager.setAdapter( adapt );
        if (container != null) container.removeAllViews();
        viewPager.setOnPageChangeListener( new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                if (i == 0) {

                    textVp.setText( "CHANEL INTRODUCES ITS BLACK CERAMIC CODE COCO TIMEPIECE WITH A CINEMATIC CHANEL CODE COCO RITZ FILM CAMPAIGN." );
                    tittleVp.setText( "A DAY AT THE RITZ WITH CHANEL" );


                }


            }

            @Override
            public void onPageSelected(int i) {


            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        } );


        if (container != null) {
            container.removeAllViews();
        }
        return view;
    }

    public class Adapt extends PagerAdapter {

        Context context;
        LayoutInflater inf = null;

        public Adapt(Context context) {
            this.context = context;
            inf = (LayoutInflater) context.getSystemService( context.LAYOUT_INFLATER_SERVICE );


        }

        @Override
        public int getCount() {
            return photo.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return view == (LinearLayout) o;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {

            View view = inf.inflate( R.layout.view_pager_row, container, false );

            ImageView imageView = view.findViewById( R.id.vp_photo );

            imageView.setImageResource( photo[position] );

            container.addView( view );


            return view;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView( (LinearLayout) object );

        }
    }

}
