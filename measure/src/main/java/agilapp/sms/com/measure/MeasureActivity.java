package agilapp.sms.com.measure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MeasureActivity extends AppCompatActivity {
    Toolbar measureToolbar;
    @Override
    public void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_measure);
        measureToolbar= (Toolbar)findViewById(R.id.measure_toolbar);
        setSupportActionBar(measureToolbar);
        measureToolbar.setTitle(R.string.measure_module_title);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search_measurement:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_measure_action_bar,menu);
        MenuItem search =menu.findItem(R.id.action_search_measurement);
        SearchView searchView= (SearchView)search.getActionView();
        //inserire la ricerca

        return super.onCreateOptionsMenu(menu);
    }
}
