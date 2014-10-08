package com.example.bfinerocks.tictactoe;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link WelcomeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link WelcomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class WelcomeFragment extends Fragment implements View.OnClickListener {
    private OnFragmentInteractionListener mListener;
    EditText mPlayer1Name;
    EditText mPlayer2Name;
    Button mPlayButton;

    private static final String ARG_PARAM1 = "something";
    private static final String ARG_PARAM2 = "other";

    private String mSomething;
    private String mOther;

    public static WelcomeFragment newInstance(String something, String other) {
        WelcomeFragment fragment = new WelcomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, something);
        args.putString(ARG_PARAM2, other);
        fragment.setArguments(args);
        return fragment;
    }


    public WelcomeFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mSomething = getArguments().getString(ARG_PARAM1);
            mOther = getArguments().getString(ARG_PARAM2);

        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = null;
        view = inflater.inflate(R.layout.fragment_welcome, container, false);
        mPlayer1Name = (EditText) view.findViewById(R.id.player1);
        mPlayer2Name = (EditText) view.findViewById(R.id.player2);
        mPlayButton = (Button) view.findViewById(R.id.playbutton);

        mPlayButton.setOnClickListener(this);



        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onClick(View view) {

    }

    public interface OnFragmentInteractionListener {

        public void onFragmentInteraction(Uri uri);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

}












