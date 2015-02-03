package test.nice.testproject;

/**
 * Created by jordan_terry on 03/02/2015.
 */
public class TextSwapper {
    private String mBeforeText, mAfterText, mCurrentText;


    public TextSwapper(String beforeText, String afterText) {
        mBeforeText = beforeText;
        mAfterText = afterText;
        mCurrentText = mBeforeText;
    }

    public String swap() {
        mCurrentText = getCurrentText().equals(mBeforeText) ? mAfterText : mBeforeText;
        return mCurrentText;
    }

    public String getCurrentText() {
        return mCurrentText;
    }

}
