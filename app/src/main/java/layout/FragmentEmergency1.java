package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.murraystudios.graham.jtauto.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {} interface
 * to handle interaction events.
 * Use the {@link FragmentEmergency1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentEmergency1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final int ARG_SECTION_NUMBER = 1;
    

    // TODO: Rename and change types of parameters
    private int mParam1;
    



    public FragmentEmergency1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     *
     * @return A new instance of fragment FragmentEmergency1.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentEmergency1 newInstance(String ARG_SECTION_NUMBER) {
        FragmentEmergency1 fragment = new FragmentEmergency1();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, 1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(String.valueOf(ARG_SECTION_NUMBER));

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_emergency1, container, false);
    }




    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }


}
