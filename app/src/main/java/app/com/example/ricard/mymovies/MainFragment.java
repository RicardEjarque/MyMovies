package app.com.example.ricard.mymovies;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by Ricard on 26/11/2016.
 */

public class MainFragment extends Fragment {

    public MainFragment(){

    }

    private final String LOG_TAG = MainFragment.class.getSimpleName();
    private ImageAdapter mImageAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);




        mImageAdapter = new ImageAdapter(this.getActivity());

        GridView gridview = (GridView) rootView.findViewById(R.id.Movies_Grid_View);

        gridview.setAdapter(mImageAdapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Object text = mImageAdapter.getItem(position);
                int duration = Toast.LENGTH_SHORT;
                //Toast toast = Toast.makeText(getActivity(), text, duration);
                //toast.show();
                // Intent detailsViewAct = new Intent(getActivity(), DetailActivity.class).putExtra(Intent.EXTRA_TEXT, text);
                //startActivity(detailsViewAct);
            }
        });
        return rootView;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Add this line in order for this fragment to handle menu events.
        setHasOptionsMenu(true);


    }

    @Override
    public void onStart(){
        //updatewWeather();
        super.onStart();
    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //inflater.inflate(R.menu.forecastfragment, menu);

    }


}
