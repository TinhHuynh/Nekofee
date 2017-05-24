package com.huynhtinh.android.nekofee.controler.fragment;

import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;

/**
 * Created by TINH HUYNH on 5/24/2017.
 */

public class ListCafeFragment extends Fragment {
    private static final String TAG = "ListCafeFragment";

    private static final String KEY_CURRENT_LOCATION = "currentLocationKey";

    private Location mCurrentLocation;

    public static ListCafeFragment newInstance(Location currentLocation) {

        Bundle args = new Bundle();
        args.putParcelable(KEY_CURRENT_LOCATION, currentLocation);
        ListCafeFragment fragment = new ListCafeFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            return;
        }
        mCurrentLocation = getArguments().getParcelable(KEY_CURRENT_LOCATION);
        Log.i(TAG, "Received location: lat=" + mCurrentLocation.getLatitude()
                + " ,Lon=" + mCurrentLocation.getLongitude());
    }
}
