package breast.analysis.com.gopink;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.ImageView;

public class SelfExamActivity extends AppCompatActivity {
    int fragmentStep = 1;
    private float x1, x2;
    private static final int MIN_DISTANCE = 150;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_exam);
        setTutorialStep(fragmentStep);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_self_exam, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setActionBarTitle(int title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                x1 = event.getX();
                break;
            case MotionEvent.ACTION_UP:
                x2 = event.getX();
                float deltaX = x2 - x1;
                if (Math.abs(deltaX) > MIN_DISTANCE) {
                    Log.i("COUNTER",String.valueOf(fragmentStep));
                    // Left to Right swipe action
                    if (x2 > x1) {
                        fragmentStep = fixTutorialStepCounter(--fragmentStep);
                        setTutorialStep(fragmentStep);
                    }

                    // Right to left swipe action
                    else {
                        fragmentStep=fixTutorialStepCounter(++fragmentStep);
                        setTutorialStep(fragmentStep);

                    }
                } else {
                    // consider as something else - a screen tap for example
                }
                break;
        }
        return super.onTouchEvent(event);
    }

    private void setTutorialStep(int tutorialStep) {
        ImageView instructionImageView = (ImageView) findViewById(R.id.instructionImageView);
        SelfExamActivityFragment fragment = (SelfExamActivityFragment) getSupportFragmentManager().findFragmentById(R.id.breastAnalysisFragment);
        fragment.setResources(tutorialStep, instructionImageView);
    }

    private int fixTutorialStepCounter(int counter) {
        if (counter > 6) counter = 1;
        else if (counter < 1) counter = 1;
        return counter;
    }

}
