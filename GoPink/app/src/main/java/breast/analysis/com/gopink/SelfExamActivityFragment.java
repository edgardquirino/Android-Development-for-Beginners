package breast.analysis.com.gopink;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SelfExamActivityFragment extends Fragment {
    public SelfExamActivityFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_self_exam, container, false);
        return myInflatedView;
    }

    public void setResources(int step, ImageView imgView) {
        setActionBarTitle(step);
        setInstructionImage(imgView, step);
    }

    private void setInstructionImage(ImageView imgView, int step) {
        switch (step) {
            case 1:
                imgView.setImageResource(R.drawable.step1withtext);
                break;
            case 2:
                imgView.setImageResource(R.drawable.step2withtext);
                break;
            case 3:
                imgView.setImageResource(R.drawable.step3withtext);
                break;
            case 4:
                imgView.setImageResource(R.drawable.step4withtext);
                break;
            case 5:
                imgView.setImageResource(R.drawable.step5withtext);
                break;
            case 6:
                imgView.setImageResource(R.drawable.earlydetection);
                break;
        }
    }

    private void setActionBarTitle(int step) {
        SelfExamActivity activity = ((SelfExamActivity) getActivity());

        switch (step) {
            case 1:
                activity.setActionBarTitle(R.string.stepOne_actionBar);
                break;
            case 2:
                activity.setActionBarTitle(R.string.stepTwo_actionBar);
                break;
            case 3:
                activity.setActionBarTitle(R.string.stepThree_actionBar);
                break;
            case 4:
                activity.setActionBarTitle(R.string.stepFour_actionBar);
                break;
            case 5:
                activity.setActionBarTitle(R.string.stepFive_actionBar);
                break;
            case 6:
                activity.setActionBarTitle(R.string.endTutorial_actionBar);
                break;
        }
    }


}
