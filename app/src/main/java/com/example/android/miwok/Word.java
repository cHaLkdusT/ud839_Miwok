package com.example.android.miwok;

/**
 * Created by jlundang on 25/08/2016.
 */
public class Word {
    /** Miwok translation for the word */
    private String mMiwokTranslation;
    /** Default translation for the word */
    private String mDefaultTranslation;
    /** Image resource ID */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    /** Audio resource ID */
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,
                int audioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioResourceId = audioResourceId;
    }

    /**
     * Get the Miwok translation of the word
     * @return
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * We don't want this to be called outside this class
     * @param mMiwokTranslation Miwok word
     */
    private void setMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    /**
     * Get the default translation of the word
     * @return
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * We don't want this to be called outside this class
     * @param mDefaultTranslation Default word
     */
    private void setDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    /**
     * Get the image resource id for this word
     * @return
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * We don't want this to be called outside this class
     * @param mImageResourceId Image resource ID
     */
    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word
     * @return
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the audio resource id for this word
     * @return
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     * We don't want this to be called outside this class
     * @param mAudioResourceId
     */
    public void setAudioResourceId(int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
    }
}
