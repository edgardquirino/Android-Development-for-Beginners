package breast.analysis.com.gopink;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

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
        View myInflatedView = inflater.inflate(R.layout.fragment_self_exam, container,false);
        //Get TextView to set instruction message
        TextView instructionTextView = (TextView) myInflatedView.findViewById(R.id.instructionTextView);


        return myInflatedView;
    }
    public void setInstructionImage(ImageView imgView,int step){
        switch (step){
            case 1:
                imgView.setImageResource(R.drawable.step1);
                break;
            case 2:
                imgView.setImageResource(R.drawable.step2_3);
                break;
            case 3:
                imgView.setImageResource(R.drawable.step2_3);
                break;
            case 4:
                imgView.setImageResource(R.drawable.step4);
                break;
            case 5:
                imgView.setImageResource(R.drawable.step5);
                break;
        }
    }

    public void setActionBarTitle(int step){
        SelfExamActivity activity = ((SelfExamActivity) getActivity());

        switch (step){
            case 1:
                activity.setActionBarTitle(R.string.stepOne_actionBar);
                break;
            case 2:
                activity.setActionBarTitle(R.string.stepOne_actionBar);
                break;
            case 3:
                activity.setActionBarTitle(R.string.stepOne_actionBar);
                break;
            case 4:
                activity.setActionBarTitle(R.string.stepOne_actionBar);
                break;
            case 5:
                activity.setActionBarTitle(R.string.stepOne_actionBar);
                break;
        }
    }

    public void setInstructionMessage(TextView txtView, int step){
        switch (step){
            case 1:
                txtView.setText(R.string.stepone);
                break;
            case 2:
                txtView.setText(R.string.stepone);
                break;
            case 3:
                txtView.setText(R.string.stepone);
                break;
            case 4:
                txtView.setText(R.string.stepone);
                break;
            case 5:
                txtView.setText(R.string.stepone);
                break;
        }
    }


}
