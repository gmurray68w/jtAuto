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

 */
public class FragmentEmergency3 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final int ARG_SECTION_NUMBER = 3;


    // TODO: Rename and change types of parameters
    private String mParam1;

    public FragmentEmergency3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentEmergency3 newInstance(String ARG_SECTION_NUMBER) {
        FragmentEmergency3 fragment = new FragmentEmergency3();
        Bundle args = new Bundle();
        args.putInt(String.valueOf(ARG_SECTION_NUMBER), 3);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(String.valueOf(ARG_SECTION_NUMBER));

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_emergency4, container, false);
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
