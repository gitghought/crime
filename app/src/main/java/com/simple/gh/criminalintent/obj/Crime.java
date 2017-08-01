package com.simple.gh.criminalintent.obj;

import android.provider.ContactsContract;

import com.simple.gh.criminalintent.CrimeActivity;

import java.util.Date;
import java.util.UUID;

/**
 * Created by gh on 2017-08-01.
 */

public class Crime {
    private UUID mUID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Crime() {
        this.mDate = new Date();
    }
}
