package exam.dialogfragmenttest;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
	Button btnDialogFragment;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        btnDialogFragment = (Button) findViewById(R.id.btnShowDialog);
        
        btnDialogFragment.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				FragmentManager fm = getFragmentManager();
				MyDialogFragment myFrag = new MyDialogFragment();
				myFrag.show(fm, "sdfa");
			}
		});
    }


}
