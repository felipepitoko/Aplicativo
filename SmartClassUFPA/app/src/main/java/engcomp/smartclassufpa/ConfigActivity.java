package engcomp.smartclassufpa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_white_24dp);
        actionBar.setDisplayHomeAsUpEnabled(true);

        // CONFIGURAÇÕES E SOBRE NÃO POSSUEM NAVIGATION DRAWER

    }

    // SEMPRE SOBRESCREVER ESSE MÉTODO EM SOBRE E CONFIG
    @Override
    public void onBackPressed(){

        // ISSO AQUI É IMPORTANTE PARA QUE QUANDO O USARIO APERTE O BOTAO
        //VOLTAR O APP VOLTE SEMPRE PARA A TELA INICIAL

        super.onBackPressed();
        Intent intent = new Intent(this, InicioActivity.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
            }
        return super.onOptionsItemSelected(item);
    }


}
