package com.example.kacyn.displayjokelib;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DisplayJokeActivityFragment extends Fragment {

    public DisplayJokeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.display_fragment_main, container, false);

        Bundle args = getArguments();

        TextView jokeView = (TextView) root.findViewById(R.id.joke_display);

        if(args != null) {
            jokeView.setText(getArguments().getString(getString(R.string.joke_key)));
        }

        return root;
    }
}
